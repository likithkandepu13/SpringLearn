package org.xmlconfig.setter;

public class Student {
    private int sid;
    private String sname;

    public Student() {
        System.out.println("Student Object created");
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }



    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    /*  <bean id="add1" class="org.xmlconfig.setter.Address">
        <property name="num" value="2"></property>
        <property name="address" value="homestay"></property>
    </bean>
    <bean id="address" class="org.xmlconfig.setter.Address">
        <property name="num" value="3"></property>
        <property name="address" value="shore stay"></property>
    </bean>
    <bean id="student1" class="org.xmlconfig.setter.Student" autowire="byName">
        <property name="sid" value="111"></property>
        <property name="sname" value="sairam"></property>
    </bean>
    By name autowiring can be done only in Setter injection only!
    */

}
