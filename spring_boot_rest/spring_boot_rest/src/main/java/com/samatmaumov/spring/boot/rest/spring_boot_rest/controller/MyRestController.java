package com.samatmaumov.spring.boot.rest.spring_boot_rest.controller;

import com.samatmaumov.spring.boot.rest.spring_boot_rest.entity.Tutorial;
import com.samatmaumov.spring.boot.rest.spring_boot_rest.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private TutorialService service;

    @GetMapping("/tutorials")
    public List<Tutorial> showAllTutorials() {

        List<Tutorial> tutorialList = service.getAllTutorials();

        return tutorialList;
    }

    @PostMapping("/tutorials")
    public Tutorial addTutorial(@RequestBody Tutorial tutorial) {

        service.saveTutorial(tutorial);

        return tutorial;
    }

    @PutMapping("/tutorials")
    public Tutorial updateTutorial(@RequestBody Tutorial tutorial) {

        service.saveTutorial(tutorial);

        return tutorial;
    }

    @GetMapping("/tutorials/{id}")
    public Tutorial getTutorial(@PathVariable int id) {

        Tutorial tutorial = service.getTutorial(id);

        return tutorial;
    }

    @DeleteMapping("/tutorials/{id}")
    public String deleteTutorial(@PathVariable int id) {

        service.deleteTutorial(id);

        return "Tutorial with ID = " + id + " was deleted";
    }

    @GetMapping("/tutorials/title/{title}")
    public List<Tutorial> showAllTutorialByTitleContaining(@PathVariable String title) {

        List<Tutorial> tutorials = service.findByTitleContaining(title);

        return tutorials;
    }

    @GetMapping("/tutorials/published/{published}")
    public List<Tutorial> showfindByPublished(@PathVariable boolean published) {

        List<Tutorial> tutorials = service.findByPublished(published);

        return tutorials;
    }


}
