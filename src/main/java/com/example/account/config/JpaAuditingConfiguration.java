/****************************************************
 **                                                 **
 **        Account                          **
 **        JpaAuditingConfiguration                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오전 12:45                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class JpaAuditingConfiguration {
}
