package com.comtrade.standalone.services;

import java.util.List;

import com.comtrade.standalone.entity.Language;
import com.comtrade.standalone.repository.LanguageRepository;

public interface LanguageService {
	public Iterable<Language> findAll();
	public Language find (int id);
	public Language save(Language language);
	public Language findByName(String name);
}
