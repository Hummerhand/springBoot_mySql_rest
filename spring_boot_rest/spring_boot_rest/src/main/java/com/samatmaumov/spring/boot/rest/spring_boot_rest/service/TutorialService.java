package com.samatmaumov.spring.boot.rest.spring_boot_rest.service;

import com.samatmaumov.spring.boot.rest.spring_boot_rest.entity.Tutorial;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TutorialService {

   public List<Tutorial> getAllTutorials();

   public void saveTutorial(Tutorial tutorial);

   public Tutorial getTutorial(int id);

   public void deleteTutorial(int id);

   public List<Tutorial> findByTitleContaining(String title);

   public List<Tutorial> findByPublished(boolean published);

}
