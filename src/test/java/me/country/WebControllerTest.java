package me.country;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class WebControllerTest {

    @Test
    public void helloTest() {
        // Given
        WebController webController = new WebController();
        Model model = new ExtendedModelMap();

        // When
        webController.hello(model, "country");

        // Then
        model.asMap().forEach((k, v) -> System.out.println("key: " + k + ", val: " + v));
    }
}