package com.claim.repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Etcetera;



@Repository
public interface EtceteraRepository extends JpaRepository<Etcetera, Integer>{
			@Query("Select E from Etcetera E where E.recipeName IN (:etceteralist)") //IN (:etceteralist)
			public ArrayList<Etcetera> findAllEcetera(@Param("etceteralist") ArrayList<String> etceteraList);
}
