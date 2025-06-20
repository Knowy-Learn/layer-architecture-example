package com.knowy.layer_architecture_example.service;

import com.knowy.layer_architecture_example.repository.PrivateUserRepository;
import org.springframework.stereotype.Service;

@Service
public class AccessService {

    PrivateUserRepository privateUserRepository;

    public AccessService(PrivateUserRepository privateUserRepository) {
        this.privateUserRepository = privateUserRepository;
    }

    public boolean authenticate(String email, String password) {
        String encodedPassword = privateUserRepository.findByEmail(email).getPassword();
        return compare(password, encodedPassword);
    }

    public boolean compare(String rawPassword, String encodedPassword) {
        return rawPassword.equals(encodedPassword);
    }

}
