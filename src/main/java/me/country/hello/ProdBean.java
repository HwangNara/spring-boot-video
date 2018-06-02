package me.country.hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean implements MyBean {

    @Override
    public String getMessage() {
        return "prod bean";
    }
}
