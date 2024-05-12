package com.luotao;

class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("xiaomi", 1000, "安卓", 123);
        System.out.println(p1.downMusic("如果没有你"));
        System.out.println(p1.playGame("原神"));
        System.out.println(p1.showInfo());
    }
}