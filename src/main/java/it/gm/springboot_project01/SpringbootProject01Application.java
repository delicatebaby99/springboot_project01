package it.gm.springboot_project01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("it.gm.springboot_project01.dao")
public class SpringbootProject01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProject01Application.class, args);
    }

}
