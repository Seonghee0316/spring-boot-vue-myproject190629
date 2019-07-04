package com.amg.web.repositories;
import com.amg.web.entities.Offer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository
 */
@Repository
public interface OfferRepository extends CrudRepository<Offer, Long>{
	public Offer findByOfferIdAndOfferPassword(String offerId, String offerPassword);
	public Offer findByOfferId(String offerId);
}

