package studentvotesystem.demo.repo;

import org.springframework.data.repository.CrudRepository;
import studentvotesystem.demo.models.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Integer> {
}
