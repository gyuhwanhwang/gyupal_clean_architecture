package com.kyle.gyupal.account.application.service;

import com.kyle.gyupal.account.application.port.out.AccountLock;
import com.kyle.gyupal.account.domain.Account.AccountId;
import org.springframework.stereotype.Component;

@Component
class NoOpAccountLock implements AccountLock {

    @Override
    public void lockAccount(AccountId accountId) {
        // do nothing
    }

    @Override
    public void releaseAccount(AccountId accountId) {
        // do nothing
    }

}
