package com.geekq.design.pattern.structural.bridge;

/**
 * 桥接模式
 * 
 * @author shengwangzhong
 */
public class Test {
    public static void main(String[] args) {

        // 存款人账户
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        // 储蓄账户
        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
