package com.jpgabutin.accountservice.api.dto;

import java.util.List;

public class GetAccountResponse {

    private Long customerNumber;
    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private String address1;
    private String address2;

    private List<SavingsResponse> savings;

    private Integer transactionStatusCode;
    private String transactionStatusDescription;

    public GetAccountResponse(
            Long customerNumber,
            String customerName,
            String customerMobile,
            String customerEmail,
            String address1,
            String address2,
            List<SavingsResponse> savings,
            Integer transactionStatusCode,
            String transactionStatusDescription) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.address1 = address1;
        this.address2 = address2;
        this.savings = savings;
        this.transactionStatusCode = transactionStatusCode;
        this.transactionStatusDescription = transactionStatusDescription;
    }

}
