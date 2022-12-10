package org.sid.customerservice.configs;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "management.endpoints.web.exposure")
@Data
public class ConsulConfigManagementEndpoints {
    private String include;
}