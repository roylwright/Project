package com.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.claim.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	@Query("Select P from Post P where P.email IN :postlist order by createdDate DESC")
	public List<Post> findPost(@Param("postlist") String[] postList);
}
