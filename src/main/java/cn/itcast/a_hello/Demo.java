package cn.itcast.a_hello;

import cn.itcast.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void fun1(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user");
        //打印user对象
        System.out.println(u);
    }
}
