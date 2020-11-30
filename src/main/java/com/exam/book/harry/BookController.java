package com.exam.book.harry;

import com.exam.book.Post.PostGateway;
import com.exam.book.Post.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {


    @Autowired
    private BookRepository bookRepository;

/*    @GetMapping("/v1/book/{id}")
    public BookResponse getById2(@PathVariable int id) {
        BookResponse bookResponse = new BookResponse();
        bookResponse.setBookId(id);
        bookResponse.setSeriesName("series 1");
        bookResponse.setPrice(100);
        bookResponse.setAmount(100);
        return bookResponse;
    }*/

    @GetMapping("/v2/book/{id}")
    public BookResponse getById(@PathVariable int id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            BookResponse bookResponse = new BookResponse();
            bookResponse.setBookId(id);
            bookResponse.setSeriesName("series "+ id);
            bookResponse.setPrice(100);
            bookResponse.setAmount(100);
            return bookResponse;
        }
        throw new RuntimeException("Account not found with id=" + id);
    }

 @Autowired
    private PostGateway postGateway;

    @GetMapping("/v1/post/{id}")
    public PostResponse getPostById(@PathVariable int id) {
        Optional<PostResponse> result = postGateway.getPostById(id);
        return result.get();
    }

}





