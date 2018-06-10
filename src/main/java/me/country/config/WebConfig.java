package me.country.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * HandlerMapping, HandlerAdapter, ExceptionHandler => WebMvcRegistartions
 * 기타 등등 => WebMvcConfigurer
 * 부트가 제공하는 걸 안쓰고 일일히 다 설정 => @EnableWebMvc
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

}
