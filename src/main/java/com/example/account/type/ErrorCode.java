package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/****************************************************
 **                                                 **
 **        Account                          **
 **        ErrorCode                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오전 12:54                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다."),
    MAX_ACCOUNT_PER_USER_10("사용자 최대 계좌는 10개입니다.");
    private final String description;
}
