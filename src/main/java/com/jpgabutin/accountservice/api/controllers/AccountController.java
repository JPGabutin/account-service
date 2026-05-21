package com.jpgabutin.accountservice.api.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jpgabutin.accountservice.api.dto.CreateAccountRequest;
import com.jpgabutin.accountservice.api.dto.CreateAccountResponse;
import com.jpgabutin.accountservice.api.dto.GetAccountResponse;
import com.jpgabutin.accountservice.component.account.domain.Account;
import com.jpgabutin.accountservice.component.account.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<CreateAccountResponse> createAccount(@Valid @RequestBody CreateAccountRequest request) {
        Account account = new Account();
        account.setCustomerName(request.getCustomerName());
        account.setCustomerMobile(request.getCustomerMobile());
        account.setCustomerEmail(request.getCustomerEmail());
        account.setAddress1(request.getAddress1());
        account.setAddress2(request.getAddress2());
        account.setAccountType(request.getAccountType());

        Account createdAccount = accountService.createAccount(account);

        CreateAccountResponse response = new CreateAccountResponse(createdAccount.getId(), 201,
                "Customer account created");

        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetAccountResponse> getAccount(@PathVariable Long id) {
        Optional<Account> account = accountService.getAccount(id);

        if (!account.isPresent()) {
            GetAccountResponse response = new GetAccountResponse(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    401,
                    "Customer not found");

            return ResponseEntity.status(401).body(response);
        }

        Account found = account.get();

        GetAccountResponse response = new GetAccountResponse(
                found.getId(),
                found.getCustomerName(),
                found.getCustomerMobile(),
                found.getCustomerEmail(),
                found.getAddress1(),
                found.getAddress2(),
                java.util.Collections.emptyList(),
                302,
                "Customer account found");

        return ResponseEntity.status(302).body(response);
    }
}
