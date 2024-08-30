package com.study.java_study.ch22_예외;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginException extends RuntimeException {
    // RuntimeException -> 메세지(message)가 중요하다
    private String username;

    public LoginException(String message, String username) {
        super(message);
        this.username = username;
    }
    public String getErrorMessage() {
        return username + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다";
    }
}
