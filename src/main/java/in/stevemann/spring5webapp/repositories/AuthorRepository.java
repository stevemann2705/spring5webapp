package in.stevemann.spring5webapp.repositories;

import in.stevemann.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
