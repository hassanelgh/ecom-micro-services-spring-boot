package org.sid.billing.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "token")
@Data
public class TokenConfigConsul {
    private long accessTokenTimeout;
    private long refreshTokenTimeout;
}
