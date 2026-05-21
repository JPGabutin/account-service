package com.jpgabutin.accountservice.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAccountResponse {
    private Long customerNumber;
    private Integer transactionStatusCode;
    private String transactionStatusDescription;

    public CreateAccountResponse(Long customerNumber, Integer transactionStatusCode,
            String transactionStatusDescription) {
        this.customerNumber = customerNumber;
        this.transactionStatusCode = transactionStatusCode;
        this.transactionStatusDescription = transactionStatusDescription;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public Integer getTransactionStatusCode() {
        return transactionStatusCode;
    }

    public String getTransactionStatusDescription() {
        return transactionStatusDescription;
    }
}
