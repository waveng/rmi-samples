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

import my.rmi.samples.api.Hello;

/**
 * 类HelloClinet.java的实现描述
 * @author wangbo 2018年1月2日 下午7:40:35
 * @date 2018年1月2日 下午7:40:35
 * @version V1.0
 */
public class HelloClinet implements Hello {

    /* (non-Javadoc)
     * @see my.rmi.samples.api.Hello#sayHi(java.lang.String)
     */
    public String sayHi(String name) throws RemoteException  {
        Hello h;
        try {
            h = (Hello)NamingUtil.lookup(Hello.class);
            return h.sayHi(name);
        } catch (MalformedURLException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (NotBoundException e) {
            throw new RemoteException(e.getMessage(), e);
        }
    }

}
