package com.kyle.gyupal.account.application.service;

import com.kyle.gyupal.account.application.port.in.SendMoneyCommand;
import com.kyle.gyupal.account.application.port.in.SendMoneyUseCase;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SendMoneyService implements SendMoneyUseCase {

    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        return false;
    }
}
