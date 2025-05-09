package com.quizapp.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quizapp.quiz.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {}
