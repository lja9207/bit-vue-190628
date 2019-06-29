package com.project.web.repositories;

import com.project.web.domain.CustomerDTO;
import com.project.web.entities.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    //1. public Customer findOne1(CustomerDTO a);
    //2. public Customer findOne2(Customer a);
    //3. public CustomerDTO findOne3(CustomerDTO a);
    //4. public CustomerDTO findOne4(Customer a);
    //이중에 맞는게 1개 but 에러는 안나고 service에서 죽음
    
    public CustomerDTO findOne(Customer customer);
    
}