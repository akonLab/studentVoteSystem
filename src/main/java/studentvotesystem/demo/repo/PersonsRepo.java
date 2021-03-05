package studentvotesystem.demo.repo;

import org.springframework.data.repository.CrudRepository;
import studentvotesystem.demo.models.PersonEntity;

public interface PersonsRepo extends CrudRepository<PersonEntity, Integer> {
}
