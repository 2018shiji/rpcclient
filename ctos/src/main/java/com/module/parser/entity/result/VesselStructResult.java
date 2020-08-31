package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;

public class VesselStructResult {

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "DataTable", propOrder = {"name", "record"})
    public static class DataTable{
        @XmlAttribute(name = "NAME", required = true)
        private String name;
        @XmlElement(name = "RECORD", required = true)
        private Record record;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "Record")
    public static class Record{
        private String vesselTypeCode;
        private String isoBay;
        private String customBayName;
        private String typeA;
        private String pairedBay;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELSTACK")
    public static class VdVesselStack{
        private String vesselTypeCode;
        private String isoBay;
        private String isoStack;
        private String customStackName;
    }
}
