package com.jpgabutin.accountservice.component.account.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.jpgabutin.accountservice.component.account.domain.Account;
import com.jpgabutin.accountservice.component.account.domain.AccountRepository;

class AccountServiceTest {
    @Test
    void shouldCreateAccount() {
        AccountRepository repository = Mockito.mock(AccountRepository.class);

        AccountService service = new AccountService(repository);

        Account account = new Account();
        account.setCustomerName("Test");

        Mockito.when(repository.save(account)).thenReturn(account);

        Account result = service.createAccount(account);

        assertEquals("Test", result.getCustomerName());
    }

    @Test
    void shouldReturnAccountWhenFound() {
        AccountRepository repository = Mockito.mock(AccountRepository.class);

        AccountService service = new AccountService(repository);

        Account account = new Account();

        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(account));

        Optional<Account> result = service.getAccount(1L);

        assertTrue(result.isPresent());
    }

    @Test
    void shouldReturnEmptyWhenNotFound() {
        AccountRepository repository = Mockito.mock(AccountRepository.class);

        AccountService service = new AccountService(repository);

        Mockito.when(repository.findById(2L)).thenReturn(Optional.empty());

        Optional<Account> result = service.getAccount(2L);

        assertFalse(result.isPresent());
    }
}
