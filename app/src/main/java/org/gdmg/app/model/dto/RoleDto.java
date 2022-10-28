package org.gdmg.app.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoleDto {
    private Long id;

    private String code;

    private String label;

    private List<AuthorityDto> authorities;
}
