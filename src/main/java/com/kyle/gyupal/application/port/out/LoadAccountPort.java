package com.kyle.gyupal.application.port.out;

import com.kyle.gyupal.domain.Account;
import com.kyle.gyupal.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
