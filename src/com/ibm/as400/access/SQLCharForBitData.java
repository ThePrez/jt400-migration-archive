///////////////////////////////////////////////////////////////////////////////
//                                                                             
// JTOpen (IBM Toolbox for Java - OSS version)                                 
//                                                                             
// Filename: SQLCharForBitData.java
//                                                                             
// The source code contained herein is licensed under the IBM Public License   
// Version 1.0, which has been approved by the Open Source Initiative.         
// Copyright (C) 1997-2003 International Business Machines Corporation and     
// others. All rights reserved.                                                
//                                                                             
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

class SQLCharForBitData
implements SQLData
{
    private static final String copyright = "Copyright (C) 1997-2003 International Business Machines Corporation and others.";

    private SQLConversionSettings   settings_;
    private int                     maxLength_;
    private int                     truncated_;
    private AS400ByteArray          typeConverter_;
    private byte[]                  value_;

    SQLCharForBitData(int maxLength, SQLConversionSettings settings)
    {
        settings_       = settings;
        maxLength_      = maxLength;
        truncated_      = 0;
        typeConverter_  = new AS400ByteArray(maxLength);
        value_          = new byte[maxLength];
    }

    public Object clone()
    {
        return new SQLCharForBitData(maxLength_, settings_);
    }

    //---------------------------------------------------------//
    //                                                         //
    // CONVERSION TO AND FROM RAW BYTES                        //
    //                                                         //
    //---------------------------------------------------------//

    public void convertFromRawBytes(byte[] rawBytes, int offset, ConvTable ccsidConverter) //@P0C
    throws SQLException
    {
        value_ = (byte[])typeConverter_.toObject(rawBytes, offset);
    }

    public void convertToRawBytes(byte[] rawBytes, int offset, ConvTable ccsidConverter) //@P0C
    throws SQLException
    {
        typeConverter_.toBytes(value_, rawBytes, offset);
    }

    //---------------------------------------------------------//
    //                                                         //
    // SET METHODS                                             //
    //                                                         //
    //---------------------------------------------------------//

    public void set(Object object, Calendar calendar, int scale)
    throws SQLException
    {
        if(object instanceof String)
            value_ = SQLBinary.stringToBytes((String)object);                       // @F1A

        else if(object instanceof byte[])
            value_ = (byte[])object;                                                // @C1C

        else if(object instanceof InputStream)
            value_ = JDUtilities.streamToBytes((InputStream)object, scale);

        else if(object instanceof Reader)
            value_ = SQLBinary.stringToBytes(JDUtilities.readerToString((Reader)object, scale));

        else if(JDUtilities.JDBCLevel_ >= 20 && object instanceof Blob)
            value_ = ((Blob)object).getBytes(1, (int)((Blob)object).length());      // @C1C @E2C Blobs are 1 based.

        else if(JDUtilities.JDBCLevel_ >= 20 && object instanceof Clob)
            value_ = SQLBinary.stringToBytes(((Clob)object).getSubString(1, (int)((Clob)object).length())); //@F1A

        else
            JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        

        // Set to the exact length.
        int valueLength = value_.length;
        if(valueLength < maxLength_)
        {
            byte[] newValue = new byte[maxLength_];
            System.arraycopy(value_, 0, newValue, 0, valueLength);
            value_ = newValue;
            truncated_ = 0;
        }
        else if(valueLength > maxLength_)
        {
            byte[] newValue = new byte[maxLength_];
            System.arraycopy(value_, 0, newValue, 0, maxLength_);
            value_ = newValue;
            truncated_ = valueLength - maxLength_;
        }
        else
            truncated_ = 0;
    }

    //---------------------------------------------------------//
    //                                                         //
    // DESCRIPTION OF SQL TYPE                                 //
    //                                                         //
    //---------------------------------------------------------//

    public String getCreateParameters()
    {
        return AS400JDBCDriver.getResource("MAXLENGTH");
    }

    public int getDisplaySize()
    {
        return maxLength_;
    }

    public String getLiteralPrefix()
    {
        return "X\'";
    }

    public String getLiteralSuffix()
    {
        return "\'";
    }

    public String getLocalName()
    {
        // Use "CHAR" not "BINARY".  See ODBC SQLGetTypeInfo().
        return "CHAR";
    }

    public int getMaximumPrecision()
    {
        return 32765;
    }

    public int getMaximumScale()
    {
        return 0;
    }

    public int getMinimumScale()
    {
        return 0;
    }

    public int getNativeType()
    {
        return 452;
    }

    public int getPrecision()
    {
        return maxLength_;
    }

    public int getRadix()
    {
        return 0;
    }

    public int getScale()
    {
        return 0;
    }

    public int getType()
    {
        return java.sql.Types.BINARY;
    }

    public String getTypeName()
    {
        return "CHAR() FOR BIT DATA";
    }

    public boolean isSigned()
    {
        return false;
    }

    public boolean isText()
    {
        return true;
    }

    public int getActualSize()
    {
        return value_.length;
    }

    //@F2A JDBC 3.0
    public String getJavaClassName()
    {
        return "[B";
    }

    public int getTruncated()
    {
        return truncated_;
    }

    //---------------------------------------------------------//
    //                                                         //
    // CONVERSIONS TO JAVA TYPES                               //
    //                                                         //
    //---------------------------------------------------------//

    public InputStream toAsciiStream()
    throws SQLException
    {
        // This is written in terms of toBytes(), since it will
        // handle truncating to the max field size if needed.
        
        // changed to return stream containing hex string
        // return new ByteArrayInputStream(toBytes());
        try
        {
            return new ByteArrayInputStream(ConvTable.getTable(819, null).stringToByteArray(SQLBinary.bytesToString(toBytes())));
        }
        catch(UnsupportedEncodingException e)
        {
            JDError.throwSQLException(this, JDError.EXC_INTERNAL, e);
            return null;
        }
    }

    public BigDecimal toBigDecimal(int scale)
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return null;
    }

    public InputStream toBinaryStream()
    throws SQLException
    {
        // This is written in terms of toBytes(), since it will
        // handle truncating to the max field size if needed.
        return new ByteArrayInputStream(toBytes());
    }

    public Blob toBlob()
    throws SQLException
    {
        // This is written in terms of toBytes(), since it will
        // handle truncating to the max field size if needed.
        return new AS400JDBCBlob(toBytes(), maxLength_);
    }

    public boolean toBoolean()
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return false;
    }

    public byte toByte()
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return -1;
    }

    public byte[] toBytes()
    {
        // Truncate to the max field size if needed.
        // Do not signal a DataTruncation per the spec. @B1A
        int maxFieldSize = settings_.getMaxFieldSize();
        if((value_.length > maxFieldSize) && (maxFieldSize > 0))
        {
            // @B1D truncated_ = value_.length - maxFieldSize;
            byte[] truncatedValue = new byte[maxFieldSize];
            System.arraycopy(value_, 0, truncatedValue, 0, maxFieldSize);
            return truncatedValue;
        }
        else
        {
            // @B1D truncated_ = 0;
            return value_;
        }
    }

    public Reader toCharacterStream()
    throws SQLException
    {
        // This is written in terms of toBytes(), since it will
        // handle truncating to the max field size if needed.
        //@F1D return new StringReader (new String(toBytes()));
        return new StringReader(SQLBinary.bytesToString(toBytes())); //@F1A
    }

    public Clob toClob()
    throws SQLException
    {
        // This is written in terms of toString(), since it will
        // handle truncating to the max field size if needed.
        //@F1D return new AS400JDBCClob(new String(toBytes()));
        return new AS400JDBCClob(SQLBinary.bytesToString(toBytes()), maxLength_); //@F1A
    }

    public Date toDate(Calendar calendar)
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return null;
    }

    public double toDouble()
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return -1;
    }

    public float toFloat()
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return -1;
    }

    public int toInt()
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return -1;
    }

    public long toLong()
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return -1;
    }

    public Object toObject()
    {
        // This is written in terms of toBytes(), since it will
        // handle truncating to the max field size if needed.
        return toBytes();
    }

    public short toShort()
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return -1;
    }

    public String toString()
    {
        // This is written in terms of toBytes(), since it will
        // handle truncating to the max field size if needed.
        //@F1D return new String (toBytes());
        return SQLBinary.bytesToString(toBytes()); //@F1A
    }

    public Time toTime(Calendar calendar)
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return null;
    }

    public Timestamp toTimestamp(Calendar calendar)
    throws SQLException
    {
        JDError.throwSQLException(this, JDError.EXC_DATA_TYPE_MISMATCH);
        return null;
    }

    public InputStream toUnicodeStream()
    throws SQLException
    {
        // This is written in terms of toBytes(), since it will
        // handle truncating to the max field size if needed.

        // changed to return stream containing hex string
        // return new ByteArrayInputStream(toBytes());
        try
        {
            return new ByteArrayInputStream(ConvTable.getTable(13488, null).stringToByteArray(SQLBinary.bytesToString(toBytes())));
        }
        catch(UnsupportedEncodingException e)
        {
            JDError.throwSQLException(this, JDError.EXC_INTERNAL, e);
            return null;
        }
    }
}

