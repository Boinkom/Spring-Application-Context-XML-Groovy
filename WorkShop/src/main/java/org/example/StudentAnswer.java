package org.example;

public class StudentAnswer{
    private final String studentExercise;
    private final String studentAnswers;

    public String getStudentExercise() {
        return studentExercise;
    }

    public String getStudentAnswers() {
        return studentAnswers;
    }

    public StudentAnswer(String studentExercise, String studentAnswers) {
        this.studentExercise = studentExercise;
        this.studentAnswers = studentAnswers;
    }
}
