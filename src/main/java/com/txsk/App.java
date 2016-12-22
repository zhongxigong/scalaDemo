package com.txsk;

import com.model.SS;
import com.model.SayHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scala.collection.Iterator;
import scala.collection.Seq;
import scala.collection.immutable.List;

/**
 * Created by yaoyuan on 2016/12/20.
 */
@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }

    @RequestMapping("/main")
    public String home(String name){
        System.out.println("home");
        Seq<String> pp = SS.pp();
        return SayHello.sayHello(name)+ getString(pp);
    }

    @RequestMapping("/")
    public String index(){
        return "Hello Hello World";
    }

    private String getString(Seq list){
        StringBuffer sb = new StringBuffer();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next());
        }
        return sb.toString();
    }

}
