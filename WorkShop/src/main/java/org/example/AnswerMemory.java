package org.example;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
@Service
public class AnswerMemory implements ExtractFromCSV{
    @Override
    public HashMap<String,String> csvToStringGut() {
        String filePath = "D:\\course\\25\\Answer.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            HashMap<String,String> answer = new HashMap();
            while ((line = br.readLine()) != null) {
                answer.put(convertCsvToAnswerGut(line).getExercise(),convertCsvToAnswerGut(line).getAnswers());
            }
            return answer;
        } catch (Exception e) {
            System.out.println("Unable to read data from the file: " + filePath);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Answers convertCsvToAnswerGut(String line) {
        String[] tokens = line.split(" - ");
        return new Answers(tokens[0], tokens[1]);
    }

    @Override
    public HashMap<String, String> csvToStringStudent() {
        String filePath = "D:\\course\\25\\Student.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            HashMap<String,String> answer = new HashMap();
            while ((line = br.readLine()) != null) {
                answer.put(convertCsvToAnswerGutStudent(line).getStudentExercise(),convertCsvToAnswerGutStudent(line).getStudentAnswers());
            }
            return answer;
        } catch (Exception e) {
            System.out.println("Unable to read data from the file: " + filePath);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public StudentAnswer convertCsvToAnswerGutStudent(String line) {
        String[] tokens = line.split(" - ");
        return new StudentAnswer(tokens[0], tokens[1]);
    }
}
