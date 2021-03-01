package studentvotesystem.demo.repo;

import org.springframework.data.repository.CrudRepository;
import studentvotesystem.demo.models.QuestionEntity;

public interface QuestionRepo extends CrudRepository<QuestionEntity, Integer> {
}
