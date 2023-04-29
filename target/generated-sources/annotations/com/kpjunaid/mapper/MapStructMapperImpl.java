package com.kpjunaid.mapper;

import com.kpjunaid.dto.UpdateUserInfoDto;
import com.kpjunaid.entity.User;
import com.kpjunaid.entity.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-28T14:56:38+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public User userUpdateDtoToUser(UpdateUserInfoDto updateUserInfoDto) {
        if ( updateUserInfoDto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.birthDate( updateUserInfoDto.getBirthDate() );
        user.currentCity( updateUserInfoDto.getCurrentCity() );
        user.eduInstitution( updateUserInfoDto.getEduInstitution() );
        user.firstName( updateUserInfoDto.getFirstName() );
        user.gender( updateUserInfoDto.getGender() );
        user.hometown( updateUserInfoDto.getHometown() );
        user.intro( updateUserInfoDto.getIntro() );
        user.lastName( updateUserInfoDto.getLastName() );
        user.workplace( updateUserInfoDto.getWorkplace() );

        return user.build();
    }
}
