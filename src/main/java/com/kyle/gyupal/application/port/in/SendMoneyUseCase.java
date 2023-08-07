package com.kyle.gyupal.application.port.in;

public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);

}