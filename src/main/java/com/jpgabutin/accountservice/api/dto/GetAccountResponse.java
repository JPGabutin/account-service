package com.jpgabutin.accountservice.api.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public List<SavingsResponse> getSavings() {
        return savings;
    }

    public Integer getTransactionStatusCode() {
        return transactionStatusCode;
    }

    public String getTransactionStatusDescription() {
        return transactionStatusDescription;
    }

}
