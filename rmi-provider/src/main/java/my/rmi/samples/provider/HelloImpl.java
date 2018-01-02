/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the
 * confidential and proprietary information of Sumpay.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Sumpay.com .
 */
package my.rmi.samples.provider;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import my.rmi.samples.api.Hello;

/**
 * 类HelloImpl.java的实现描述：TODO 类实现描述
 * @author wangbo 2018年1月2日 下午7:01:10
 * @date 2018年1月2日 下午7:01:10
 * @version V1.0
 */
public class HelloImpl extends UnicastRemoteObject implements Hello {


    /**
     *
     */
    private static final long serialVersionUID = -8750887891210286652L;

    /**
     * @throws RemoteException
     */
    protected HelloImpl() throws RemoteException {
        super();
    }

    /* (non-Javadoc)
     * @see my.rmi.samples.api.Hello#sayHi(java.lang.String)
     */
    public String sayHi(String name) {
        return "hello " + name;
    }

}
