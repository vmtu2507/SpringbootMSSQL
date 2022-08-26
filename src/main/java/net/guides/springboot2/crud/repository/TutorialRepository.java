package net.guides.springboot2.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.crud.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {

	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);
}