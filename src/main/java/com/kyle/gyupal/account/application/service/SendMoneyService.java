package com.kyle.gyupal.account.application.service;

import com.kyle.gyupal.account.application.port.in.SendMoneyCommand;
import com.kyle.gyupal.account.application.port.in.SendMoneyUseCase;

public class SendMoneyService implements SendMoneyUseCase {

    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        return false;
    }
}
