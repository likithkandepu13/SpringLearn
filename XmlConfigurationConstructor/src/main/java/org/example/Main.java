package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xmlconfig.setter.Student;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

            Student s = (Student) context.getBean("student1");
            System.out.println(s.getSid());
            System.out.println(s.getSname());
            System.out.println(s.getAddress());
            System.out.println(s.getAddress().getAddress());
        }
}