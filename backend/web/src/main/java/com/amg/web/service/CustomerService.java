package com.amg.web.service;

// import com.amg.web.common.util.PageProxy;
import com.amg.web.domain.CustomerDTO;
import com.amg.web.entities.Customer;
import com.amg.web.repositories.CustomerRepository;
import com.amg.web.service.CustomerService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    public List<CustomerDTO> findCustomers() {
        customerRepository.findAll();
        return null;
    }

    public List<CustomerDTO> findCustomersByOption(Customer customer) {
        // customerRepository.findOne(customer);
        return null;
    }

    public Optional<CustomerDTO> findCustomerByCustomerId(String customerId) {
        return customerRepository.findByCustomerId(customerId);
    }

    public int updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return 0;
    }

    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    public Long countAll() {
        return customerRepository.count();
    }

    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 ID: " + customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 PASS: " + customer.getPassword());
        return null;
    }

}