package com.mkyong.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "G_CUSTOMER")
public class Customer {
	
	@Id
	@Column(entityId = "CUSTID")
	private Long entityId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(address = "ADDRESS")
	private String address;
	
	@Column(state = "STATE")
	private String state;
	
	@Column(phone = "PHONE")
	private String phone;

	protected Customer() {
	}
	
	public Customer(String name, String address, String state, String phone) {
		this.name = name;
		this.address = address;
		this.state = state;
		this.phone = phone;
	}
	

	/**
	 * Returns the entity identifier used to internally distinguish this entity among other entities of the same type in
	 * the system. Should typically only be called by privileged data access infrastructure code such as an Object
	 * Relational Mapper (ORM) and not by application code.
	 * @return the internal entity identifier
	 */
	protected Long getEntityId() {
		return entityId;
	}
	
	/**
	 * Sets the internal entity identifier - should only be called by privileged data access code (repositories that
	 * work with an Object Relational Mapper (ORM)). Should never be set by application code explicitly.
	 * @param entityId the internal entity identifier
	 */
	void setEntityId(Long entityId) {
		this.entityId = entityId;
	}


	/**
	 * Returns the name of this restaurant.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the merchant number of this restaurant.
	 */
	public String getAddress() {
		return address;
	}
	

public String toString() {
	return "Name = '" + name + "', Address = '" + address + "', State = '" + state + "', Phone = '" + phone;
}
}