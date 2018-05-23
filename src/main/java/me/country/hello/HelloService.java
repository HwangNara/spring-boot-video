package me.country.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Hello Spring 2.0!";
    }
}
