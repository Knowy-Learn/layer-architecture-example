package com.knowy.layer_architecture_example.controller.dto;

import com.knowy.layer_architecture_example.entity.PublicUserEntity;
import org.springframework.stereotype.Component;

@Component
public class PublicUserWithPrivateDataDtoMapper {

    public PublicUserWithPrivateDataDto fromDomain(PublicUserEntity publicUserEntity) {
        PublicUserWithPrivateDataDto dto = new PublicUserWithPrivateDataDto();
        dto.setId(publicUserEntity.getId());
        dto.setUsername(publicUserEntity.getUsername());
        dto.setEmail(publicUserEntity.getPrivateUser().getEmail());
        dto.setPassword(publicUserEntity.getPrivateUser().getPassword());
        return dto;
    }
}
