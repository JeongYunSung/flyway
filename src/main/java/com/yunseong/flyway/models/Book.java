package com.yunseong.flyway.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "books")
public class Book {

    @Id
    private Long id;

    private String name;

    private String author;


}
