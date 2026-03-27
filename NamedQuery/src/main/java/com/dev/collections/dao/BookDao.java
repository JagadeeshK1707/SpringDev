package com.dev.collections.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.collections.model.Book;


@Repository
public interface BookDao extends CrudRepository<Book, Integer> {

}
