package com.cvele.maven.proba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvele.maven.proba.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
