package org.gdmg.app.mapper;

import org.gdmg.app.model.dto.UserDto;
import org.gdmg.app.persistance.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper mapper = Mappers.getMapper(UserMapper.class);

    UserDto toUserDto(User user);

    User toUser(UserDto user);

    List<UserDto> toUserDtos(List<User> users);

    List<User> toUsers(List<UserDto> userDtos);

}
