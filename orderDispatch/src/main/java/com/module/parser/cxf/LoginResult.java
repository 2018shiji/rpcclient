
package com.module.parser.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>loginResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="loginResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataTable" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="record" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="deviceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="deviceMType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="workType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="moveCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="isHalt" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ticketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResult", namespace = "http://module.com/parser/entity/result", propOrder = {
    "returnInfo",
    "dataTable",
    "ticketId"
})
public class LoginResult {

    protected LoginResult.ReturnInfo returnInfo;
    protected List<LoginResult.DataTable> dataTable;
    protected String ticketId;

    /**
     * 获取returnInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoginResult.ReturnInfo }
     *     
     */
    public LoginResult.ReturnInfo getReturnInfo() {
        return returnInfo;
    }

    /**
     * 设置returnInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResult.ReturnInfo }
     *     
     */
    public void setReturnInfo(LoginResult.ReturnInfo value) {
        this.returnInfo = value;
    }

    /**
     * Gets the value of the dataTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoginResult.DataTable }
     * 
     * 
     */
    public List<LoginResult.DataTable> getDataTable() {
        if (dataTable == null) {
            dataTable = new ArrayList<LoginResult.DataTable>();
        }
        return this.dataTable;
    }

    /**
     * 获取ticketId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * 设置ticketId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketId(String value) {
        this.ticketId = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="record" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="deviceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="deviceMType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="workType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="moveCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="isHalt" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "record"
    })
    public static class DataTable {

        @XmlElement(namespace = "http://module.com/parser/entity/result")
        protected String name;
        @XmlElement(namespace = "http://module.com/parser/entity/result")
        protected LoginResult.DataTable.Record record;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取record属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LoginResult.DataTable.Record }
         *     
         */
        public LoginResult.DataTable.Record getRecord() {
            return record;
        }

        /**
         * 设置record属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LoginResult.DataTable.Record }
         *     
         */
        public void setRecord(LoginResult.DataTable.Record value) {
            this.record = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="deviceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="deviceMType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="workType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="moveCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="isHalt" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "deviceNo",
            "deviceMType",
            "workType",
            "moveCapacity"
        })
        public static class Record {

            @XmlElement(namespace = "http://module.com/parser/entity/result")
            protected String deviceNo;
            @XmlElement(namespace = "http://module.com/parser/entity/result")
            protected String deviceMType;
            @XmlElement(namespace = "http://module.com/parser/entity/result")
            protected String workType;
            @XmlElement(namespace = "http://module.com/parser/entity/result")
            protected String moveCapacity;
            @XmlAttribute(name = "isHalt", required = true)
            protected boolean isHalt;

            /**
             * 获取deviceNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeviceNo() {
                return deviceNo;
            }

            /**
             * 设置deviceNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeviceNo(String value) {
                this.deviceNo = value;
            }

            /**
             * 获取deviceMType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeviceMType() {
                return deviceMType;
            }

            /**
             * 设置deviceMType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeviceMType(String value) {
                this.deviceMType = value;
            }

            /**
             * 获取workType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkType() {
                return workType;
            }

            /**
             * 设置workType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkType(String value) {
                this.workType = value;
            }

            /**
             * 获取moveCapacity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoveCapacity() {
                return moveCapacity;
            }

            /**
             * 设置moveCapacity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoveCapacity(String value) {
                this.moveCapacity = value;
            }

            /**
             * 获取isHalt属性的值。
             * 
             */
            public boolean isIsHalt() {
                return isHalt;
            }

            /**
             * 设置isHalt属性的值。
             * 
             */
            public void setIsHalt(boolean value) {
                this.isHalt = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "errorCode",
        "errorMsg"
    })
    public static class ReturnInfo {

        @XmlElement(namespace = "http://module.com/parser/entity/result")
        protected String errorCode;
        @XmlElement(namespace = "http://module.com/parser/entity/result")
        protected String errorMsg;

        /**
         * 获取errorCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorCode() {
            return errorCode;
        }

        /**
         * 设置errorCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorCode(String value) {
            this.errorCode = value;
        }

        /**
         * 获取errorMsg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorMsg() {
            return errorMsg;
        }

        /**
         * 设置errorMsg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorMsg(String value) {
            this.errorMsg = value;
        }

    }

}
