package com.txsk;

import com.model.SayHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 耀源 on 2016/12/20.
 */
@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }

    @RequestMapping("/")
    public String home(String name){
        System.out.println("home");
        return SayHello.sayHello(name);
    }

}
