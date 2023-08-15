package com.kyle.gyupal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GyuPalConfigurationProperties.class)
public class GyuPalConfiguration {
}
