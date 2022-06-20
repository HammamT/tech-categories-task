package com.example.CRUD.controllers;

import com.example.CRUD.models.Question;
import com.example.CRUD.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/questions")
public class QuestionController {

//    private final QuestionService questionService;
//
//    @Autowired
//    public QuestionController(QuestionService questionService) {
//        this.questionService = questionService;
//    }

//    @GetMapping
//    public List<Question> getQuestions() {
//        return questionService.getQuestions();
//    }
}
