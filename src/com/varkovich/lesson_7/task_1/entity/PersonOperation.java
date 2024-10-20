package com.varkovich.lesson_7.task_1.entity;

public interface PersonOperation {

    default void showPosition(String position) {
        System.out.printf("Position name is %s\n\n", position);
    }
}
