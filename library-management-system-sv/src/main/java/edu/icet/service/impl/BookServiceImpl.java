package edu.icet.service.impl;

import edu.icet.dto.Book;
import edu.icet.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void addBook(Book book) {

    }

    @Override
    public void deleteBook(Long id) {

    }
}
