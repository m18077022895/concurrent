package cn.enjoyedu.ch7.tranfer.service;

import cn.enjoyedu.ch7.tranfer.UserAccount;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：不会产生死锁的安全转账
 */
public class SafeOperate implements ITransfer {

    private static Object tieLock = new Object();

    @Override
    public void transfer(UserAccount from, UserAccount to, int amount)
            throws InterruptedException {

        //TODO
    }
}
