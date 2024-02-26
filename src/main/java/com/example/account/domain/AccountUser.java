/****************************************************
 **                                                 **
 **        Account                          **
 **        AccountUser                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오전 12:41                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class AccountUser extends BaseEntity {
    private String name;
}


