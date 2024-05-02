package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var examination = annotationConfigApplicationContext.getBean(CheckingAndScoring.class);

        System.out.println("Набранное колличесвто баллов: " + examination.sumScore());
    }
}