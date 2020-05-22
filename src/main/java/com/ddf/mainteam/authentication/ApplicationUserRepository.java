package com.ddf.mainteam.authentication;

import java.util.Optional;

/**
 * Created by InnocentTIALO on 5/22/2020.
 */
public interface ApplicationUserRepository {
    Optional<ApplicationUser> findByUserName(String userName);
}
