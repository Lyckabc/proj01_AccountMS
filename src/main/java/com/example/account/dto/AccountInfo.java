/****************************************************
 **                                                 **
 **        Account                          **
 **        AccountInfo                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오후 2:46                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInfo {
    private String accountNumber;
    private Long balance;
}

