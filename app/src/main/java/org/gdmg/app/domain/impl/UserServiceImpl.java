package org.gdmg.app.domain.impl;

import lombok.AllArgsConstructor;
import org.gdmg.app.domain.UserService;
import org.gdmg.app.mapper.UserMapper;
import org.gdmg.app.model.dto.UserDto;
import org.gdmg.app.persistance.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public List<UserDto> getAllUsers() {
        return mapper.toUserDtos(repository.findAll());
    }
}
