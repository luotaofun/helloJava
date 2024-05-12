package com.luotao;

/**
 * @Author LuoTao
 * @Description
 * @Date 2024-05-02 15:24:20
 **/
class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(10086, 0);
        System.out.println("存款" + ba.saveMoney(1000) + ", 余额=" + ba.getLeftmoney() );//存款1000.0, 余额=1000.0
        System.out.println("取款" + ba.getMoney(1000) + ", 余额=" + ba.getLeftmoney() );//取款1000.0, 余额=0.0
    }
}