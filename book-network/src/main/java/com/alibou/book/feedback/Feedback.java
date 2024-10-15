package com.alibou.book.feedback;


import com.alibou.book.book.Book;
import com.alibou.book.common.BaseEntity;
import jakarta.persistence.*;


@Entity

public class Feedback extends BaseEntity {




    private Double note;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}

