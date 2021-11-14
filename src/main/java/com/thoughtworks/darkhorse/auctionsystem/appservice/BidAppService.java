package com.thoughtworks.darkhorse.auctionsystem.appservice;

import com.thoughtworks.darkhorse.auctionsystem.appservice.representation.BidRequest;
import com.thoughtworks.darkhorse.auctionsystem.domainmodel.BidContract;
import com.thoughtworks.darkhorse.auctionsystem.domainmodel.bid.BidResult;
import com.thoughtworks.darkhorse.auctionsystem.domainservice.BidContractRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BidAppService {

    private final BidContractRepo repo;

    @Autowired
    public BidAppService(BidContractRepo repo) {
        this.repo = repo;
    }

    public BidResult bid(String contractId, BidRequest bidRequest) {
        Optional<BidContract> byId = repo.findById(contractId);
        return new BidResult();
    }
}
