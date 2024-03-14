package com.example.Kursovaya2;

import java.util.Collection;
import java.util.Random;

public class ExaminerServiceImpl implements ExaminerService{
    Random random;

    QuestionService questionService;

    ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }
    @Override
    public Collection<Question> getQuestions(int amount) {
        return null;
    }
}
