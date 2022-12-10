package org.sid.customerservice.configs;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.h2.console")
@Data
public class ConsulConfigConsoleEnabled {
    private boolean enabled;
}
