package com.kyle.gyupal.application.service;

import com.kyle.gyupal.application.port.in.SendMoneyCommand;
import com.kyle.gyupal.application.port.in.SendMoneyUseCase;

public class SendMoneyService implements SendMoneyUseCase {

    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        return false;
    }
}
