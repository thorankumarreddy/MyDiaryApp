package com.thoran.springboot.mydiary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoran.springboot.mydiary.entity.Entry;
import com.thoran.springboot.mydiary.repository.EntryRepository;


@Service
public class EntryServiceImpl implements EntryService {
	
	@Autowired
	private EntryRepository entryReposiotry;

	@Override
	public Entry saveEntry(Entry entry) {
		return entryReposiotry.save(entry);
	}

	@Override
	public Entry updateEntry(Entry entry) {
		return entryReposiotry.save(entry);
	}

	@Override
	public void deleteEntry(Entry entry) {
		
		entryReposiotry.delete(entry);

	}

	@Override
	public Entry findById(long id) {
		return entryReposiotry.findById(id).get();
	}

	@Override
	public List<Entry> findAll() {
		return entryReposiotry.findAll();
	}

	@Override
	public List<Entry> findByUserid(long id) {
		return entryReposiotry.findByUserid(id);
	}

}
