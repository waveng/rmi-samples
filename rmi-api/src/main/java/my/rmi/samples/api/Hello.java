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
 * 类Hello.java的实现描述：TODO 类实现描述
 * @author wangbo 2018年1月2日 下午6:59:07
 * @date 2018年1月2日 下午6:59:07
 * @version V1.0
 */
public interface Hello extends Remote {
    /**
     * TODO 描述
     * @author wangbo 2018年1月2日 下午6:59:23
     */
    String sayHi(String name) throws Exception;
}
