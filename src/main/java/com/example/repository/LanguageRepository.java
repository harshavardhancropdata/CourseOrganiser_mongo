package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Language;
@Repository
public interface LanguageRepository extends MongoRepository<Language, Integer> {

}
