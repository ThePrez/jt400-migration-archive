///////////////////////////////////////////////////////////////////////////////
//                                                                             
// JTOpen (AS/400 Toolbox for Java - OSS version)                              
//                                                                             
// Filename: ConvTable4948.java
//                                                                             
// The source code contained herein is licensed under the IBM Public License   
// Version 1.0, which has been approved by the Open Source Initiative.         
// Copyright (C) 1997-2000 International Business Machines Corporation and     
// others. All rights reserved.                                                
//                                                                             
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

class ConvTable4948 extends ConvTableAsciiMap
{
  private static final String copyright = "Copyright (C) 1997-2000 International Business Machines Corporation and others.";

  private static final String toUnicode_ = 
    "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F" +
    "\u0010\u0011\u0012\u0013\u00B6\u0015\u0016\u0017\u0018\u0019\u001C\u001B\u007F\u001D\u001E\u001F" +
    "\u0020\u0021\"\u0023\u0024\u0025\u0026\'\u0028\u0029\u002A\u002B\u002C\u002D\u002E\u002F" +
    "\u0030\u0031\u0032\u0033\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B\u003C\u003D\u003E\u003F" +
    "\u0040\u0041\u0042\u0043\u0044\u0045\u0046\u0047\u0048\u0049\u004A\u004B\u004C\u004D\u004E\u004F" +
    "\u0050\u0051\u0052\u0053\u0054\u0055\u0056\u0057\u0058\u0059\u005A\u005B\\\u005D\u005E\u005F" +
    "\u0060\u0061\u0062\u0063\u0064\u0065\u0066\u0067\u0068\u0069\u006A\u006B\u006C\u006D\u006E\u006F" +
    "\u0070\u0071\u0072\u0073\u0074\u0075\u0076\u0077\u0078\u0079\u007A\u007B\u007C\u007D\u007E\u001A" +
    "\u00C7\u00FC\u00E9\u00E2\u00E4\u016F\u0107\u00E7\u0142\u00EB\u0150\u0151\u00EE\u0179\u00C4\u0106" +
    "\u00C9\u0139\u013A\u00F4\u00F6\u013D\u013E\u015A\u015B\u00D6\u00DC\u0164\u0165\u0141\u00D7\u010D" +
    "\u00E1\u00ED\u00F3\u00FA\u0104\u0105\u017D\u017E\u0118\u0119\u001A\u017A\u010C\u015F\u001A\u001A" +
    "\u001A\u001A\u001A\u001A\u001A\u00C1\u00C2\u011A\u015E\u001A\u001A\u001A\u001A\u017B\u017C\u001A" +
    "\u001A\u001A\u001A\u001A\u001A\u001A\u0102\u0103\u001A\u001A\u001A\u001A\u001A\u001A\u001A\u00A4" +
    "\u0111\u0110\u010E\u00CB\u010F\u0147\u00CD\u00CE\u011B\u001A\u001A\u001A\u001A\u0162\u016E\u001A" +
    "\u00D3\u00DF\u00D4\u0143\u0144\u0148\u0160\u0161\u0154\u00DA\u0155\u0170\u00FD\u00DD\u0163\u00B4" +
    "\u00AD\u02DD\u02DB\u02C7\u02D8\u00A7\u00F7\u00B8\u00B0\u00A8\u02D9\u0171\u0158\u0159\u001A\u00A0";


  private static final String fromUnicode_ = 
    "\u0001\u0203\u0405\u0607\u0809\u0A0B\u0C0D\u0E0F\u1011\u1213\u7F15\u1617\u1819\u7F1B\u1A1D\u1E1F" +
    "\u2021\u2223\u2425\u2627\u2829\u2A2B\u2C2D\u2E2F\u3031\u3233\u3435\u3637\u3839\u3A3B\u3C3D\u3E3F" +
    "\u4041\u4243\u4445\u4647\u4849\u4A4B\u4C4D\u4E4F\u5051\u5253\u5455\u5657\u5859\u5A5B\u5C5D\u5E5F" +
    "\u6061\u6263\u6465\u6667\u6869\u6A6B\u6C6D\u6E6F\u7071\u7273\u7475\u7677\u7879\u7A7B\u7C7D\u7E1C" +
    "\uFFFF\u0010\u7F7F\uFF7F\u7F7F\uCF7F\u7FF5\uF97F\u7F7F\u7FF0\u7F7F\uF87F\u7F7F\uEF7F\u147F\uF77F" +
    "\u7F7F\u7F7F\u7F7F\u7FB5\uB67F\u8E7F\u7F80\u7F90\u7FD3\u7FD6\uD77F\u7F7F\u7FE0\uE27F\u999E\u7F7F" +
    "\uE97F\u9AED\u7FE1\u7FA0\u837F\u847F\u7F87\u7F82\u7F89\u7FA1\u8C7F\u7F7F\u7FA2\u937F\u94F6\u7F7F" +
    "\uA37F\u81EC\u7F7F\u7F7F\uC6C7\uA4A5\u8F86\u7F7F\u7F7F\uAC9F\uD2D4\uD1D0\u7F7F\u7F7F\u7F7F\uA8A9" +
    "\uB7D8\uFFFF\u000E\u7F7F\u7F91\u927F\u7F95\u967F\u7F9D\u88E3\uE47F\u7FD5\uE57F\u7F7F\u7F7F\u7F7F" +
    "\u8A8B\u7F7F\uE8EA\u7F7F\uFCFD\u9798\u7F7F\uB8AD\uE6E7\uDDEE\u9B9C\uFFFF\u0004\u7F7F\uDE85\uEBFB" +
    "\u7F7F\u7F7F\u7F7F\u7F8D\uABBD\uBEA6\uA77F\uFFFF\u00A3\u7F7F\u7FF3\uFFFF\b\u7F7F\uF4FA\u7FF2" +
    "\u7FF1\uFFFF\u7E91\u7F7F";


  ConvTable4948()
  {
    super(4948, toUnicode_.toCharArray(), fromUnicode_.toCharArray());
  }
}
