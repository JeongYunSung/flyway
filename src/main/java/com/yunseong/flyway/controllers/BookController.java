package com.yunseong.flyway.controllers;

import com.yunseong.flyway.daos.BookDao;
import com.yunseong.flyway.models.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
@RequiredArgsConstructor
public class BookController {

    private final BookDao bookDao;

    @GetMapping(value = "/create")
    public Book create() {
        Book book = new Book();
        book.setId(1L);
        book.setName("Flyway 정복하기");
        book.setAuthor("JYS");
        this.bookDao.save(book);
        return book;
    }
}
