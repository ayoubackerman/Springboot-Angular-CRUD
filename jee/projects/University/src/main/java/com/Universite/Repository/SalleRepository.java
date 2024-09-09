package com.Universite.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Universite.Entities.Salle;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {

}
