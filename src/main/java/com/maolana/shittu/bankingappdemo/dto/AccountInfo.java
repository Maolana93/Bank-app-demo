package com.maolana.shittu.bankingappdemo.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInfo {
    private String accountName;
    private BigDecimal accountBalance;
    private String accountNumber;

}
