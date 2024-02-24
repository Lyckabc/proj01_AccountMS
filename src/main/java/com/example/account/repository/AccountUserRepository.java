package com.example.account.repository;

import com.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/****************************************************
 **                                                 **
 **        Account                          **
 **        AccountUserRepository                                  **
 **        Made by Toji                          **
 **        2024-02-25 :오전 12:50                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/

@Repository
public interface AccountUserRepository extends JpaRepository<AccountUser, Long> {
}
