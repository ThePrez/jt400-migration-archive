///////////////////////////////////////////////////////////////////////////////
//                                                                             
// JTOpen (IBM Toolbox for Java - OSS version)                              
//                                                                             
// Filename: AS400JDBCDataSourcePaneGUI.java
//                                                                             
// The source code contained herein is licensed under the IBM Public License   
// Version 1.0, which has been approved by the Open Source Initiative.         
// Copyright (C) 1997-2000 International Business Machines Corporation and     
// others. All rights reserved.                                                
//                                                                             
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.vaccess;
public class AS400JDBCDataSourcePaneGUI extends java.util.ListResourceBundle {
   // NLS_MESSAGEFORMAT_NONE
   // Each string is assumed NOT to be processed by the MessageFormat class.
   // This means that a single quote must be coded as 1 single quote.

   // NLS_ENCODING=UTF-8
   // Instructs the translation tools to interpret the text as UTF-8.

   public Object[][] getContents() { return contents; }
   static final Object[][] contents = {
      {"@FileEditorBounds", "31,101,428,323"},
      {"@GenerateBeans", "1"},
      {"@GenerateHandlers", "1"},
      {"@Serialize", "1"},
      {"@StringEditorBounds", "132,142,926,796"},
      {"AJDSP_BADCHARACTERS", "[]{}()?*=!@,;"},
      {"AJDSP_BADDSN", "The data source name is not valid.  Make sure the data source name begins with an alphabetic character and does not contain any of the following characters: \\n [ ] { } ( ) ? * = ! @ , ;"},
      {"AJDSP_BLOCK_SIZE_0", "0"},
      {"AJDSP_BLOCK_SIZE_1", "1"},
      {"AJDSP_BLOCK_SIZE_128", "128"},
      {"AJDSP_BLOCK_SIZE_16", "16"},
      {"AJDSP_BLOCK_SIZE_2", "2"},
      {"AJDSP_BLOCK_SIZE_256", "256"},
      {"AJDSP_BLOCK_SIZE_32", "32"},
      {"AJDSP_BLOCK_SIZE_4", "4"},
      {"AJDSP_BLOCK_SIZE_512", "512"},
      {"AJDSP_BLOCK_SIZE_64", "64"},
      {"AJDSP_BLOCK_SIZE_8", "8"},
      {"AJDSP_COMMIT_ALL", "Repeatable read  (*ALL)"},
      {"AJDSP_COMMIT_CHG", "Read uncommitted  (*CHG)"},
      {"AJDSP_COMMIT_CS", "Read committed  (*CS )"},
      {"AJDSP_COMMIT_NONE", "Commit immediate  (*NONE)"},
      {"AJDSP_COMMIT_RR", "Serializable (*RR)"},
      {"AJDSP_CONNECTION", "General"},
      {"AJDSP_CONNOPT", "Connection Options"},
      {"AJDSP_CONNOPT.AJDSP_DEFAULT_USER_LABEL", "Default user ID:"},
      {"AJDSP_CONNOPT.AJDSP_DEFAULT_USERID_TEXTBOX", ""},
      {"AJDSP_CONNOPT.AJDSP_SSL_CHECKBOX", "Use Secured Sockets Layer (SSL)"},
      {"AJDSP_CONNOPT.EditorBounds", "118,25,1000,637"},
      {"AJDSP_CONNOPTTITLE", "Connection Options"},
      {"AJDSP_DATEFMT_DMY", "dd/mm/yy  (*DMY)"},
      {"AJDSP_DATEFMT_EUR", "dd.mm.yyyy  (*EUR)"},
      {"AJDSP_DATEFMT_ISO", "yyyy-mm-dd  (*ISO)"},
      {"AJDSP_DATEFMT_JIS", "yyyy-mm-dd  (*JIS)"},
      {"AJDSP_DATEFMT_JULIAN", "yy/ddd   (*JUL)"},
      {"AJDSP_DATEFMT_MDY", "mm/dd/yy  (*MDY)"},
      {"AJDSP_DATEFMT_USA", "mm/dd/yyyy  (*USA)"},
      {"AJDSP_DATEFMT_YMD", "yy/mm/dd  (*YMD)"},
      {"AJDSP_DATESEP_BLANK", "   (blank)"},
      {"AJDSP_DATESEP_COMMA", ",  (comma)"},
      {"AJDSP_DATESEP_DASH", "-  (dash)"},
      {"AJDSP_DATESEP_FORWARDSLASH", "/  (forward slash)"},
      {"AJDSP_DATESEP_PERIOD", ".  (period)"},
      {"AJDSP_DECIMAL_COMMA", ",  (comma)"},
      {"AJDSP_DECIMAL_PERIOD", ".  (period)"},
      {"AJDSP_ERROR", "Error"},
      {"AJDSP_FORMAT", "Format"},
      {"AJDSP_FORMAT.AJDSP_DATE_FORMAT_COMBOBOX.EditorBounds", "50,125,454,250"},
      {"AJDSP_FORMAT.AJDSP_DATE_FORMAT_LABEL", "Format:  "},
      {"AJDSP_FORMAT.AJDSP_DATE_GROUPBOX", "Date"},
      {"AJDSP_FORMAT.AJDSP_DATE_SEP_COMBOBOX.EditorBounds", "75,150,454,250"},
      {"AJDSP_FORMAT.AJDSP_DATE_SEP_LABEL", "Separator:  "},
      {"AJDSP_FORMAT.AJDSP_DECIMAL_COMBOBOX.EditorBounds", "0,75,454,250"},
      {"AJDSP_FORMAT.AJDSP_DECIMAL_LABEL", "Decimal separator:  "},
      {"AJDSP_FORMAT.AJDSP_NAMING_COMBOBOX.EditorBounds", "70,347,454,250"},
      {"AJDSP_FORMAT.AJDSP_NAMING_LABEL", "Naming convention:  "},
      {"AJDSP_FORMAT.AJDSP_TIME_FORMAT_COMBOBOX.EditorBounds", "50,125,454,250"},
      {"AJDSP_FORMAT.AJDSP_TIME_FORMAT_LABEL", "Format:  "},
      {"AJDSP_FORMAT.AJDSP_TIME_GROUPBOX", "Time"},
      {"AJDSP_FORMAT.AJDSP_TIME_SEP_COMBOBOX.EditorBounds", "29,99,454,250"},
      {"AJDSP_FORMAT.AJDSP_TIME_SEP_LABEL", "Separator:  "},
      {"AJDSP_FORMAT.EditorBounds", "245,280,972,648"},
      {"AJDSP_GENERAL", "General"},
      {"AJDSP_GENERAL.AJDSP_AS400SERVER_LABEL", "System:"},   //@550
      {"AJDSP_GENERAL.AJDSP_AS400SERVER_TEXTBOX", ""},
      {"AJDSP_GENERAL.AJDSP_DATASOURCE_NAME_LABEL", "Data source name:"},
      {"AJDSP_GENERAL.AJDSP_DATASOURCE_NAME_TEXTBOX", ""},
      {"AJDSP_GENERAL.AJDSP_DESCRIPTION_LABEL", "Description:"},
      {"AJDSP_GENERAL.AJDSP_DESCRIPTION_TEXTBOX", ""},
      {"AJDSP_GENERAL.EditorBounds", "285,10,1008,648"},
      {"AJDSP_LANGUAGE", "Language"},
      {"AJDSP_LANGUAGE.AJDSP_LANGUAGE_COMBOBOX.EditorBounds", "50,125,454,250"},
      {"AJDSP_LANGUAGE.AJDSP_LANGUAGE_LABEL", "Language:"},
      {"AJDSP_LANGUAGE.AJDSP_SHAREDWEIGHT_RADIOBUTTON", "Shared"},
      {"AJDSP_LANGUAGE.AJDSP_SORTTABLE_LABEL", "Sort library/table name:"},
      {"AJDSP_LANGUAGE.AJDSP_SORTTABLE_TEXTBOX", ""},
      {"AJDSP_LANGUAGE.AJDSP_SORTTYPE_COMBOBOX.EditorBounds", "25,100,454,250"},
      {"AJDSP_LANGUAGE.AJDSP_SORTTYPE_LABEL", "Sort based on:"},
      {"AJDSP_LANGUAGE.AJDSP_SORTWEIGHT_LABEL", "Sort weight:"},
      {"AJDSP_LANGUAGE.AJDSP_UNIQUEWEIGHT_RADIOBUTTON", "Unique"},
      {"AJDSP_LANGUAGE.EditorBounds", "274,27,974,662"},
      {"AJDSP_LIBVIEW_ALL", "All libraries on the system"},
      {"AJDSP_LIBVIEW_LIBLIST", "Default library list"},
      {"AJDSP_LOB_THRESH_0", "0"},
      {"AJDSP_LOB_THRESH_1024", "1024"},
      {"AJDSP_LOB_THRESH_128", "128"},
      {"AJDSP_LOB_THRESH_15360", "15360"},
      {"AJDSP_LOB_THRESH_2048", "2048"},
      {"AJDSP_LOB_THRESH_256", "256"},
      {"AJDSP_LOB_THRESH_32", "32"},
      {"AJDSP_LOB_THRESH_4096", "4096"},
      {"AJDSP_LOB_THRESH_512", "512"},
      {"AJDSP_LOB_THRESH_64", "64"},
      {"AJDSP_LOB_THRESH_8192", "8192"},
      {"AJDSP_NAMING_SQL", "SQL (*SQL)"},
      {"AJDSP_NAMING_SYSTEM", "System (*SYS)"},
      {"AJDSP_NEED_PWD", "Password must be supplied. "},
      {"AJDSP_NODSN", "A valid data source name must be supplied."},
      {"AJDSP_NOT_SET", "Not set"},
      {"AJDSP_NOTSECURE", "Not secured"},
      {"AJDSP_OTHER", "Other"},
      {"AJDSP_OTHER.AJDSP_ACCESSTYPE_LABEL", "Access type:"},
      {"AJDSP_OTHER.AJDSP_ACCESSTYPE_RC", "Allow select and call statements only (read/call)"},
      {"AJDSP_OTHER.AJDSP_ACCESSTYPE_RO", "Allow select statements only (read only)"},
      {"AJDSP_OTHER.AJDSP_ACCESSTYPE_RW", "Allow all SQL statements (read/write)"},
      {"AJDSP_OTHER.AJDSP_OS400DESC_RADIOBUTTON", "Object description  "},
      {"AJDSP_OTHER.AJDSP_REMARKSSOURCE_LABEL", "Remarks source:"},
      {"AJDSP_OTHER.AJDSP_SQLDESC_RADIOBUTTON", "SQL object comment  "},
      {"AJDSP_OTHER.EditorBounds", "230,32,968,662"},
      {"AJDSP_PACKAGE", "Package"},
      {"AJDSP_PACKAGE.AJDSP_CACHE_PACKAGE_CHECKBOX", "Cache package locally"},
      {"AJDSP_PACKAGE.AJDSP_EXTDYNAMIC_CHECKBOX", "Enable extended dynamic (package) support"},
      {"AJDSP_PACKAGE.AJDSP_IGNORE_RADIOBUTTON", "Ignore"},
      {"AJDSP_PACKAGE.AJDSP_PACKAGE_LABEL", "Package:"},
      {"AJDSP_PACKAGE.AJDSP_PACKAGE_TEXTBOX", ""},
      {"AJDSP_PACKAGE.AJDSP_PACKAGELIB_LABEL", "Package library:"},
      {"AJDSP_PACKAGE.AJDSP_PACKAGELIB_TEXTBOX", ""},
      {"AJDSP_PACKAGE.AJDSP_POST_WARN_RADIOBUTTON", "Post warning"},
      {"AJDSP_PACKAGE.AJDSP_SEND_EXCEP_RADIOBUTTON", "Send exception"},
      {"AJDSP_PACKAGE.AJDSP_UNUSABLE_ACTION_LABEL", "Unusable package action:"},
      {"AJDSP_PACKAGE.AJDSP_USAGE_LABEL", "Usage:"},
      {"AJDSP_PACKAGE.AJDSP_USE_RADIOBUTTON", "Use"},
      {"AJDSP_PACKAGE.AJDSP_USEADD_RADIOBUTTON", "Use and add"},
      {"AJDSP_PACKAGE.EditorBounds", "264,7,904,663"},
      {"AJDSP_PERFORMANCE", "Performance"},
      {"AJDSP_PERFORMANCE.AJDSP_BLOCKING_CRITERIA_COMBOBOX.EditorBounds", "25,100,454,250"},
      {"AJDSP_PERFORMANCE.AJDSP_BLOCKING_CRITERIA_LABEL", "Criteria:  "},
      {"AJDSP_PERFORMANCE.AJDSP_BLOCKING_SIZE_COMBOBOX.EditorBounds", "0,75,454,250"},
      {"AJDSP_PERFORMANCE.AJDSP_BLOCKING_SIZE_LABEL", "Size:  "},
      {"AJDSP_PERFORMANCE.AJDSP_COMPRESSION_CHECKBOX", "  Enable data compression"},
      {"AJDSP_PERFORMANCE.AJDSP_LAZY_CLOSE_CHECKBOX", "  Enable lazy close support "},
      {"AJDSP_PERFORMANCE.AJDSP_LOB_THRESHOLD_COMBOBOX.EditorBounds", "0,75,454,250"},
      {"AJDSP_PERFORMANCE.AJDSP_LOB_THRESHOLD_LABEL", "Large object threshold:      "},
      {"AJDSP_PERFORMANCE.AJDSP_PREFETCH_CHECKBOX", "  Enable pre-fetch"},
      {"AJDSP_PERFORMANCE.AJDSP_RECORD_BLOCKING_LABEL", "Record blocking:"},
      {"AJDSP_PERFORMANCE.EditorBounds", "291,3,972,648"},
      {"AJDSP_RECBLK_DISABLE", "Disabled record blocking"},
      {"AJDSP_RECBLK_FORFETCH", "Block if FOR FETCH ONLY specified"},
      {"AJDSP_RECBLK_NOTUPDT", "Block except if FOR UPDATE OF specified"},
      {"AJDSP_RMDSTITLE", "Refresh Managed Data Sources"},
      {"AJDSP_SECURESSL", "Secured with Secured Sockets Layer (SSL)"},
      {"AJDSP_SERVER", "System"},        //@550
      {"AJDSP_SERVER.AJDSP_COMMIT_MODE_COMBOBOX.EditorBounds", "12,159,454,250"},
      {"AJDSP_SERVER.AJDSP_COMMIT_MODE_LABEL", "Commit mode: "},
      {"AJDSP_SERVER.AJDSP_DFT_LIBS_LABEL", "Library list:"},
      {"AJDSP_SERVER.AJDSP_DFT_LIBS_TEXTBOX", ""},
      {"AJDSP_SERVER.AJDSP_DFT_SQLLIB_LABEL", "SQL default library:"},
      {"AJDSP_SERVER.AJDSP_SQL_DEFLIB_TEXTBOX", ""},
      {"AJDSP_SERVER.DECIMALPROPSGRPBOX", "Decimal properties"},
      {"AJDSP_SERVER.EditorBounds", "515,39,719,554"},
      {"AJDSP_SERVER.MAX_PRECISIONLBL", "Maximum precision  (31 or 63):"},
      {"AJDSP_SERVER.MAX_SCALE_LBL", "Maximum scale  (0-63):"},
      {"AJDSP_SERVER.MIN_DIV_SCALE_LBL", "Minimum divide scale  (0-9):"},
      {"AJDSP_SERVER1", "System"},       //@550
      {"AJDSP_SORTHEX", "HEX values"},
      {"AJDSP_SORTJOB", "Job profile"},
      {"AJDSP_SORTLANGID", "Language ID"},
      {"AJDSP_SORTLG_AFR", "AFR"},
      {"AJDSP_SORTLG_AFR_TEXT", "Afrikaans"},
      {"AJDSP_SORTLG_ARA", "ARA"},
      {"AJDSP_SORTLG_ARA_TEXT", "Arabic"},
      {"AJDSP_SORTLG_BEL", "BEL"},
      {"AJDSP_SORTLG_BEL_TEXT", "Byelorussian"},
      {"AJDSP_SORTLG_BGR", "BGR"},
      {"AJDSP_SORTLG_BGR_TEXT", "Bulgarian"},
      {"AJDSP_SORTLG_CAT", "CAT"},
      {"AJDSP_SORTLG_CAT_TEXT", "Catalan"},
      {"AJDSP_SORTLG_CHS", "CHS"},
      {"AJDSP_SORTLG_CHS_TEXT", "Simplified Chinese"},
      {"AJDSP_SORTLG_CHT", "CHT"},
      {"AJDSP_SORTLG_CHT_TEXT", "Traditional Chinese"},
      {"AJDSP_SORTLG_CSY", "CSY"},
      {"AJDSP_SORTLG_CSY_TEXT", "Czech"},
      {"AJDSP_SORTLG_DAN", "DAN"},
      {"AJDSP_SORTLG_DAN_TEXT", "Danish"},
      {"AJDSP_SORTLG_DES", "DES"},
      {"AJDSP_SORTLG_DES_TEXT", "Swiss German"},
      {"AJDSP_SORTLG_DEU", "DEU"},
      {"AJDSP_SORTLG_DEU_TEXT", "German"},
      {"AJDSP_SORTLG_ELL", "ELL"},
      {"AJDSP_SORTLG_ELL_TEXT", "Greek"},
      {"AJDSP_SORTLG_ENA", "ENA"},
      {"AJDSP_SORTLG_ENA_TEXT", "Australian English"},
      {"AJDSP_SORTLG_ENB", "ENB"},
      {"AJDSP_SORTLG_ENB_TEXT", "Belgian English"},
      {"AJDSP_SORTLG_ENG", "ENG"},
      {"AJDSP_SORTLG_ENG_TEXT", "United Kingdom English"},
      {"AJDSP_SORTLG_ENP", "ENP"},
      {"AJDSP_SORTLG_ENP_TEXT", "Uppercase English"},
      {"AJDSP_SORTLG_ENU", "ENU"},
      {"AJDSP_SORTLG_ENU_TEXT", "United States English"},
      {"AJDSP_SORTLG_ESP", "ESP"},
      {"AJDSP_SORTLG_ESP_TEXT", "Spanish"},
      {"AJDSP_SORTLG_EST", "EST"},
      {"AJDSP_SORTLG_EST_TEXT", "Estonian"},
      {"AJDSP_SORTLG_FAR", "FAR"},
      {"AJDSP_SORTLG_FAR_TEXT", "Farsi"},
      {"AJDSP_SORTLG_FIN", "FIN"},
      {"AJDSP_SORTLG_FIN_TEXT", "Finnish"},
      {"AJDSP_SORTLG_FRA", "FRA"},
      {"AJDSP_SORTLG_FRA_TEXT", "French"},
      {"AJDSP_SORTLG_FRB", "FRB"},
      {"AJDSP_SORTLG_FRB_TEXT", "Belgian French"},
      {"AJDSP_SORTLG_FRC", "FRC"},
      {"AJDSP_SORTLG_FRC_TEXT", "Canadian French"},
      {"AJDSP_SORTLG_FRS", "FRS"},
      {"AJDSP_SORTLG_FRS_TEXT", "Swiss French"},
      {"AJDSP_SORTLG_GAE", "GAE"},
      {"AJDSP_SORTLG_GAE_TEXT", "Irish Gaelic"},
      {"AJDSP_SORTLG_HEB", "HEB"},
      {"AJDSP_SORTLG_HEB_TEXT", "Hebrew"},
      {"AJDSP_SORTLG_HRV", "HRV"},
      {"AJDSP_SORTLG_HRV_TEXT", "Croatian"},
      {"AJDSP_SORTLG_HUN", "HUN"},
      {"AJDSP_SORTLG_HUN_TEXT", "Hungarian"},
      {"AJDSP_SORTLG_ISL", "ISL"},
      {"AJDSP_SORTLG_ISL_TEXT", "Icelandic"},
      {"AJDSP_SORTLG_ITA", "ITA"},
      {"AJDSP_SORTLG_ITA_TEXT", "Italian"},
      {"AJDSP_SORTLG_ITS", "ITS"},
      {"AJDSP_SORTLG_ITS_TEXT", "Swiss Italian"},
      {"AJDSP_SORTLG_JPN", "JPN"},
      {"AJDSP_SORTLG_JPN_TEXT", "Japanese Katakana"},
      {"AJDSP_SORTLG_KOR", "KOR"},
      {"AJDSP_SORTLG_KOR_TEXT", "Korean"},
      {"AJDSP_SORTLG_LAO", "LAO"},
      {"AJDSP_SORTLG_LAO_TEXT", "Lao"},
      {"AJDSP_SORTLG_LTU", "LTU"},
      {"AJDSP_SORTLG_LTU_TEXT", "Lithuanian"},
      {"AJDSP_SORTLG_LVA", "LVA"},
      {"AJDSP_SORTLG_LVA_TEXT", "Latvian"},
      {"AJDSP_SORTLG_MKD", "MKD"},
      {"AJDSP_SORTLG_MKD_TEXT", "Macedonian"},
      {"AJDSP_SORTLG_NLB", "NLB"},
      {"AJDSP_SORTLG_NLB_TEXT", "Belgian Dutch"},
      {"AJDSP_SORTLG_NLD", "NLD"},
      {"AJDSP_SORTLG_NLD_TEXT", "Dutch"},
      {"AJDSP_SORTLG_NON", "NON"},
      {"AJDSP_SORTLG_NON_TEXT", "Norwegian Nynorsk"},
      {"AJDSP_SORTLG_NOR", "NOR"},
      {"AJDSP_SORTLG_NOR_TEXT", "Norwegian Bokmal"},
      {"AJDSP_SORTLG_PLK", "PLK"},
      {"AJDSP_SORTLG_PLK_TEXT", "Polish"},
      {"AJDSP_SORTLG_PTB", "PTB"},
      {"AJDSP_SORTLG_PTB_TEXT", "Brazilian Portuguese"},
      {"AJDSP_SORTLG_PTG", "PTG"},
      {"AJDSP_SORTLG_PTG_TEXT", "Portuguese"},
      {"AJDSP_SORTLG_RMS", "RMS"},
      {"AJDSP_SORTLG_RMS_TEXT", "Rhaeto-Romanic"},
      {"AJDSP_SORTLG_ROM", "ROM"},
      {"AJDSP_SORTLG_ROM_TEXT", "Romanian"},
      {"AJDSP_SORTLG_RUS", "RUS"},
      {"AJDSP_SORTLG_RUS_TEXT", "Russian"},
      {"AJDSP_SORTLG_SKY", "SKY"},
      {"AJDSP_SORTLG_SKY_TEXT", "Slovakian"},
      {"AJDSP_SORTLG_SLO", "SLO"},
      {"AJDSP_SORTLG_SLO_TEXT", "Slovenian"},
      {"AJDSP_SORTLG_SQI", "SQI"},
      {"AJDSP_SORTLG_SQI_TEXT", "Albanian"},
      {"AJDSP_SORTLG_SRB", "SRB"},
      {"AJDSP_SORTLG_SRB_TEXT", "Serbian Cyrillic"},
      {"AJDSP_SORTLG_SRL", "SRL"},
      {"AJDSP_SORTLG_SRL_TEXT", "Serbian Latin"},
      {"AJDSP_SORTLG_SVE", "SVE"},
      {"AJDSP_SORTLG_SVE_TEXT", "Swedish"},
      {"AJDSP_SORTLG_THA", "THA"},
      {"AJDSP_SORTLG_THA_TEXT", "Thai"},
      {"AJDSP_SORTLG_TRK", "TRK"},
      {"AJDSP_SORTLG_TRK_TEXT", "Turkish"},
      {"AJDSP_SORTLG_UKR", "UKR"},
      {"AJDSP_SORTLG_UKR_TEXT", "Ukrainian"},
      {"AJDSP_SORTLG_URD", "URD"},
      {"AJDSP_SORTLG_URD_TEXT", "Urdu"},
      {"AJDSP_SORTLG_VIE", "VIE"},
      {"AJDSP_SORTLG_VIE_TEXT", "Vietnamese"},
      {"AJDSP_SORTTABLE", "Specified table"},
      {"AJDSP_SORTWEIGHT99", "Sort Weight"},
      {"AJDSP_TABBEDPANE", "Tabbed Pane"},
      {"AJDSP_TABBEDPANE.EditorBounds", "8,277,454,250"},
      {"AJDSP_TIMEFMT_EUR", "hh.mm.ss  (*EUR)"},
      {"AJDSP_TIMEFMT_HMS", "hh:mm:ss  (*HMS)"},
      {"AJDSP_TIMEFMT_ISO", "hh.mm.ss  (*ISO)"},
      {"AJDSP_TIMEFMT_JIS", "hh:mm:ss  (*JIS)"},
      {"AJDSP_TIMEFMT_USA", "hh:mm AM/PM  (*USA)"},
      {"AJDSP_TIMESEP_BLANK", "   (blank)"},
      {"AJDSP_TIMESEP_COLON", ":  (colon)"},
      {"AJDSP_TIMESEP_COMMA", ",  (comma)"},
      {"AJDSP_TIMESEP_PERIOD", ".  (period)"},
      {"AJDSP_TRANSLATION", "Translation"},
      {"AJDSP_TRANSLATION.AJDSP_TRANSLATE_65535_CHECKBOX", "Translate CCSID 65535"},
      {"AJDSP_TRANSLATION.AJDSP_TRANSLATE_HEX_CHECKBOX", "Interpret SQL hexadecimal constants as binary data"},
      {"AJDSP_TRANSLATION.EditorBounds", "20,102,715,554"},
      {"AJDSP_USE_SERVER_JOB", "Use server job value"},
      {"AJDSP_USE_UID_DEFAULT", "Use Default"}
   };
}
