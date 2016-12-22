package com.txsk;

import org.junit.Test;

/**
 * Created by yaoyuan on 2016/10/5.
 */
public class Hello {
//    public static void main(String[] args){
//        System.out.print("Hello World");
//    }

    public String sayHello(String name){
        return "Hello" + name;
    }

    @Test
    public void myTest(){
        System.out.println("Hello World");
    }
}
