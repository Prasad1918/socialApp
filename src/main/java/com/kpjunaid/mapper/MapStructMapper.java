package com.kpjunaid.mapper;

import com.kpjunaid.dto.UpdateUserInfoDto;
import com.kpjunaid.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

//@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapStructMapper {
	// @Mapping(target = "clientFrom", source = "from")
	   // @Mapping(target = "clientTo", source = "to")
    User userUpdateDtoToUser(UpdateUserInfoDto updateUserInfoDto);
}
