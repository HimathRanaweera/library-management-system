package edu.icet.controller;

import edu.icet.dto.Book;
import edu.icet.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@CrossOrigin

public class BookController {
    @Autowired
    BookService bookService;

@PostMapping("/add")
    public void addBook(@RequestBody Book book) {
    bookService.addBook(book);


}
}
