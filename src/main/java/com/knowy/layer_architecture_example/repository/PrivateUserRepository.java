package com.knowy.layer_architecture_example.repository;

import com.knowy.layer_architecture_example.entity.PrivateUserEntity;

public interface PrivateUserRepository {

    PrivateUserEntity findByEmail(String email);

}
