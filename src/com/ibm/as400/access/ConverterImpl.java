///////////////////////////////////////////////////////////////////////////////
//                                                                             
// AS/400 Toolbox for Java - OSS version                                       
//                                                                             
// Filename: ConverterImpl.java
//                                                                             
// The source code contained herein is licensed under the IBM Public License   
// Version 1.0, which has been approved by the Open Source Initiative.         
// Copyright (C) 1997-2000 International Business Machines Corporation and     
// others. All rights reserved.                                                
//                                                                             
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

interface ConverterImpl
{
    static final int LTR = 0;   //$E0A   Used to denote left-to-right text type.

    abstract void setEncoding(String encoding) throws UnsupportedEncodingException;
    abstract void setCcsid(int ccsid, AS400Impl systemImpl) throws UnsupportedEncodingException;
    abstract String getEncoding();
    abstract int getCcsid();
    abstract String byteArrayToString(byte[] source, int offset, int length);   
    abstract String byteArrayToString(byte[] source, int offset, int length, int type);   //$E0A
    abstract byte[] stringToByteArray(String source);                           
    abstract byte[] stringToByteArray(String source, int type);                           //$E0A
}
