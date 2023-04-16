package de.die.bookbackend.Repository;

import de.die.bookbackend.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

    void save(Author author);
}
