package com.mkyong.common;

import org.cloudfoundry.runtime.env.CloudEnvironment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.mkyong.customer.management.CustomerRepository;

public class CustomerManagementTest {

	private CustomerManagement customerManagement;
	
	@Before
	public void setUp() {
		if(new CloudEnvironment().isCloudFoundry()) {
			  //activate cloud profile
			  System.setProperty("spring.profiles.active","cloud");
		}
		// Note: App.class defines the base path which is used to locate Spring-Module.xml
		// Note also: if building in STS configure the build config output path to send Spring-Module.xml to that location!
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml", CustomerManagement.class);    	

		// Get the bean to use to invoke the application
		customerManagement = context.getBean(CustomerManagement.class);
		
	}
	
	@Test
    public void testPrintCustomerList(CustomerRepository customerrepository)
    {
		System.out.println("testPrintcustomerList not written yet");
		assertTrue( true );
    }



    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        
    }
}
