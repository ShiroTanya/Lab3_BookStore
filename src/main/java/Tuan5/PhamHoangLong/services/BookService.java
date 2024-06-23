package Tuan5.PhamHoangLong.services;


import Tuan5.PhamHoangLong.entities.Book;
import Tuan5.PhamHoangLong.repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;


    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public Book getBookId(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(long id){
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

}
