package cn.edu.bjfu.maven.mavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavendemoApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(MavendemoApplication.class, args);
    }

}
