package com.alibou.book.user;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Token {
    @Id
    @GeneratedValue
    private Integer id;
    private String token;
    private LocalDateTime expiresAt;
    private LocalDateTime ValidatedAt;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;
}
