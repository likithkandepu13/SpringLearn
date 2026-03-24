package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.xmlconfig.setter.Address;
import org.xmlconfig.setter.Student;

@ComponentScan("org.xmlconfig ")
@Configuration
public class ConfigClass
{
    //@Bean //if no bean id mentioned it takes the method name with case Sensitive, :- id : getStudent.
//    public Student getStudent()
//    {
//        Student s=new Student();
//        s.setSid(12);
//        s.setSname("likith");
//        return s;
//    }
//    public Student getStudent()
//    //    {
//    //@Bean("address")
//    public Address getAddress()
//    {
//        return new Address();
//    }
}
