package com.miage.td.ams.app.rest;

import com.miage.td.ams.app.entities.Cours;
import com.miage.td.ams.app.repository.CoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class CoursControl {
    //Logger logger = LoggerFactory.getLogger(CoursControl.class);


    private CoursRepo coursRepo;


    @GetMapping("{id}")
    public Cours getCours(@PathVariable("id") Cours c){
        return c;
    }

    @GetMapping("")
    public Iterable<Cours> getCours(@RequestParam("cours") String id){
        long idl = Long.parseLong(id);
        return coursRepo.findAllByIdCours(idl);
    }

    @PostMapping("")
    public Cours postCours(@RequestBody Cours cours){
        return this.coursRepo.save(cours);
    }
}
