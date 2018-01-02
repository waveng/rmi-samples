/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the
 * confidential and proprietary information of Sumpay.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Sumpay.com .
 */
package my.rmi.samples.consumer;

import java.rmi.Naming;

import my.rmi.samples.api.Calc;

/**
 * 类CalsClinet.java的实现描述：TODO 类实现描述
 * @author wangbo 2018年1月2日 下午5:52:17
 * @date 2018年1月2日 下午5:52:17
 * @version V1.0
 */
public class CalsClinet implements Calc {

    /* (non-Javadoc)
     * @see my.rim.samples.api.Calc#add(int, int)
     */
    public int add(int a, int b) throws Exception {
        Calc calc = (Calc)Naming.lookup("rmi://192.168.108.74:2020/rmi/calc");
        return calc.add(a, b);
    }
}
