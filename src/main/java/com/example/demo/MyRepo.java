package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "student",path = "student")
public interface MyRepo extends JpaRepository<Student, Integer> {

}
