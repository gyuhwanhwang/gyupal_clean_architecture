package com.kyle.gyupal.account.application.port.in;

import com.kyle.gyupal.account.domain.Money;
import com.kyle.gyupal.account.domain.Account.AccountId;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);

}