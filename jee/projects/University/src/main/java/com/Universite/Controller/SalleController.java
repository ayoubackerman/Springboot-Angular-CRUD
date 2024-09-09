package com.Universite.Controller;

import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Universite.Entities.Salle;
import com.Universite.Metier.SalleMetier;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/Salle")
public class SalleController {
    @Autowired
    private SalleMetier salleMetier;
    
    @Autowired
    private SalleMetier SalleRepository;

    @GetMapping(value = "/getAllSalle/{id}")
    public Optional<Salle> findSalle(@PathVariable(value = "id") String id) {
        return salleMetier.findSalle(Long.parseLong(id));
    }
    /*@GetMapping(value = "/sallee")
    public List<Salle> ListSalle() {
        return salleMetier.ListSalle();
    }*/
        
    
    @PostMapping("/getAllSalle")
    public Salle creeSalle(@Valid @RequestBody Salle sal) {
        salleMetier.saveSalle(sal);
        return sal;
    }

   /* @PutMapping("/getAllSalle/{id}")
    public String UpdateSalle(@PathVariable Long numS, @RequestBody Salle sal) {
        salleMetier.saveSalle(sal);
		/*
		 if(sal==null) {return "impossible de faire l update";}
		sal.setnumS(salDetails.getnumS());
		salsetNomDEP(salDetails.getNomDEP());
		salleRepository.save(sal);
		
        return "success:Update a ete bien faite";
    }*/
    @PutMapping("/getAllSalle")
    public String UpdateSalle(@PathVariable Long id , @RequestBody Salle sal) {
        sal.setnumS(id);
        salleMetier.saveSalle(sal);
        return "Salle Updated!";
    }
    @GetMapping("/getAllSalle")
    public List<Salle> getAllSalle() {
        return salleMetier.ListSalle();
    }

    @DeleteMapping(value = "/getAllSalle/{id}")
    public String deleteSalle(@PathVariable String id) {
        salleMetier.removeSalle(Long.parseLong(id));
        return "ok!";
    }

}
