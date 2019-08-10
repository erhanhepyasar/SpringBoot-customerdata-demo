package com.bharath.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.customer.dal.entities.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {
	
	@Autowired
	private CustomerRepository repo;
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer("Erhan", "erhan.hepyasar@gmail.com");
		repo.save(customer);
		
	}
	
	@Test
	public void testFindCustomerById() {
		Customer customer = repo.findById(2l).get();
		System.out.println(customer);
	}
	
	@Test
	public void testUpdateCustomer() {
		Customer customer = repo.findById(2l).get();
		customer.setName("Yasemin");
		customer.setEmail("yhepyasar@gmail.com");
		repo.save(customer);
	}
	
	@Test
	public void testDeleteCustomer() {
		Customer customer = repo.findById(2l).get();
		repo.delete(customer);
	}
	
}
