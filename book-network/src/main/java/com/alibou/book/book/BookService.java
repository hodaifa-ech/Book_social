package com.alibou.book.book;


import com.alibou.book.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;
@Service
@RequiredArgsConstructor

public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;



    public Integer save(BookRequest request, Authentication connectedUser) {
        User user = ((User) connectedUser.getPrincipal());
        Book book = bookMapper.toBook(request);
         book.setOwner(user);
        return bookRepository.save(book).getId();
    }
}
