package com.knowy.layer_architecture_example.repository;

import com.knowy.layer_architecture_example.entity.PublicUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaPublicUserRepository extends JpaRepository<PublicUserEntity, Integer>, PublicUserRepository {

    @Override
    default List<PublicUserEntity> findAllPublicUser() {
        return findAll();
    }
}
