package com.exam.book.harry;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository
        extends CrudRepository<Book,Integer> {

}

