package com.nj.addressbook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nj.addressbook.entities.Contact;


@Repository
public class AddressBookDAO 
{
	@PersistenceContext
	private EntityManager em;
	

	public List<Contact> getAllContacts()
	{
		return em.createQuery("select c from Contact c",Contact.class).getResultList();
	}
	
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	public Contact getContactById(int id)
	{
		return em.find(Contact.class, id);
	}
	
	
	@Transactional
	public Contact createContact(Contact contact)
	{
		 em.persist(contact);
		 return contact;
	}

}

