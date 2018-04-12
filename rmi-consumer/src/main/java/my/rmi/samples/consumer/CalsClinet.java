/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the
 * confidential and proprietary information of Sumpay.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Sumpay.com .
 */
package my.rmi.samples.consumer;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import my.rmi.samples.api.Calc;

/**
 * 类CalsClinet.java的实现描述：通过 Naming.lookup 获取服务
 * @author wangbo 2018年1月2日 下午5:52:17
 * @date 2018年1月2日 下午5:52:17
 * @version V1.0
 */
public class CalsClinet implements Calc {

    /* (non-Javadoc)
     * @see my.rim.samples.api.Calc#add(int, int)
     */
    public int add(int a, int b) throws RemoteException  {
        Calc calc;
        try {
            calc = (Calc)NamingUtil.lookup(Calc.class);
            return calc.add(a, b);
        } catch (MalformedURLException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (NotBoundException e) {
            throw new RemoteException(e.getMessage(), e);
        }
    }
}
