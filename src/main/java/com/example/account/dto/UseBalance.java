/****************************************************
 **                                                 **
 **        Account                          **
 **        UseBalance                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오후 8:16                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.dto;


import com.example.account.controller.TransactionController;
import com.example.account.domain.AccountDto;
import com.example.account.type.TransactionResultType;
import lombok.*;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

public class UseBalance {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request {
        @NotNull
        @Min(1)
        private Long userId;

        @NotBlank
        @Size(min = 10, max =10)
        private String accountNumber;

        @NotNull
        @Min(10)
        @Max(1000000000)
        private Long amount;
    }
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private String accountNumber;
        private TransactionResultType TransactionResult;
        private String transactionId;
        private Long amount;
        private LocalDateTime transactedAt;

        public static CreateAccount.Response from(AccountDto accountDto) {
            return CreateAccount.Response.builder()
                    .userId(accountDto.getUserId())
                    .accountNumber(accountDto.getAccountNumber())
                    .registeredAt(accountDto.getRegisteredAt())
                    .build();
        }
    }

}
