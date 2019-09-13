package io.ibo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.ibo.model.Book;
import io.ibo.service.BookService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/api/book")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/api/book")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/book/{id}")
	public Book updateBook(@RequestBody Book new_book,@PathVariable long id) {
		return bookService.updateBook(new_book,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/book/{id}")
	public long deleteBook(@PathVariable long id) {
		return bookService.deleteBook(id);
	}
}
