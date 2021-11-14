package com.thoughtworks.darkhorse.auctionsystem.domainmodel.bid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BidResult {
    private String id;
    private int prevPrice;
    private int curPrice;
    private String contractId;
    private boolean success;
}
