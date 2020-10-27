package com.module.parser.entity;

import com.module.parser.asmxclient.Asmx8HttpClient;
import com.module.parser.entity.request.Box;
import com.module.parser.entity.request.Register;
import com.module.parser.entity.request.RegisterOut;
import com.module.parser.entity.simulation.CTOSRESULT;
import com.module.parser.navigatorImpl.NavigatorUser;
import com.module.parser.navigatorImpl.NavigatorVelBox;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Asmx8HttpClient.class})
@PowerMockIgnore({"com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*", "javax.management.*", "javax.net.ssl.*", "com.sun.xml.*"})
public class MockApplicationTest {

    @Before
    public void initMockImpl(){
        PowerMockito.mockStatic(Asmx8HttpClient.class);
        PowerMockito.when(Asmx8HttpClient.accessRegister(Mockito.anyString())).thenReturn(CTOSRESULT.SM001001);
        PowerMockito.when(Asmx8HttpClient.accessRegisterOut((Mockito.anyString()))).thenReturn(CTOSRESULT.SM001002);
        PowerMockito.when(Asmx8HttpClient.accessBox(Mockito.anyString())).thenReturn(CTOSRESULT.OTS001008);
    }

    NavigatorUser navigatorUser = new NavigatorUser();
    NavigatorVelBox navigatorVelBox = new NavigatorVelBox();
    @Test
    public void test(){
        String registerResult = navigatorUser.getRegisterResult(new Register("userId","password","clientIP"));
        System.out.println(registerResult);
        String registerOutResult = navigatorUser.getRegisterOutResult(new RegisterOut("userId", "ticketId"));
        System.out.println(registerOutResult);
        String boxResult = navigatorVelBox.getBoxResult(new Box("velAliase", "pageNo", "ticket_id"));
        System.out.println(boxResult);
    }
}
