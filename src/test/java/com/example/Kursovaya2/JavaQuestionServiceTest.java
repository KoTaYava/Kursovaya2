package com.example.Kursovaya2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class JavaQuestionServiceTest {
    private JavaQuestionService questionService;

    @BeforeEach
    void setUp() {
        questionService = new JavaQuestionService();
    }

    @Test
    void testAddAndGetAll() {
        Question question = new Question("What is 1+1?", "2");
        questionService.add(question);
        Collection<Question> allQuestions = questionService.getAll();
        assertTrue(allQuestions.contains(question));
    }

    @Test
    void testRemove() {
        Question question = new Question("What is the capital of France?", "Paris");
        questionService.add(question);
        questionService.remove(question);
        Collection<Question> allQuestions = questionService.getAll();
        assertFalse(allQuestions.contains(question));
    }

    @Test
    void testGetRandomQuestion() {
        // Create a mock Set of Questions
        Set<Question> mockQuestions = new HashSet<>();
        mockQuestions.add(new Question("Q1", "A1"));
        mockQuestions.add(new Question("Q2", "A2"));



        JavaQuestionService questionServiceMock = spy(questionService);
        doReturn(mockQuestions).when(questionServiceMock).getAll();


        Question randomQuestion = questionServiceMock.getRandomQuestion();
        assertTrue(mockQuestions.contains(randomQuestion));
    }
}