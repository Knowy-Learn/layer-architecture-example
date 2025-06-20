package com.knowy.layer_architecture_example.repository;

import com.knowy.layer_architecture_example.entity.PrivateUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPrivateUserRepository extends JpaRepository<PrivateUserEntity, Integer>, PrivateUserRepository {

    @Override
    PrivateUserEntity findByEmail(String email);
}
