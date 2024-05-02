package org.example;

public class Answers{
    private final String exercise;
    private final String answers;

    public String getExercise() {
        return exercise;
    }

    public String getAnswers() {
        return answers;
    }

    public Answers(String exercise, String answers) {
        this.exercise = exercise;
        this.answers = answers;
    }
}
