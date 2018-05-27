package me.country;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class ApplicationRunnerFirst implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("first runner");
    }
}
