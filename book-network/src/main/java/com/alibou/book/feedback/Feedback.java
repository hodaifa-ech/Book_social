package com.alibou.book.feedback;


import com.alibou.book.common.BaseEntity;
import jakarta.persistence.*;


@Entity

public class Feedback extends BaseEntity {




    private Double note;

    private String comment;



}

