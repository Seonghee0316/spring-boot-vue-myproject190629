package com.amg.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;




/**
 * OfferDTO
 */
@Data @Component @Lazy
public class OfferDTO {
    private String offer_seq_no, offer_id, offer_password, offer_name, offer_ceo_name, offer_industry,
    offer_pm_name , offer_pm_phone, offer_homepage, offer_address;
}