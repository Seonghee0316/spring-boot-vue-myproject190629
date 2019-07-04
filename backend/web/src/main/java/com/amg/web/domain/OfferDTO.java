package com.amg.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;




/**
 * OfferDTO
 */
@Data @Component @Lazy
public class OfferDTO {
    private String id, offerId, offerPassword, offerName, offerCeoName, offerIndustry,
    offerPmName , offerPmPhone, offerHomepage, offerAddress;
}