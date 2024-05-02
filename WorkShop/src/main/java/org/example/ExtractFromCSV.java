package org.example;

import java.util.HashMap;

public interface ExtractFromCSV {
    public HashMap<String,String> csvToStringGut();

    public Answers convertCsvToAnswerGut(String line);
    public HashMap<String,String> csvToStringStudent();
    public StudentAnswer convertCsvToAnswerGutStudent(String line);


}
