package tn.isims.tacheservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.isims.tacheservice.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
