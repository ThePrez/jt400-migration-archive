///////////////////////////////////////////////////////////////////////////////
//
// JTOpen (IBM Toolbox for Java - OSS version)
//
// Filename:  Copyright.java
//
// The source code contained herein is licensed under the IBM Public License
// Version 1.0, which has been approved by the Open Source Initiative.
// Copyright (C) 1997-2005 International Business Machines Corporation and
// others.  All rights reserved.
//
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

/**
 The Copyright interface is used to hold the copyright string and the version information for the IBM Toolbox for Java.
 **/

//
//Toolbox driver change log
//
//Flag  YYYYMMDD  Reason
//----- --------  ---------------
//@A1   20100406  Correct Syntax Error on Insert
//@A2   20100407  Update/Delete Blocking fix
//@A3   20100407  Allow DMD.getFunctions call on V5R4
//@A4   20100415  Fix update counts for batched update
//@A5   20100430  Correct JDUtilities.streamToBytes
//@A6   20100503  maximum blocked input rows property / Free storage used by blocked updates.
//@A7   20100506  buffer synchronization / remove Class.forName() contention / gc tracing
//@A8   20100507  minimize buffer usage for blocked insert
//@A9   20100720  Fix AS400JDBCResultSetMetaData.isAutoIncrement() when extended metadata is off
//@AA   20100805  Fix AS400JDBCStatement.execute to return syntax error from database engine.
//@AB   20101108  Make sure locators are scoped to cursor when isolation level = *NONE
//
//@B1   20101203  Call Trace.logLoadPath when loading class, so trace indicated where driver was loaded from.
//              Also trace JVM information.
//@B2   20101209  Fix Statement.setQueryTimeout
//@B3   20101209  Delay reading of input stream until execute
//@B4   20101215  Use NEW TABLE instead of FINAL table for autogenerated keys.
//@B5   20110105  Fix leaking DBStorage objects.
//@B6   20110114  Fix SQLResultSetTablePane
//@C1   20110119  Message File enhancement from David Gibbs
//@C2   20110121  CommandHelpRetriever fixes for empty help text.
//@C3   20110122  Make sure returnToPool is associated with nulling object. (Not Marked)
//@C4   20110217  Stored procedure scrollable cursor fixes.
//@C5   20110221  RLA Bidi Conversion
//@C6   20110224  Change JVM16 synchronization to not be default behavior
//@C7   20110303  Identify Generic Objects (replace with  subclasses)
//@C8   20110322  PCML Date/Time/Timestamp fixes
//@C9   20110405  Deadlock in DBStoragePool
//@CA   20110418  More timezone fixes.
//@D1   20110513  FileAttributes.getAttributes fails when returned data is larger than 2048 bytes.
//@D2   20010531  User library list updates
//@D3   20110601  Profile token or identity token is not valid when getting pooled connection while token is automatically refreshed.
//@D4   20110614 JDBC: query timeout mechanism property
//@D5   20110704  Handle ClassCastException in NPConversation.makeRequest()
//@D6   20110714  JDBC:  Correct Connection.isValid()
//@D7   20110714  JDBC:  Initial JDBC 4.1 changes
//@D8   20110715  Fix reading of com.ibm.as400.access.noDBReplyPooling and com.ibm.as400.access.DBDSPool.monitor properties
//@D9   20110802  JDBC: Add fetch warning to result set object.
//@DA   20110810  JDBC: Fix bug where clearParameters() causes executeBatch() failure.
//@Bidi-HCG3 20110812  Updated BIDI support
//@D10  20110815  Program Call: query timeout mechanism property
//@E1   20110902  ProfileTokenValue:  Fix bug when profileTokenCredential not used
//@E2   20110926  JDBC: Additional JDBC 4.1 changes
//@E3   20110926  JDBC: AS/IS JDBC client program
//@E4   20110929  JDBC: Always use GregorianCalendar to interpret database dates.
//@E5   20110929  JDBC: Fix updated row count for auto generated keys
//@F1   20111122  JDBC: Miscellaneous conversion fixes
//@F2   20111220  Ignore all exceptions when loading Buddhist calendar
//@F3   20111220  JDBC: Report fetch errors correctly
//@F4   20120118  PCML parser performance tuning
//@F5   20120208  JDBC: Honor decimal separator for PreparedStatement.setString()
//@F6   20120210  JDBC: describe option property
//@F7   20120210  JDBC: Ignore exceptions during race condition
//@F8   20120210  Improve CADSPool performance
//@F9   20120213  JDBC:  Decimal data errors property
//@FA   20120228  JDBC:  Fix java.util.NoSuchElementException: Vector Enumeration thrown by rollback
//@FB   20120410  Print: synchronized send and receive request in NPConversation.makeRequest()
//@FC   20120524  JDBC:  Allow using a java.net.URL for setObject and Datalink
//@G1   20120605  JDBC:  Fix array input parameters on reused CallableStatement
//@G2   20120606  JDBC:  Array parameter fixes
//@G3   20120611  JDBC:  Handle java.version of "0"
//@G4   20120730  JDBC:  Correct timestamp conversion.
//@G5   20120820  JDBC:  Fix named parameters.
//@G6   20120820  JDBC:  Fix DatabaseMetadata getCatalogTerm() and supportsExpressionsInOrderBy()
//@G7   20120823  JDBC:  Fix array input parameter when reusing callable statement
//@H1   20120830  JDBC:  Allow blocking when using asensitive cursors
//@H2   20121002  JDBC:  Report Truncation for mixed/open CCSIDs
//@H3   20121101  JDBC:  Improve timestamp support
//@H4   20121117  JDBC:  Reduce number of SQLConversionSettingsObjects
//@H5   20121119  JDBC:  Fix truncation for SQLNumeric and SQLDecimal objects
//@H6   20121206  Add QPWDEXPWRN support
//@H7   20130102  JDBC:  For CCSID 1208, do not report truncation if extra characters are spaces
//@I1   2013xxxx  
// NOTE:  When adding a line above, adjust the "String version" with the flag value.
//--------------------------------------------------------------------

public interface Copyright
{
    /** @deprecated  This field is reserved for use within the Toolbox product. **/
    public static String copyright = "Copyright (C) 1997-2011 International Business Machines Corporation and others.";
    //                                                                                              built=20130102 is automatically set by the build (see build.xml)
    public static String version   = "Open Source Software, JTOpen 7.8, codebase 5770-SS1 V7R1M0.08 built=20130212 @I1";  // As of V7R1: JC1 is merged into SS1 Option 3

    // Constants for reference by AS400JDBCDriver.
    static final int    MAJOR_VERSION = 9; // ex: "9" indicates V7R1
    static final int    MINOR_VERSION = 9; // ex: "1" indicates PTF #1
                                           //Note: JTOpen 7.8 is synching with ptf 9.9
    static final String DRIVER_LEVEL  = "07010009"; //(ex: 07010009 -> V7R1M0 PTF#9) (needed for hidden clientInfo) (each # is 2 digits in length)

}
