package com.example.CRUD.controllers;

import com.example.CRUD.services.AnswerService;
import com.example.CRUD.models.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/answers")
public class AnswerController {

//    private final AnswerService answerService;

//    @Autowired
//    public AnswerController(AnswerService answerService) {
//        this.answerService = answerService;
//    }

//    @GetMapping
//    public List<Answer> getAnswers() {
//        return answerService.getAnswers();
//    }
}
