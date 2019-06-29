package com.amg.web.controller;

import java.util.HashMap;
import java.util.Optional;

import com.amg.web.common.util.Printer;
import com.amg.web.domain.CustomerDTO;
import com.amg.web.entities.Customer;
import com.amg.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerDTO customer;
    @Autowired
    Printer p;

    // @PostMapping("")
    // public HashMap<String, Object> join(@RequestBody CustomerDTO param) {
    //     p.accept("POST 진입");
    //     HashMap<String, Object> map = new HashMap<>();
    //     map.put("result", "SUCCESS");
    //     return map;
    // }

    @PostMapping(value="/join")
    public void join(@RequestBody HashMap<String, Object> param) {
    System.out.println(param);
    System.out.println(param.get("id"));
    System.out.println(param.get("pass"));
}

    @GetMapping("/{customerId}")
    public Optional<CustomerDTO> getCustomer(@PathVariable String customerId) {
        // HashMap<String, Object> map = new HashMap<>();
        p.accept("GET 진입" + customerId);
        // customer.setCustomerId("hong");
        // customer.setPassword("hong");
        customer.setCustomerId(customerId);
        System.out.println("customerId==="+customerId);
        return  customerService.findCustomerByCustomerId(customerId);
    }

    @PutMapping("/{customerId}")
    public HashMap<String, Object> updateCustomer(@PathVariable String customerId) {
        HashMap<String, Object> map = new HashMap<>();
        p.accept("PUT진입" + customerId);
        customer.setCustomerId("kim");
        map.put("result",  "SUCCESS");
        return map;
    }

    @DeleteMapping("/{customerId}")
    public HashMap<String, Object> deleteCustomer(@PathVariable String customerId) {
        HashMap<String, Object> map = new HashMap<>();
        p.accept("DELETE진입: "+customerId);
        customer.setCustomerId(customerId);
        map.put("result", "탈퇴성공");
        return map;
    }

    // 페이지 처리 후 리퀘스트 바디 써야함.
    @GetMapping("/page/{pageNum}")
    public HashMap<String, Object> list(@PathVariable String pageNum) {
        HashMap<String, Object> map = new HashMap<>();
        
        // map.put("totalCount", customerService.countAll());
        // map.put("page_num", pageNum);
        // map.put("page_size", "5");
        // map.put("block_size", "5");
        return map;
    }

    
    @GetMapping("/count")
    public String count() {
        System.out.println("CustomerController count() 경로로 들어옴");
        Long count = customerService.countAll();
        return String.valueOf(count);
    }

    @GetMapping("/{customerId}/{password}")
    public CustomerDTO login(@PathVariable("customerId") String id, @PathVariable("password") String pass) {
        customer.setCustomerId(id);
        customer.setPassword(pass);
        return customerService.login(customer);
    }
}