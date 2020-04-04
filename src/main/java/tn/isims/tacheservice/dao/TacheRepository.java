package tn.isims.tacheservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.isims.tacheservice.entities.Tache;

public interface TacheRepository extends JpaRepository<Tache,Long> {
}
