package com.example.customstarter.config;

import com.example.customstarter.RavenListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomStarterConfig {

    @Bean
    public RavenListener ravenListener() {
        return new RavenListener();
    }


}
/*
этот бин попадет в контекст того приложения, которое импортирует наш стартер
 */