package me.country;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ApplicationSecond implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("second runner");
    }
}
