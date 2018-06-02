package me.country.hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevBean implements MyBean{

    @Override
    public String getMessage() {
        return "dev bean";
    }
}
