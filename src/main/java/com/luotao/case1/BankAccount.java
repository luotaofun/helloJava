package com.luotao;

/**
 * @ClassName BankAccount
 * @Description 银行存取款
 * @Author LuoTao
 * @Date 2024-05-02 14:42
 * @Version 1.0
 **/
public class BankAccount {

    /**
     * 账户
     */
    private int accountNumber;

    /**
     * 余额
     */
    private double leftmoney;

    /**
     * @param number 账号
     * @param money 初始余额
     * @return null
     * @Author LuoTao
     * @Description 构造方法
     * @Date 2024-05-02 15:27:21
     **/
    public BankAccount(int number, double money) {
        this.accountNumber = number;
        this.leftmoney = money;
    }

    /**
     * @return 存的钱
     * @Author LuoTao
     * @Description 存款方法
     * @Date 2024-05-02 15:09:59
     * @Param 存的钱
     **/
    public double saveMoney(double money) {
        this.leftmoney += money;
        return money;
    }

    /**
     * @return 现有余额
     * @Author LuoTao
     * @Description 获取现有余额
     * @Date 2024-05-02 15:12:25
     * @Param
     **/
    public double getLeftmoney() {
        return this.leftmoney;
    }

    /**
     * @return 取走金额
     * @Author LuoTao
     * @Description 取款
     * @Date 2024-05-02 15:14:42
     * @Param
     **/
    public double getMoney(double money) {
        this.leftmoney -= money;
        return money;
    }
}
