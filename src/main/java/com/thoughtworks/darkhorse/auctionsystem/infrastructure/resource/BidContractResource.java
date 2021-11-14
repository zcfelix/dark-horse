package com.thoughtworks.darkhorse.auctionsystem.infrastructure.resource;

import com.thoughtworks.darkhorse.auctionsystem.appservice.BidAppService;
import com.thoughtworks.darkhorse.auctionsystem.appservice.representation.BidRepresentation;
import com.thoughtworks.darkhorse.auctionsystem.appservice.representation.BidRequest;
import com.thoughtworks.darkhorse.auctionsystem.domainmodel.bid.BidResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/bid-contracts/{id}/bid-requests")
public class BidContractResource {

    private final BidAppService appService;

    @Autowired
    public BidContractResource(BidAppService appService) {
        this.appService = appService;
    }

    @PostMapping
    public ResponseEntity<BidRepresentation> bid(@PathVariable("id") String contractId,
                                                 @Valid @RequestBody BidRequest bidRequest) {
        BidResult result = appService.bid(contractId, bidRequest);
        final URI link = linkTo(methodOn(this.getClass()).bid(contractId, bidRequest)).slash(result.getId()).toUri();

        return ResponseEntity.created(link).body(BidRepresentation.from(result, link));
    }
}
