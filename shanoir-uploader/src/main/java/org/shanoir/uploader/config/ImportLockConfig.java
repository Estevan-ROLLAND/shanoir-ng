package org.shanoir.uploader.config;

import java.util.concurrent.Semaphore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportLockConfig {

    @Bean
    public Semaphore importLock() {
        return new Semaphore(1);
    }
}