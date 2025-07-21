package com.thoran.springboot.mydiary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thoran.springboot.mydiary.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {
	 
	@Query(value="select *from entries where userid=:id",nativeQuery = true) //: ante named parameter
	public  List<Entry> findByUserid(long id);

}
