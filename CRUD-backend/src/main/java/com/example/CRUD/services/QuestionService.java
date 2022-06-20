package com.example.CRUD.services;

import com.example.CRUD.models.Question;
import org.springframework.stereotype.Component;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions(Long category_id);

    Question getEquipment(Long id, Long category_id);

    void addEquipment(Question question);

    void updateEquipment(Long id, Question question);

    void deleteEquipment(Long id);

}
