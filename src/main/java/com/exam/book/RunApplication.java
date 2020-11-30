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

    public static void main(String[] args) {
        //gradlew bootRun
        ConfigurableApplicationContext ctx
                = SpringApplication.run(RunApplication.class, args);

        for (String bean : ctx.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
        System.out.println(ctx.getBeanDefinitionCount());
    }
}
