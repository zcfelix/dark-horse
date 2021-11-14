package com.thoughtworks.darkhorse.auctionsystem.domainmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "bid_contracts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BidContract {
    @Id
    @GenericGenerator(name = "id_generator", strategy = "uuid")
    @GeneratedValue(generator = "id_generator")
    private String id;
}
