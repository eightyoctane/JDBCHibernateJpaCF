package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.management.CustomerRepository;
import com.mkyong.customer.model.Customer;

import org.cloudfoundry.runtime.env.CloudEnvironment;

public interface CustomerManagement {
    public void printCustomerList(CustomerRepository customerrepository);

}
