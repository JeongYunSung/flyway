package com.yunseong.flyway.daos;

import com.yunseong.flyway.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends CrudRepository<Book, Long> {
}
