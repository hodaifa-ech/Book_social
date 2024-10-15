package com.alibou.book.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;
@EnableJpaRepositories(basePackages = "com.alibou.book.user")

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
