package com.kyle.gyupal.application.service;

import com.kyle.gyupal.application.port.in.GetAccountBalanceQuery;
import com.kyle.gyupal.application.port.out.LoadAccountPort;
import com.kyle.gyupal.domain.Account;
import com.kyle.gyupal.domain.Money;
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