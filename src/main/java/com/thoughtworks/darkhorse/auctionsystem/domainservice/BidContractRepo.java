package com.thoughtworks.darkhorse.auctionsystem.domainservice;

import com.thoughtworks.darkhorse.auctionsystem.domainmodel.BidContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidContractRepo extends JpaRepository<BidContract, String> {
}
