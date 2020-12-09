package com.rakovets.course.javabasics;

import com.rakovets.course.javabasics.reflection.HomeWork;
import com.rakovets.course.javabasics.reflection.RefUtil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<HomeWork> demo = HomeWork.class;

        Field resultField = RefUtil.getClassField(demo, "mark");
        System.out.println(resultField.getName());

        Method methods = RefUtil.getClassMethods(demo, "getMark");

        System.out.println(methods);
        Method[] arrayOfmethods = RefUtil.getArrayOfMethods(demo);
        System.out.println("-------------------------------");
        for (Method method: arrayOfmethods ) {
            System.out.println(method.getName());
        }

        System.out.println("**********************************");
        HomeWork demo1 = new HomeWork(3,"Lesson String");


        System.out.println(RefUtil.getValueFromMethodsReflection(methods, demo1));

        RefUtil.setValueFromInput(demo.getDeclaredField("mark"), demo1, 55 );

        System.out.println(demo1.getMark());


    }


}
