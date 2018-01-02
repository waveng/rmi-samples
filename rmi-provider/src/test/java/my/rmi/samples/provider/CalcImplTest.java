/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the confidential and proprietary information of
 * Sumpay.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Sumpay.com .
 */
package my.rmi.samples.provider;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import org.junit.Test;

/**
 * @author wangbo 2018年1月2日 下午5:27:45
 * @date 2018年1月2日 下午5:27:45
 * @version V1.0
 */

public class CalcImplTest {

    @Test
    public void add(){
        try {
            LocateRegistry.createRegistry(2020);
            CalcImpl c = new CalcImpl();
            Naming.rebind("rmi://192.168.108.74:2020/rmi/calc", c);
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
