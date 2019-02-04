package in.stevemann.spring5webapp.repositories;

import in.stevemann.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
