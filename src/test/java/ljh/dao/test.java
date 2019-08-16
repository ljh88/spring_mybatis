package ljh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        Object employeeDao = context.getBean("employeeDao");
        System.out.println(employeeDao);
    }
}
