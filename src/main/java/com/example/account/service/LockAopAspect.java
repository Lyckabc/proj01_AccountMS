/****************************************************
 **                                                 **
 **        Account                          **
 **        LockAopAspect                                  **
 **        Made by Toji                          **
 **        2024-02-26 :오후 7:49                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.service;


import com.example.account.aop.AccountLockIdInterface;
import com.example.account.dto.UseBalance;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class LockAopAspect {
    private final LockService lockService;

    @Around("@annotation(com.example.account.aop.AccountLock) && args(request)")
    public Object aroundMethod(
            ProceedingJoinPoint pjp,
            AccountLockIdInterface request
    ) throws Throwable {
        String accountNumber = request.getAccountNumber();
        // lock 취득 시도
        lockService.lock(accountNumber);
        try {
            //before
            return pjp.proceed();
            //after
        } finally {
            //lock 해제
            lockService.unlock(accountNumber);
        }
    }
}
