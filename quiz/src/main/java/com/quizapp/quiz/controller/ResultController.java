package com.quizapp.quiz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.quizapp.quiz.model.Result;
import com.quizapp.quiz.repository.ResultRepository;

import java.util.List;

@RestController
@RequestMapping("/api/results")
@CrossOrigin(origins = "*")
public class ResultController {

    @Autowired
    private ResultRepository ResultRepository;

    // Save username and score
    @PostMapping
    public ResponseEntity<Result> saveResult(@RequestBody Result result) {
    	// Check the received data
    	System.out.println("Received username: " + result.getUsername());
        System.out.println("Received score: " + result.getScore());
        return ResponseEntity.ok(ResultRepository.save(result));
    }

    // Return all saved results
    @GetMapping("/api/results")
    public List<Result> getAllResults() {
        return ResultRepository.findAll();
    }
}