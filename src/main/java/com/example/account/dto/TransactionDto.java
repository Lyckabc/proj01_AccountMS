/****************************************************
 **                                                 **
 **        Account                          **
 **        TransactionDto                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오후 8:43                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.dto;

import com.example.account.domain.Account;
import com.example.account.type.TransactionResultType;
import com.example.account.type.TransactionType;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDto {
   private String accountNumber;
   private TransactionType transactionType;
   private TransactionResultType transactionResultType;

   private Long amount;
   private Long balanceSnapshot;

   private String transactionId;
   private LocalDateTime transactedAt;
}
