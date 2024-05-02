package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TestJUnit {

    @org.junit.jupiter.api.Test
    void csvToStringGut() {
        AnswerMemory answerMemory = new AnswerMemory();
        HashMap<String, String> result = answerMemory.csvToStringGut();
        assertNotNull(result);
        assertFalse(result.isEmpty());

    }

    @org.junit.jupiter.api.Test
    void csvToStringStudent() {
        AnswerMemory answerMemory = new AnswerMemory();
        HashMap<String, String> result = answerMemory.csvToStringStudent();
        assertNotNull(result);
        assertFalse(result.isEmpty());

    }

    private CheckingAndScoring checkingAndScoring;

    @BeforeEach
    void setUp() {
        checkingAndScoring = new CheckingAndScoring();
    }

    @Test
    void testSumScore() {
        checkingAndScoring.scors1 = String.valueOf(1);
        checkingAndScoring.scors2 = String.valueOf(2);
        checkingAndScoring.scors3 = String.valueOf(3);


        int score = checkingAndScoring.sumScore();


        assertEquals(10, score);
    }
}
