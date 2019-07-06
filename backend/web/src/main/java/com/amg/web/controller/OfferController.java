package com.amg.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import com.amg.web.common.lambda.IFunction;
import com.amg.web.common.lambda.ISupplier;
import com.amg.web.common.util.Printer;
import com.amg.web.domain.OfferDTO;
import com.amg.web.entities.Offer;
import com.amg.web.repositories.OfferRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.modelmapper.ModelMapper;

/**
 * CustomerController
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/offers")
public class OfferController {
    @Autowired
    OfferDTO offer;
    @Autowired
    Printer p;
    @Autowired
    OfferRepository repo;
    @Autowired
    ModelMapper modelMapper;

    @Bean
    public ModelMapper modelmapper() {
        return new ModelMapper();
    }

    //회원가입
    @PostMapping("")
    public HashMap<String, String> save(@RequestBody OfferDTO offer) {
        HashMap<String, String> map = new HashMap<>();
        Offer entity = new Offer();
        entity.setOfferId(offer.getOfferId());
        entity.setOfferPassword(offer.getOfferPassword());
        entity.setOfferName(offer.getOfferName());
        entity.setOfferCeoName(offer.getOfferCeoName());
        entity.setOfferIndustry(offer.getOfferIndustry());
        entity.setOfferPmName(offer.getOfferPmName());
        entity.setOfferPmPhone(offer.getOfferPmPhone());
        entity.setOfferHomepage(offer.getOfferHomepage());
        entity.setOfferAddress(offer.getOfferAddress());
        repo.save(entity);
        map.put("result", "SUCCESS");
        return map;
    }

    //로그인
    @PostMapping("/login")
    public HashMap<String, String> login (@RequestBody OfferDTO dto){

        Offer o = repo.findByOfferIdAndOfferPassword(dto.getOfferId(), dto.getOfferPassword());
            HashMap<String, String> map = new HashMap<>();
  
            try {
                if(o.getOfferId() != null){
                    System.out.println("로그인 가능");
                    map.put("result", "Success");
                }

            } catch (NullPointerException e) {
                map.put("result", "Fail");
                System.out.println("로그인 실패");
            }
           
         return map;
    }

    // 마이페이지
    @GetMapping("/getOfferInfo/{offerId}")
    public OfferDTO getMyInfo(@PathVariable String offerId) {
        OfferDTO o = modelMapper.map(repo.findByOfferId(offerId), OfferDTO.class);
        return o;
    }

    // 회원 탈퇴
    @DeleteMapping("/leave_acount/{offerId}")
    public void leave_acount(@PathVariable String offerId) {
        Long id = repo.findByOfferId(offerId).getId();
        repo.deleteById(id);
    }

    // 관리자 페이지
    @GetMapping("/getOfferList")
    public Iterable<OfferDTO> getOfferList(){
        Iterable<Offer> entities = repo.findAll();
        List<OfferDTO> list = new ArrayList<>();
        for(Offer o: entities){
            OfferDTO off = modelMapper.map(o, OfferDTO.class);
            list.add(off);
        }
        return list;
    }
    
    //마이페이지 수정
    @PutMapping("/{offerId}")
    public HashMap<String,String> update(@PathVariable String offerId, @RequestBody OfferDTO offer) {

        HashMap<String, String> map = new HashMap<>();
        Long id = repo.findByOfferId(offerId).getId();
        Offer entity = repo.findById(id).get();
        entity.setOfferId(offer.getOfferId());
        entity.setOfferPassword(offer.getOfferPassword());
        entity.setOfferName(offer.getOfferName());
        entity.setOfferCeoName(offer.getOfferCeoName());
        entity.setOfferIndustry(offer.getOfferIndustry());
        entity.setOfferPmName(offer.getOfferPmName());
        entity.setOfferPmPhone(offer.getOfferPmPhone());
        entity.setOfferHomepage(offer.getOfferHomepage());
        entity.setOfferAddress(offer.getOfferAddress());
        repo.save(entity);
        map.put("result", "success");
        return map;
    }
    
}