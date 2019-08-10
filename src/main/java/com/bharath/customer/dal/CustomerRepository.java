package com.bharath.customer.dal;

import org.springframework.data.repository.CrudRepository;

import com.bharath.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
