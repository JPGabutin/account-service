package com.jpgabutin.accountservice.infrasctructure.persistence.account;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jpgabutin.accountservice.component.account.domain.Account;
import com.jpgabutin.accountservice.component.account.domain.AccountRepository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    private final JpaAccountRepository jpaRepository;

    public AccountRepositoryImpl(JpaAccountRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Account save(Account account) {
        return jpaRepository.save(account);
    }

    @Override
    public Optional<Account> findById(Long id) {
        return jpaRepository.findById(id);
    }
}
