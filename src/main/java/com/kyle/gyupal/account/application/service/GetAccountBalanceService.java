package com.kyle.gyupal.account.application.service;

import com.kyle.gyupal.account.domain.Money;
import com.kyle.gyupal.account.application.port.in.GetAccountBalanceQuery;
import com.kyle.gyupal.account.application.port.out.LoadAccountPort;
import com.kyle.gyupal.account.domain.Account;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}