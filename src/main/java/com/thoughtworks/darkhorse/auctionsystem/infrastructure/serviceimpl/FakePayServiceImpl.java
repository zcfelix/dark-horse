package com.thoughtworks.darkhorse.auctionsystem.infrastructure.serviceimpl;

import com.thoughtworks.darkhorse.auctionsystem.domainservice.PayService;
import org.springframework.stereotype.Component;

/**
 * 支付服务的fake实现
 */
@Component
public class FakePayServiceImpl implements PayService {

    /**
     *
     * @param userId 用户Id
     * @param accountId 账户Id
     * @param amount 支付金额
     * @return 是否成功
     */
    @Override
    public boolean pay(String userId, String accountId, int amount) {
        return true;
    }

    /**
     *
     * @param userId 用户Id
     * @param amount 收款金额
     * @return 是否成功
     */
    @Override
    public boolean receive(String userId, int amount) {
        return true;
    }
}
