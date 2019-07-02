// package com.amg.web.service;

// // import com.amg.web.common.util.PageProxy;
// import com.amg.web.domain.CustomerDTO;
// import com.amg.web.entities.Customer;
// import com.amg.web.repositories.CustomerRepository;
// import com.amg.web.service.CustomerService;
// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// /**
//  * CustomerServiceImpl
//  */
// @Service
// public class CustomerService {
//     @Autowired
//     CustomerRepository customerRepository;

//     public Long count() {
//         return customerRepository.count();
//     };

//     public void delete(Customer entity) {
//         customerRepository.delete(entity);
//     }

//     public void deleteAll() {
//         customerRepository.deleteAll();
//     }

//     public void deleteAll(Iterable<Customer> entities) {
//         customerRepository.deleteAll(entities);
//     }

//     public void deleteById(Long id) {
//         customerRepository.deleteById(id);
//     }

//     public boolean existsById(Long id) {
//         return customerRepository.existsById(id);
//     }

//     public Iterable<Customer> findAll() {
//         return customerRepository.findAll();
//     }

//     public Iterable<Customer> findAllById(Iterable<Long> ids) {
//         return customerRepository.findAllById(ids);
//     }

//     public Optional<Customer> findById(Long id) {
//         return customerRepository.findById(id);
//     }

//     public Customer save(Customer entity) {
//         return customerRepository.save(entity);
//     }

//     public Iterable<Customer> saveAll(Iterable<Customer> entities) {
//         return customerRepository.saveAll(entities);
//     }

// }