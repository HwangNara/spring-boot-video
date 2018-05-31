package me.country.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    CountryProperties countryProperties;

    public String getMessage() {
        return "Hello, " + countryProperties.getName() + " " + countryProperties.getList().size();
    }
}
