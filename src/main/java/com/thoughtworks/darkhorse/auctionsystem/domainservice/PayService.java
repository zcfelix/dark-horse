package com.thoughtworks.darkhorse.auctionsystem.domainservice;

import org.springframework.stereotype.Service;

@Service
public interface PayService {
    boolean pay(String userId, String accountId, int amount);

    boolean receive(String userId, int amount);
}
