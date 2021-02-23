package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/myconfig/myconfig.properties")
public class Springboot1Application {

    public static void main(String[] args) {
	//组员A修改
	    //组员b修改
        //lyw 分支修改代码
	    //张三修改代码
        SpringApplication.run(Springboot1Application.class, args);
    }

}
