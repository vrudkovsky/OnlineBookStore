package com.vpcomtek.onlinebookstore;

import com.vpcomtek.onlinebookstore.model.Book;
import com.vpcomtek.onlinebookstore.service.BookService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineBookStoreApplication {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book book = new Book();
                book.setAuthor("Rudkovsky");
                book.setIsbn("1234-5678-9012");
                book.setPrice(BigDecimal.valueOf(123));

                bookService.save(book);
                System.out.println(bookService.findAll());

            }
        };
    }

}
