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

    @PostMapping("")
    public HashMap<String, String> save(@RequestBody OfferDTO offer) {

        System.out.println("회원가입 " + offer.toString());
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

        System.out.println("엔티티로 바뀐 정보:" + entity.toString());
        // Customer entity =
        // // Customer entity = modelMapper.map(dto, Customer.class);
        // System.out.println("엔ㅌ티로 바뀐 정보: " + entity.toString());
        repo.save(entity);
        map.put("result", "SUCCESS");
        return map;
    }

    @PostMapping("/login")
    public HashMap<String, String> login (@RequestBody OfferDTO dto){
        System.out.println("로그인 컨트롤러");
        System.out.println("아이디"+dto.getOfferId());
        System.out.println("비밀번호" + dto.getOfferPassword());
        
        // ISupplier fx = (()-> {
        //     // Customer c = modelMapper.map(dto, Customer.class);
        //          return repo.findByOfferIdAndOfferPassword(dto.getOfferId(), 
        //          dto.getOfferPassword());

        //  });
        Offer o = repo.findByOfferIdAndOfferPassword(dto.getOfferId(), dto.getOfferPassword());
            HashMap<String, String> map = new HashMap<>();
  
            try {
                if(o.getOfferId() != null){
                    System.out.println("로그인 가능");
                    map.put("result", "Success");
                }

            } catch (NullPointerException e) {
                //TODO: handle exception
                map.put("result", "Fail");
                System.out.println("로그인 실패");
            }
           
         return map;
    }

    @GetMapping("/getOfferInfo/{offerId}")
    public OfferDTO getMyInfo(@PathVariable String offerId) {
        System.out.println("마이페이지" + offerId);
        OfferDTO o = modelMapper.map(repo.findByOfferId(offerId), OfferDTO.class);
        // System.out.println("id"+o.getOfferId());
        return o;
    }

    @DeleteMapping("/leave_acount/{offerId}")
    public void leave_acount(@PathVariable String offerId) {
        System.out.println("leave_acount 들어옴");
        System.out.println(offerId);
        Long id = repo.findByOfferId(offerId).getId();
        repo.deleteById(id);
    }

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