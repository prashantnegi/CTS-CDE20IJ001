package com.cts.training.core;

public interface AccountOpeningEventPublisher {

    void notify(String accountId);
}
