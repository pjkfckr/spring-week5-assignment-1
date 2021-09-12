package com.codesoom.assignment.dto;

import com.codesoom.assignment.domain.UserCreateRequest;
import com.github.dozermapper.core.Mapping;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * 사용자 생성 정보를 표현합니다.
 */
@Getter
public class UserPostDto implements UserCreateRequest {
    @Email
    @NotBlank
    @Mapping("email")
    private String email;

    @NotBlank
    @Mapping("name")
    private String name;

    @NotBlank
    @Mapping("password")
    private String password;

    public UserPostDto() {}

    @Builder
    public UserPostDto(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
