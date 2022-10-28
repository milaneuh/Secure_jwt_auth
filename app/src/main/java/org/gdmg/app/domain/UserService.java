package org.gdmg.app.domain;

import org.gdmg.app.model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
}
