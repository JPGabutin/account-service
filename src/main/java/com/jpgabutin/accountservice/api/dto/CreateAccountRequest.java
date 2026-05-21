package com.jpgabutin.accountservice.api.dto;

import javax.validation.constraints.*;

import com.jpgabutin.accountservice.component.account.domain.AccountType;

public class CreateAccountRequest {
    @NotBlank(message = "Name is required field")
    @Size(max = 50)
    private String customerName;

    @NotBlank(message = "Mobile is required field")
    @Size(max = 20)
    private String customerMobile;

    @NotBlank(message = "Email is required field")
    @Email(message = "Invalid email format")
    @Size(max = 50)
    private String customerEmail;

    @NotBlank(message = "Address1 is required field")
    @Size(max = 100)
    private String address1;

    @Size(max = 100)
    private String address2;

    @NotNull(message = "Account type is required field")
    private AccountType accountType;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
