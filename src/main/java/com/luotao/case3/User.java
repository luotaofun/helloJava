package com.luotao;

public class User {
    private String name;
    private int age;

    //有参构造方法
    public User(String name, int age) {
        System.out.println("有参构造方法User被执行");
        this.name = name;
        this.age = age;
    }



    // 定义公共的getter方法获取属性值
    public String getName() {
        return name;
    }

    // 定义公共的setter方法向属性设置值
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 100) {
            System.out.println(age + "数据不合法！");
        } else {

            this.age = age;
        }

    }


    public void showInfo() {
        System.out.println("姓名：" + name + ",年龄：" + age);
    }
}
