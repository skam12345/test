package main.java.com.test.hosting.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.hosting.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
