package me.country;

import me.country.hello.CountryProperties;
import me.country.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    HelloService helloService;

    @Autowired
    Environment environment;

    @Bean
    @ConfigurationProperties("country")
    @Validated
    public CountryProperties countryProperties() {
        return new CountryProperties();
    }

    @RequestMapping("/")
    public String hello() {
        System.out.println(countryProperties().getNumber2());
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


