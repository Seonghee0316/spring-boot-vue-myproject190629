package com.amg.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Offer
 */

 @NoArgsConstructor(access = AccessLevel.PUBLIC)
 @Entity
 @Getter
 @Setter
 @ToString
 @Table(name = "offers")
public class Offer implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long offerSeqNo;

    @Column(name="offer_id") private String offerId;
    @Column(name="offer_password") private String offerPassword;
    @Column(name="offer_name") private String offerName; 
    @Column(name="offer_ceo_name") private String offerCeoName; 
    @Column(name="offer_industry") private String offerIndustry; 
    @Column(name="offer_pm_name") private String offerPmName; 
    @Column(name=" offer_pm_phone") private String offerPmPhone;
    @Column(name="offer_homepage") private String offerHomepage;  
    @Column(name="offer_address") private String offerAddress;  

    @Override
    public String toString(){

        return "Offer :[offerSeqNo:"+offerSeqNo+",offerId:" +offerId+
        ", offerPassword:"+offerPassword+", offerName:"+offerName+", offerCeoName:"+offerCeoName+
       ", offerIndustry:"+offerIndustry+", offerPmName:"+offerPmName+", offerPmPhone:"+offerPmPhone+
       ", offerHomepage:"+offerHomepage+", offerAddress"+offerAddress + "]";
    }


    //생성자
    @Builder
    private Offer(String offerId,
    String offerPassword, String offerName, String offerCeoName, String offerIndustry, 
    String offerPmName, String offerPmPhone, String offerHomepage, String offerAddress){
        this.offerId =offerId;
        this.offerPassword = offerPassword;
        this.offerName = offerName;
        this.offerCeoName = offerCeoName;
        this.offerIndustry = offerIndustry;
        this.offerPmName = offerPmName;
        this.offerPmPhone = offerPmPhone;
        this.offerHomepage = offerHomepage;
        this.offerAddress = offerAddress;   
    }    
}