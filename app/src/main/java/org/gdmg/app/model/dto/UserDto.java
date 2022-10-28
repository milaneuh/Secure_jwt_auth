package org.gdmg.app.model.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private String mail;

    private String password;

    private String name;

    private String surname;

    private Boolean logout;

    private RoleDto role;
}
