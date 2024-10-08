package com.alibou.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {


    @NotEmpty(message = "firstname is  mandatory")
    @NotBlank(message = "firstname is mandatory")
    private String firstname;
    @NotEmpty(message = "lastname is  mandatory")
    @NotBlank(message = "lastname is mandatory")
    private String lastname;
    @NotEmpty(message = "email is  mandatory")
    @NotBlank(message = "email is mandatory")
    @Email(message = "Email is not  formated")
    private  String email;
    @NotEmpty(message = "password is  mandatory")
    @NotBlank(message = "password is mandatory")
    @Size(min =8, message = "Password should be 8 characters")
    private  String password;
}
