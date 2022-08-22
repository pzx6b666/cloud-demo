package com.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableAutoConfiguration
public class Student {

     private String name;

     private String age;
    @Bean
    public Student getStudent(){

        Map<String,Object> map=new HashMap<String,Object>();
        map.put(null,"");

        return new Student();
    }

    public String getName() {
        return name;
    }

    @Value("${name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
