/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the
 * confidential and proprietary information of Sumpay.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Sumpay.com .
 */
package my.rmi.samples.consumer;

import org.junit.Assert;
import org.junit.Test;

/**
 * 类HelloClinetTest.java的实现描述：TODO 类实现描述
 * @author wangbo 2018年1月2日 下午7:42:02
 * @date 2018年1月2日 下午7:42:02
 * @version V1.0
 */
public class HelloClinetTest {
    @Test
    public void sayHi() {
        String s;
        try {
            s = new HelloClinet().sayHi("rmi");
            Assert.assertNotNull(s);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
