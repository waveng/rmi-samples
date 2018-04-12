/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the
 * confidential and proprietary information of Sumpay.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Sumpay.com .
 */
package my.rmi.samples.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author wangbo 2018年1月2日 下午5:27:45
 * @date 2018年1月2日 下午5:27:45
 * @version V1.0
 */
public interface Calc extends Remote {
    int add(int a, int b) throws RemoteException ;
}
