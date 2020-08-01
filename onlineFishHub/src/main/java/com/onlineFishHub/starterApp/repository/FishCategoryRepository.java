package com.onlineFishHub.starterApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.onlineFishHub.starterApp.entity.FishCategory;



@RepositoryRestResource(collectionResourceRel="fishCateogry", path="fish-category")
public interface FishCategoryRepository extends JpaRepository<FishCategory, Long>{

}
