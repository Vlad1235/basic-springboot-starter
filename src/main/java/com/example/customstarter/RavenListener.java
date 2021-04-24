package com.example.customstarter;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(".....отправляем ворона - привет из кастомного стартера");
    }
}

/*
как только контекст готов(причем мы будет использовать чужой контекст - того приложения которое импортирует наш стартер),
будет запускаться логика в onApplicationEvent.
 */