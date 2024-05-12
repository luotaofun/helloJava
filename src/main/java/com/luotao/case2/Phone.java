package com.luotao;

/**
 * @ClassName Phone
 * @Description 手机类
 * @Author LuoTao
 * @Date 2024-05-02 15:47
 * @Version 1.0
 **/
public class Phone {

    /**
     * 手机品牌
     */
    private String brand;
    /**
     * 手机价格
     */
    private double price;
    /**
     * 手机型号
     */
    private String type;
    /**
     * 手机内存
     */
    private int memorySize;

    public Phone() {
    }

    public Phone(String brand, double price, String type, int memorySize) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.memorySize = memorySize;
    }

    public String showInfo() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }

    /**
     * @Author LuoTao
     * @Description 打游戏
     * @Date 2024-05-02 16:04:12
     * @Param 游戏名
     * @return 游戏名
     **/
    public String playGame(String gameName){
        return gameName + "启动！";
    }
    
    /***
     * @Author LuoTao
     * @Description 下载音乐
     * @Date 2024-05-02 16:02:50
     * @Param 下载音乐名
     * @return 下载音乐名
     **/
    public String downMusic(String musicName){
        return "<"+ musicName + ">" + "下载成功！";
    }

}
