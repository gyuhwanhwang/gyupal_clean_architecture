package com.kyle.gyupal.account.application.port.out;

import com.kyle.gyupal.account.domain.Account;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate);
}
