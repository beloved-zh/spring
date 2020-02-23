package com.zh.demo02;

//代理角色
public class UserserviceProxy implements Userservice{
    private UserserviceImpl ser;

    public void setSer(UserserviceImpl ser) {
        this.ser = ser;
    }

    public void add() {
        log("add");
        ser.add();
    }

    public void delete() {
        log("delete");
        ser.delete();
    }

    public void update() {
        log("update");
        ser.update();
    }

    public void select() {
        log("select");
        ser.select();
    }

    //日志方法
    public void log(String msg){
        System.out.println("使用"+msg+"方法");
    }
}
