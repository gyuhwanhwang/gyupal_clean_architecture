package com.kyle.gyupal.account.application.port.out;

import com.kyle.gyupal.account.domain.Account;
import com.kyle.gyupal.account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
