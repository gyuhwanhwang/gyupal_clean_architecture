package com.kyle.gyupal.application.port.in;

import com.kyle.gyupal.domain.Account.AccountId;
import com.kyle.gyupal.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);

}