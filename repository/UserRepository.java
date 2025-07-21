package com.thoran.springboot.mydiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.thoran.springboot.mydiary.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value= "select * from users where username=:username LIMIT 1",nativeQuery = true)//named parameter=:variable name / parameter name
	
	public User findByUsername(String username);

}
