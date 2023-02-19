package com.samatmaumov.spring.boot.rest.spring_boot_rest.repository;

import com.samatmaumov.spring.boot.rest.spring_boot_rest.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {

    public List<Tutorial> findByTitleContaining(String title);

    public List<Tutorial> findByPublished(boolean published);


}
