package com.geekq.design.pattern.structural.bridge;

/**
 * 储蓄账号
 * 
 * @author shengwangzhong
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        // ...
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {

        System.out.println("这是一个活期账号");
    }
}
