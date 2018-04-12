/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the confidential and proprietary information of
 * Sumpay.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Sumpay.com .
 */
package my.rmi.samples.provider;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 类NamingRegistryTest.java的实现描述：TODO 类实现描述
 *
 * @author wangbo 2018年1月2日 下午7:19:48
 * @date 2018年1月2日 下午7:19:48
 * @version V1.0
 */
public class NamingRegistryTest {
    /**
     * TODO 描述
     *
     * @author wangbo 2018年1月2日 下午7:20:36
     * @throws RemoteException
     */
    @Test
    public void registry() throws RemoteException {
        LocateRegistry.createRegistry(2020);
        NamingRegistry registry = new NamingRegistry(2020);
        List<Class<?>> cs = new ArrayList<Class<?>>();
        cs.add(CalcImpl.class);
        cs.add(HelloImpl.class);
        try {
            registry.registry(cs);
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
