package com.varkovich.lesson_7.task_2.entity.impl;

import com.varkovich.lesson_7.task_2.entity.Figure;

public class Circle extends Figure {

    public final String FIGURE_NAME = "circle";
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * Math.PI * radius;
    }


    @Override
    public double squareCalculation() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void showInformationAboutFigure() {
        System.out.printf("%s(%.2f) P= %.2f S= %.2f\n\n", FIGURE_NAME, radius, perimeterCalculation(), squareCalculation());
    }
}
