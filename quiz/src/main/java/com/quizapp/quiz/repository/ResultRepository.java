package com.quizapp.quiz.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.quizapp.quiz.model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

	javax.naming.spi.DirStateFactory.Result save(javax.naming.spi.DirStateFactory.Result result);
    // No need to write any method — basic CRUD comes from JpaRepository
}