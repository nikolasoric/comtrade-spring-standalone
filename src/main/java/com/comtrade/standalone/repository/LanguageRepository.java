package com.comtrade.standalone.repository;


//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comtrade.standalone.entity.Language;

@Repository("languageRepository")
public interface LanguageRepository extends CrudRepository<Language, Integer>{
	Language findByName(String name);  //CUSTOM DEFINED
}