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


import com.example.account.aop.AccountLockIdInterface;
import com.example.account.type.TransactionResultType;
import com.example.account.type.TransactionType;
import lombok.*;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

/**
 * {
 * "transactionId": asdasdoijakjsdnkajsdh,
 * "accountNumber": "1000000000",
 * "amount" : 12345
 * }
 */

public class CancelBalance {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request implements AccountLockIdInterface {
        @NotBlank
        private String transactionId;

        @NotBlank
        @Size(min = 10, max = 10)
        private String accountNumber;

        @NotNull
        @Min(10)
        @Max(1000_000_000)
        private Long amount;


    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private String accountNumber;
        private TransactionResultType transactionResult;
        private String transactionId;
        private Long amount;
        private LocalDateTime transactedAt;
        private TransactionType transactionType;

        public static Response from(TransactionDto transactionDto) {
            return Response.builder()
                    .accountNumber(transactionDto.getAccountNumber())
                    .transactionType(transactionDto.getTransactionType())
                    .transactionResult(transactionDto.getTransactionResultType())
                    .transactionId(transactionDto.getTransactionId())
                    .amount(transactionDto.getAmount())
                    .transactedAt(transactionDto.getTransactedAt())
                    .build();
        }
    }

}
