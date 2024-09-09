package com.Universite.MetierImplementation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Universite.Entities.Departement;
import com.Universite.Entities.Salle;
import com.Universite.Metier.SalleMetier;
import com.Universite.Repository.SalleRepository;
import springboot.exeption.ResourceNotFoundExeption;

@Service
@Transactional
public class SalleMetierImplementation implements SalleMetier {
    @Autowired
    SalleRepository salleRepository;

    @Override
    public void saveSalle(Salle sal) {
        salleRepository.save(sal);
    }

    @Override
    public void removeSalle(Long Id) {
        salleRepository.deleteById(Id);
    }

    @Override
    public void updateSalle(Salle sal) {
        salleRepository.save(sal);
    }

    @Override
    public List<Salle> ListSalle() {
        return salleRepository.findAll();
    }

    @Override
    public Optional<Salle> findSalle(Long Id) {
       return salleRepository.findById(Id)
        		;
    }

}
