/****************************************************
 **                                                 **
 **        Account                          **
 **        ErrorResponse                                  **
 **        Made by Toji                          **
 **        2024-02-26 :오후 7:30                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package com.example.account.dto;


import com.example.account.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
    private ErrorCode errorCode;
    private String errormessage;
}
