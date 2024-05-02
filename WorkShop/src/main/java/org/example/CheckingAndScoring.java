package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CheckingAndScoring implements CheckingAnswer{
    AnswerMemory answerMemory = new AnswerMemory();

    @Value("${scores.point1}")
    public String scors1;

    @Value("${scores.point2}")
    public String scors2;

    @Value("${scores.point3}")
    public String scors3;

    public int score = 0;


    //0 1 2 3
    //4 5 6 7
    //8 9

    @Override
    @Bean
    public Integer sumScore() {
        HashMap<String,String> answerGut = answerMemory.csvToStringGut();
        HashMap<String,String> answerStudent = answerMemory.csvToStringStudent();
        for (int i = 0; i < 10; i++) {
            String key = Integer.toString(i);
            if (answerGut.containsKey(key) && answerStudent.containsKey(key)) {
                String valueGut = answerGut.get(key);
                String valueStudent = answerStudent.get(key);
                if (valueGut.equals(valueStudent)) {
                    if (i < 4) {
                        score = score + Integer.parseInt(scors1);
                    } else if (i >= 4 && i <= 7) {
                        score = score + Integer.parseInt(scors2);
                    } else {
                        score = score +  Integer.parseInt(scors3);
                    }
                }
            }
        }
        return score;
    }

}
