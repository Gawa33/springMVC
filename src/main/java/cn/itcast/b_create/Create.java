package cn.itcast.b_create;

import cn.itcast.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Create {
    @Test
    //创建方式1：空参构造
    public void fun1(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user");
        //打印user对象
        System.out.println(u);
    }

    @Test
    //创建方式2：静态工厂
    public void fun2(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user2");
        //打印user对象
        System.out.println(u);
    }

    @Test
    //创建方式3：动态工厂
    public void fun3(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user3");
        //打印user对象
        System.out.println(u);
    }

    @Test
    //scope:singleton（默认值） 单例对象。被标识为单例的对象在spring容器中只会存在一个实例
    //scope:prototype 多例对象。被标识为多例的对象，每次在获得才会创建，每次创建都是新的对象
    //scope:request web环境下，对象与request请求生命周期一致 （基本没用）
    //scope:session web环境下，对象与session生命周期一致  （基本没用）
    public void fun4(){

        //1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user");
        User u2 = (User) ac.getBean("user");
        User u3 = (User) ac.getBean("user");
        User u4 = (User) ac.getBean("user");
        //打印user对象
        System.out.println(u);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println(u2 == u4);  //单例是true，多例是false
    }

    @Test
    //测试生命周期方法
    public void fun5(){

        //1 创建容器对象
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //2 向容器要user对象
        User u = (User) ac.getBean("user");
        //打印user对象
        System.out.println(u);
        //关闭容器后，触发销毁方法
        ac.close();
    }


}
