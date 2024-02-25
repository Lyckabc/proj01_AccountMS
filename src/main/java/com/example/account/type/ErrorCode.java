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
    AMOUNT_EXCEED_BALNANCE("거래금액이 계좌잔액보다 큽니다."),
    USER_NOT_FOUND("사용자가 없습니다."),
    ACCOUNT_NOT_FOUND("계좌가 없습니다."),
    USER_ACCOUNT_UN_MATCH("선택한 계좌가 다릅니다."),
    ACCOUNT_ALREADY_UNREGISTERED("계좌가 이미 해지되었습니다."),
    BALANCE_NOT_EMPTY("잔액이 있는 계좌는 해지할 수 없습니다."),
    MAX_ACCOUNT_PER_USER_10("사용자 최대 계좌는 10개입니다.");
    private final String description;
}
