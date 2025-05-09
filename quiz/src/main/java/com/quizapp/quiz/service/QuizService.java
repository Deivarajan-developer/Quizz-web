package com.quizapp.quiz.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quizapp.quiz.model.Quiz;
import com.quizapp.quiz.repository.QuizRepository;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}