package com.kpjunaid.mapper;

import com.kpjunaid.dto.UpdateUserInfoDto;
import com.kpjunaid.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-10T19:59:20+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class MapstructMapperUpdateImpl implements MapstructMapperUpdate {

    @Override
    public void updateUserFromUserUpdateDto(UpdateUserInfoDto updateUserInfoDto, User user) {
        if ( updateUserInfoDto == null ) {
            return;
        }

        user.setBirthDate( updateUserInfoDto.getBirthDate() );
        user.setCurrentCity( updateUserInfoDto.getCurrentCity() );
        user.setEduInstitution( updateUserInfoDto.getEduInstitution() );
        user.setFirstName( updateUserInfoDto.getFirstName() );
        user.setGender( updateUserInfoDto.getGender() );
        user.setHometown( updateUserInfoDto.getHometown() );
        user.setIntro( updateUserInfoDto.getIntro() );
        user.setLastName( updateUserInfoDto.getLastName() );
        user.setWorkplace( updateUserInfoDto.getWorkplace() );
    }
}
