package com.module.parser.entity.simulation;

public class Response {
    public static final String[] header = {
            ""
    };

    public static final String body =
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
            "<soap:Envelope " +
                    "xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" " +
                    "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                    "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +
            "<soap:Body>" +
            "<SM001002Response xmlns=\"http://tempuri.org/\">" +
            "<SM001002Result>" +
            "<CTOSRESULT>..................</CTOSRESULT>" +
            "</SM001002Result>" +
            "</SM001002Response>" +
            "</soap:Body>" +
            "</soap:Envelope>";

    public static final String SM001002 =
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                    "<soap:Envelope " +
                    "xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" " +
                    "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                    "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +
                    "<soap:Body>" +
                    "<SM001002Response xmlns=\"http://tempuri.org/\">" +
                    "<SM001002Result>" +
                    "<CTOSRESULT><RETURNINFO><ERRORCODE>0</ERRORCODE><ERRORMSG>success</ERRORMSG></RETURNINFO><SM001002><ERRORCODE>0</ERRORCODE><ERRORMSG>Cancellation of success</ERRORMSG></SM001002></CTOSRESULT>" +
                    "</SM001002Result>" +
                    "</SM001002Response>" +
                    "</soap:Body>" +
                    "</soap:Envelope>";

    public static final String OP004042 =
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                    "<soap:Envelope " +
                    "xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" " +
                    "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                    "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +
                    "<soap:Body>" +
                    "<OP004042Response xmlns=\"http://tempuri.org/\">" +
                    "<OP004042Result>" +
                    "<CTOSRESULT><RETURNINFO><ERRORCODE>0</ERRORCODE><ERRORMSG>success</ERRORMSG></RETURNINFO></CTOSRESULT>" +
                    "</OP004042Result>" +
                    "</OP004042Response>" +
                    "</soap:Body>" +
                    "</soap:Envelope>";
}
