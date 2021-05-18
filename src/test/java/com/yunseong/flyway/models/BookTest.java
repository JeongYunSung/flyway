package com.yunseong.flyway.models;

import com.yunseong.flyway.ResetDatabase;
import com.yunseong.flyway.daos.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class BookTest extends ResetDatabase {

    @Autowired
    private BookDao bookDao;

    @Test
    void sut_correctly_create() {
        // Arrange
        Book book = new Book();
        book.setId(1L);
        book.setName("flyway 정복하기");
        book.setAuthor("JYS");
        // Act
        this.bookDao.save(book);
        // Assert
        assertThat(book.getId()).isEqualTo(this.bookDao.findById(book.getId()).get().getId());
    }
}