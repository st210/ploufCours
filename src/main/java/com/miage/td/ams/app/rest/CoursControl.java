package com.miage.td.ams.app.rest;

import com.miage.td.ams.app.entities.Cours;
import com.miage.td.ams.app.repository.CoursRepo;
import com.miage.td.ams.app.service.MetierCours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursControl {
    //Logger logger = LoggerFactory.getLogger(CoursControl.class);

    @Autowired
    private CoursRepo coursRepo;

    @Autowired
    private MetierCours metierCours;

    @GetMapping("")
    public List<Cours> getAllCours(){
        return  this.coursRepo.findAll();
    }

    @GetMapping("{id}")
    public Cours getCours(@PathVariable("id") Cours c){
        return c;
    }

    @PostMapping("")
    public Cours postCours(@RequestBody Cours cours){
        return this.coursRepo.save(cours);
    }

    @PutMapping("/{id}/inscription")
    public Cours ajoutInscription(@PathVariable("id") String c, @RequestParam String idMembre){
        return this.metierCours.ajouterCours(c,idMembre);
    }
}
