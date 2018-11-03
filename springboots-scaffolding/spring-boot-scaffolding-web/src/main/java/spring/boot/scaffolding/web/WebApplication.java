package spring.boot.scaffolding.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.boot.scaffolding.web.contorller.DemoController;

@SpringBootApplication
public class WebApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoController.class, args);

    }
}
