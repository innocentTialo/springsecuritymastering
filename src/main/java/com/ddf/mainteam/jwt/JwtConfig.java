package com.ddf.mainteam.jwt;

import com.google.common.net.HttpHeaders;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * Created by InnocentTIALO on 5/22/2020.
 */
@Getter
@Setter
@Configuration
@NoArgsConstructor
@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {

    private String secretKey;

    private String tokenPrefix;

    private Integer tokenExpirationAfterDays;

    public String getAuthorizationHeader() {
        return HttpHeaders.AUTHORIZATION;
    }
}
