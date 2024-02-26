/****************************************************
 **                                                 **
 **        Account                          **
 **        AccountDto                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오전 1:04                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AccountDto extends BaseEntity{
    private Long userId;
    private String accountNumber;
    private Long balance;

    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;

    public static AccountDto fromEntity(Account account) {
        return AccountDto.builder()
                .userId(account.getAccountUser().getId())
                .accountNumber(account.getAccountNumber())
                .balance(account.getBalance())
                .registeredAt(account.getRegisteredAt())
                .unRegisteredAt(account.getUnRegisteredAt())
                .build();
    }
}
