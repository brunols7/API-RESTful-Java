package me.brunols.api_restful_java.repository;

import me.brunols.api_restful_java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
