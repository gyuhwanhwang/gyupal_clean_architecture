package com.kyle.gyupal.account.application.port.out;

import com.kyle.gyupal.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);

}