
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.module.parser.wsdlGen;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.14
 * 2020-08-20T12:31:49.128+08:00
 * Generated source version: 3.2.14
 *
 */

@javax.jws.WebService(
                      serviceName = "LoginResult",
                      portName = "LoginResultPort",
                      targetNamespace = "http://module.com/parser/entity/result/LoginResult",
                      wsdlLocation = "file:/C:/Users/lizhuangjie.chnet/IdeaProjects/parser/orderDispatch/src/main/resources/wsdl/LoginResult.wsdl",
                      endpointInterface = "com.module.parser.wsdlGen.LoginResultPortType")

public class LoginResultPortImpl implements LoginResultPortType {

    private static final Logger LOG = Logger.getLogger(LoginResultPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#setTicketId(java.lang.String ticketId)*
     */
    public void setTicketId(java.lang.String ticketId) {
        LOG.info("Executing operation setTicketId");
        System.out.println(ticketId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#canEqual(com.module.parser.wsdlGen.Object other)*
     */
    public boolean canEqual(com.module.parser.wsdlGen.Object other) {
        LOG.info("Executing operation canEqual");
        System.out.println(other);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#getWorkType()*
     */
    public java.lang.String getWorkType() {
        LOG.info("Executing operation getWorkType");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#setWorkType(java.lang.String workType)*
     */
    public void setWorkType(java.lang.String workType) {
        LOG.info("Executing operation setWorkType");
        System.out.println(workType);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#getDeviceMType()*
     */
    public java.lang.String getDeviceMType() {
        LOG.info("Executing operation getDeviceMType");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#isHalt()*
     */
    public boolean isHalt() {
        LOG.info("Executing operation isHalt");
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#getMoveCapacity()*
     */
    public java.lang.String getMoveCapacity() {
        LOG.info("Executing operation getMoveCapacity");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#getTicketId()*
     */
    public java.lang.String getTicketId() {
        LOG.info("Executing operation getTicketId");
        try {
            java.lang.String _return = "123";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#setHalt(boolean isHalt)*
     */
    public void setHalt(boolean isHalt) {
        LOG.info("Executing operation setHalt");
        System.out.println(isHalt);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#setDeviceNo(java.lang.String deviceNo)*
     */
    public void setDeviceNo(java.lang.String deviceNo) {
        LOG.info("Executing operation setDeviceNo");
        System.out.println(deviceNo);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#setDeviceMType(java.lang.String deviceMType)*
     */
    public void setDeviceMType(java.lang.String deviceMType) {
        LOG.info("Executing operation setDeviceMType");
        System.out.println(deviceMType);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#hashCode()*
     */
    public int hashCode() {
        LOG.info("Executing operation hashCode");
        try {
            int _return = 0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#equals(com.module.parser.wsdlGen.Object o)*
     */
    public boolean equals(com.module.parser.wsdlGen.Object o) {
        LOG.info("Executing operation equals");
        System.out.println(o);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#setMoveCapacity(java.lang.String moveCapacity)*
     */
    public void setMoveCapacity(java.lang.String moveCapacity) {
        LOG.info("Executing operation setMoveCapacity");
        System.out.println(moveCapacity);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#getDeviceNo()*
     */
    public java.lang.String getDeviceNo() {
        LOG.info("Executing operation getDeviceNo");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.module.parser.wsdlGen.LoginResultPortType#toString()*
     */
    public java.lang.String toString() {
        LOG.info("Executing operation toString");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
