package com.comtrade.standalone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comtrade.standalone.entity.Language;
import com.comtrade.standalone.repository.LanguageRepository;

@Service("languageService")
public class LanguageServiceImpl implements LanguageService{

	@Autowired
	private LanguageRepository languageRepository;
	
	@Override
	public Iterable<Language> findAll() {
		// TODO Auto-generated method stub
		return languageRepository.findAll();
	}

	@Override
	public Language find(int id) {
		// TODO Auto-generated method stub
		return languageRepository.findById(id).get();
	}

	@Override
	public Language save(Language language) {
		// TODO Auto-generated method stub
		return languageRepository.save(language);
	}

	@Override
	public Language findByName(String name) {
		// TODO Auto-generated method stub
		return languageRepository.findByName(name);
	}

}
