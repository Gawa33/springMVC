package cn.itcast.b_create;

import cn.itcast.bean.User;

public class UserFactory {
    //类名调用方法名可以直接创建对象
    public static User createUser(){
        System.out.println("静态工厂创建User");
        return new User();
    }
    //new 类名创建实例对象
    public User createUser2(){
        System.out.println("实例工厂创建User");
        return new User();
    }
}
