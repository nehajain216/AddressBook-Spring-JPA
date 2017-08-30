package com.nj.addressbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact 
{
	@Id 
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="contact_id_seq_gen", sequenceName="contact_id_seq", initialValue=100)
	@GeneratedValue(generator="contact_id_seq_gen")
	private int id;
	
	@Column(nullable=false)
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contacts [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + "]";
	}
	
}
