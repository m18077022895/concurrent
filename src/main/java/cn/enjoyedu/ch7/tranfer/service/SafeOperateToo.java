package cn.enjoyedu.ch7.tranfer.service;

import cn.enjoyedu.ch7.tranfer.UserAccount;

import java.util.Random;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：不会产生死锁的安全转账第二种方法
 */
public class SafeOperateToo implements ITransfer {

    @Override
    public void transfer(UserAccount from, UserAccount to, int amount)
            throws InterruptedException {
        Random r = new Random();
        while(true){
            //TODO
            Thread.sleep(r.nextInt(10));
        }

    }
}
