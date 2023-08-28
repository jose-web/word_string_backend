package com.game.repository;

import org.springframework.data.repository.CrudRepository;

import com.game.entity.Word;

public interface WordStringRepository extends CrudRepository<Word, Long>{

}
