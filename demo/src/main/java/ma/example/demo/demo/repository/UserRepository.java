package ma.example.demo.demo.repository;

import ma.example.demo.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}