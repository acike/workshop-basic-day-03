package com.exam.book;

import com.exam.book.harry.Book;
import com.exam.book.harry.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;
@SpringBootApplication
public class RunApplication {


    @Autowired
    BookRepository repository;
    //private Object Book;

    @PostConstruct
    public void initialDataForTestingBook() {
        Book book2 = new Book();
        book2.setBookId(1);
        book2.setSeriesName("Series I");
        book2.setPrice(100);
        book2.setAmount(100);
        repository.save(book2);
    }
    @PostConstruct
    public void initialDataForTestingBook2() {
        Book book3 = new Book();
        book3.setBookId(2);
        book3.setSeriesName("Series II");
        book3.setPrice(100);
        book3.setAmount(100);
        repository.save(book3);
    }

    @PostConstruct
    public void initialDataForTestingBook3() {
        Book book3 = new Book();
        book3.setBookId(3);
        book3.setSeriesName("Series II");
        book3.setPrice(100);
        book3.setAmount(100);
        repository.save(book3);
    }

    @PostConstruct
    public void initialDataForTestingBook4() {
        Book book3 = new Book();
        book3.setBookId(4);
        book3.setSeriesName("Series II");
        book3.setPrice(100);
        book3.setAmount(100);
        repository.save(book3);
    }

    @PostConstruct
    public void initialDataForTestingBook5() {

        Book book3 = new Book();
        book3.setBookId(5);
        book3.setSeriesName("Series II");
        book3.setPrice(100);
        book3.setAmount(100);
        repository.save(book3);
    }

    public static void main(String[] args) {
        //gradlew bootRun
        ConfigurableApplicationContext ctx
                = SpringApplication.run(RunApplication.class, args);

        System.out.println(ctx.getBeanDefinitionCount());
    }
}
