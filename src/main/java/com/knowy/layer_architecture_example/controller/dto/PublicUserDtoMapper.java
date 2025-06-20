package com.knowy.layer_architecture_example.controller.dto;

import com.knowy.layer_architecture_example.entity.PublicUserEntity;
import org.springframework.stereotype.Component;

@Component
public class PublicUserDtoMapper {

    public PublicUserDto fromDomain(PublicUserEntity publicUserEntity) {
        PublicUserDto publicUserDto = new PublicUserDto();
        publicUserDto.setId(publicUserEntity.getId());
        publicUserDto.setUsername(publicUserEntity.getUsername());
        return publicUserDto;
    }

    public PublicUserEntity toEntity(PublicUserDto publicUserDto) {
        PublicUserEntity publicUserEntity = new PublicUserEntity();
        publicUserEntity.setId(publicUserDto.getId());
        publicUserEntity.setUsername(publicUserDto.getUsername());
        return publicUserEntity;
    }

}
