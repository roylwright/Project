package com.claim.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.claim.entity.Etcetera;
import com.claim.entity.Post;
import com.claim.repository.EtceteraRepository;
import com.claim.repository.PostRepository;

@Service
public class EtceteraService {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private EtceteraRepository ecteteraRepository;

	@Transactional
	public List<Etcetera> findAllEtcetera(ArrayList<String> etceteraList) {
		return ecteteraRepository.findAllEcetera(etceteraList);
	}

	@Transactional
	public void saveEtcetera(Etcetera etcetera) {
		ecteteraRepository.save(etcetera);
	}
	
}
