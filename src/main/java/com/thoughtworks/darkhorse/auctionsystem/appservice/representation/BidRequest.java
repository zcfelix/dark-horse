package com.thoughtworks.darkhorse.auctionsystem.appservice.representation;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidRequest {
    private String id;
    @Positive
    private int currentPrice;
    @Positive
    private int yourPrice;
}
