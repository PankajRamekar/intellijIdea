package com.xe.demo;


import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MyTest {
    private static final Logger LOGGER= LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        String name= "pankaj";
        String s = getName("Amol");
        LOGGER.info(s);

    }
     public static String getName(String name){
        LOGGER.info("My name is",   name);
        return name;
     }
}
