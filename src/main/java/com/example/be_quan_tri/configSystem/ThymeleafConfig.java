package com.example.be_quan_tri.configSystem;

import com.example.be_quan_tri.thymelaf.DateTimeFormatterUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThymeleafConfig {
    @Bean
    public DateTimeFormatterUtil dateTimeFormatterUtil() {
        return new DateTimeFormatterUtil();
    }
}
