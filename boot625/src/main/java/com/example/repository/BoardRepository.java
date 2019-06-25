package com.example.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Board;

public interface BoardRepository extends CrudRepository<Board, Integer>{
	
	Page<Board> findAll(Pageable pageable);

}
