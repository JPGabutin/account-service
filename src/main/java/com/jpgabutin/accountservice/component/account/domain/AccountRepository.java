package com.jpgabutin.accountservice.component.account.domain;

import java.util.Optional;

public interface AccountRepository {
    Account save(Account account);

    Optional<Account> findById(Long id);
}
