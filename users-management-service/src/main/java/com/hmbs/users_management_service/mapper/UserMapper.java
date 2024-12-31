package com.hmbs.users_management_service.mapper;

import com.hmbs.users_management_service.dto.UserDto;
import com.hmbs.users_management_service.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDto userDto);

    UserDto toDto(User user);
}
