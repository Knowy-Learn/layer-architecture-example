package com.knowy.layer_architecture_example.service;

import com.knowy.layer_architecture_example.entity.PublicUserEntity;
import com.knowy.layer_architecture_example.repository.PublicUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicUserService {

    PublicUserRepository publicUserRepository;

    public PublicUserService(PublicUserRepository publicUserRepository) {
        this.publicUserRepository = publicUserRepository;
    }

    public List<PublicUserEntity> findAllPublicUsers() {
        return publicUserRepository.findAllPublicUser();
    }
}
