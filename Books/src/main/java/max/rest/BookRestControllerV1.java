package max.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import max.model.Book;
import max.sevice.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookRestControllerV1 {
	
	private final BookService service;
	
	@Autowired
	public BookRestControllerV1(BookService service) {
		this.service = service;	
	}
	
	@GetMapping
	public List<Book> getAll() {
		return service.listAll();
	}
	
	@PostMapping
	public void save(@RequestBody Book book) {
		service.save(book);
	}
	
}
