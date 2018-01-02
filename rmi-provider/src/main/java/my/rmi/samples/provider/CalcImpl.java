/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the confidential and proprietary information of
 * Sumpay.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Sumpay.com .
 */
package my.rmi.samples.provider;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import my.rmi.samples.api.Calc;

/**
 * @author wangbo 2018年1月2日 下午5:27:45
 * @date 2018年1月2日 下午5:27:45
 * @version V1.0
 */
public class CalcImpl extends UnicastRemoteObject implements Calc {
    /**
     *
     */
    private static final long serialVersionUID = 7016957413787646690L;
    /**
     * @throws RemoteException
     *
     */
    public CalcImpl() throws RemoteException {
        super();
    }
    public int add(int a, int b) {
        return a + b;
    }
}
