package com.claim.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Person;
import com.claim.repository.PersonRepository;

@Service
public class PersonService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private PersonRepository personRepository;
	
	//private static final String loginSql ="select P.* from person P where p.email =:email and P.password = :password";

	@Transactional
	public Person login(String email, String password) {
		
		return personRepository.login(email, password);
		
		
	}
	@Transactional
	public Person signUp(Person person) {
		return this.personRepository.save(person);
	}
}
