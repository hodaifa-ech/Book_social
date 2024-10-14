package com.alibou.book.feedback;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Feedback {


    @Id
    @GeneratedValue
    private Integer id;

    private Double note;

    private String comment;


    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createDate;
    @LastModifiedDate
    @Column(insertable = false )
    private LocalDateTime lastModifiedDate;


    @CreatedBy
    @Column(nullable = false,updatable = false)
    private Integer createdBy;
    @LastModifiedBy
    @Column(insertable = false)
    private Integer lastModifiedBy;
}

