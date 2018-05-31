package me.country;

import me.country.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    HelloService helloService;

    @Autowired
    Environment environment;

    @RequestMapping("/")
    public String hello() {
        System.out.println(environment.getProperty("country.list[0].descr", List.class));
        System.out.println(environment.getProperty("country.name"));
        return helloService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setBanner(new MyBanner());
        application.setBannerMode(Banner.Mode.OFF);
        application.addListeners(new MyListener());
        application.run(args);

//        SpringApplication.run(Application.class, args);
    }
}


