package com.example.account.aop;

import java.lang.annotation.*;

/****************************************************
 **                                                 **
 **        Account                          **
 **        AccountLock                                  **
 **        Made by Toji                          **
 **        2024-02-26 :오후 7:47                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AccountLock {
    long tryLockTime() default 5000L;
}
