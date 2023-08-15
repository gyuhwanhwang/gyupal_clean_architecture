package com.kyle.gyupal;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "gyupal")
public class GyuPalConfigurationProperties {

    private long transferThreshold = Long.MAX_VALUE;

}
