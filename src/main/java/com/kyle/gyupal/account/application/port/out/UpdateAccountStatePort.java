package com.kyle.gyupal.account.application.port.out;

import com.kyle.gyupal.account.domain.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);
}
