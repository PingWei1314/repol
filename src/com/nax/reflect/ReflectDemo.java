package com.nax.reflect;

import com.nax.bean.Person;

import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {

        Class cls2=Person.class;
        //field[] getFields()  获取所有的public修饰的成员变量
        Field[] fields = cls2.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        System.out.println("-----------");
        Field name = cls2.getField("name");
        System.out.println(name);
        Person person=new Person();
        Object value = name.get(person);
        System.out.println(value);
        name.set(person,"张三");
        Object value1 = name.get(person);
        System.out.println(value1);
        System.out.println("==========================");
        //field[]  getDeclaredFields()  所有的成员变量，不考虑修饰词
        Field[] fields1 = cls2.getDeclaredFields();
        for (Field declar:fields1) {
            System.out.println(declar);
        }
        Field age = cls2.getDeclaredField("age");
        age.setAccessible(true);
        Object o = age.get(person);
        System.out.println(o);
        //
        

    }
}
