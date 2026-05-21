package com.jpgabutin.accountservice.api.dto;

public class SavingsResponse {

    private Long accountNumber;

    private String accountType;

    private Integer balance;

    public SavingsResponse(Long accountNumber, String accountType, Integer balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}
