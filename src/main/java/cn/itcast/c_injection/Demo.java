package cn.itcast.c_injection;

import cn.itcast.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void fun1(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user");
        //打印user对象
        System.out.println(u);
    }

    @Test
    public void fun2(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user2");
        //打印user对象
        System.out.println(u);
    }

    @Test
    public void fun3(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user3");
        //打印user对象
        System.out.println(u);
    }

    @Test
    public void fun4(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user4");
        //打印user对象
        System.out.println(u);
    }
}
