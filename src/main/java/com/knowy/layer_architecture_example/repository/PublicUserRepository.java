package com.knowy.layer_architecture_example.repository;

import com.knowy.layer_architecture_example.entity.PublicUserEntity;

import java.util.List;

public interface PublicUserRepository {

    List<PublicUserEntity> findAllPublicUser();

}
