package com.alibou.book.auth;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Builder

public class AuthenticationResponse {

    private String token;
}
