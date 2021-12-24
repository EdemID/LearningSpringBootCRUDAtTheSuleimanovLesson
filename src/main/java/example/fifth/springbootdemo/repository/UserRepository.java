package example.fifth.springbootdemo.repository;

import example.fifth.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// с помощью рефлексии генерирует запросы
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLastName(String lastName);
}
