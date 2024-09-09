package com.Universite.Repository;

import com.Universite.Entities.Departement;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartementRepository extends JpaRepository<Departement, Long> {

    /*Optional<Departement> findDepartement(Long Id);*/

}
