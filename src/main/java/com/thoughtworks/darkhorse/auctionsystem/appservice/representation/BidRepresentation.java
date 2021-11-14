package com.thoughtworks.darkhorse.auctionsystem.appservice.representation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.thoughtworks.darkhorse.auctionsystem.domainmodel.bid.BidResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.Positive;
import java.net.URI;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidRepresentation {
    private String uri;
    @Positive
    private int currentPrice;
    @Positive
    private int yourPrice;

    private boolean success;

    public static BidRepresentation from(BidResult result, URI link) {
        return new BidRepresentation(
                link.toString(),
                result.getPrevPrice(),
                result.getCurPrice(),
                result.isSuccess()
        );
    }
}
