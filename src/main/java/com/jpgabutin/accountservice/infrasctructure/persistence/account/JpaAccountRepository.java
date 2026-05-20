package com.jpgabutin.accountservice.infrasctructure.persistence.account;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpgabutin.accountservice.component.account.domain.Account;

public interface JpaAccountRepository extends JpaRepository<Account, Long> {
}
