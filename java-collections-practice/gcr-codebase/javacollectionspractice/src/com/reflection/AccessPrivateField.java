package com.reflection;

import java.lang.reflect.Field;

class Person {
    private int age = 0;
    private String name="Gourav";
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class<?> class1 = p.getClass();
        
        Field field = class1.getDeclaredField("age");
        Field name=class1.getDeclaredField("name");
        name.setAccessible(true);  
        field.setAccessible(true);
        name.set(p, new String("Ali Ahamd"));
        field.setInt(p, 25);
        
        System.out.println(field.getInt(p));
        System.out.println(name.get(p));
    }
}
