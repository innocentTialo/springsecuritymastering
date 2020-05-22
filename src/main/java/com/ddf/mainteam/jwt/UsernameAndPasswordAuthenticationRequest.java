package com.ddf.mainteam.jwt;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by InnocentTIALO on 5/22/2020.
 */
@Data
@NoArgsConstructor
public class UsernameAndPasswordAuthenticationRequest {
    private String username;
    private String password;
}
