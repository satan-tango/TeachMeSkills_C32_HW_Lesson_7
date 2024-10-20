package com.varkovich.lesson_7.task_2.entity.impl;

import com.varkovich.lesson_7.task_2.entity.Figure;

public class Triangle extends Figure {

    public final String FIGURE_NAME = "triangle";
    public double firstSide;
    public double secondSide;
    public double thirdSide;

    public Triangle(double fistSide, double secondSide, double thirdSide) {
        this.firstSide = fistSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double perimeterCalculation() {
        return (firstSide + secondSide + thirdSide)/2;
    }

    @Override
    public double squareCalculation() {
        return Math.sqrt(perimeterCalculation() * (perimeterCalculation() - firstSide) *
                (perimeterCalculation() - secondSide) * (perimeterCalculation() - thirdSide));
    }

    @Override
    public void showInformationAboutFigure() {
        System.out.printf("%s(%.2f,%.2f,%.2f) P= %.2f S= %.2f\n\n", FIGURE_NAME, firstSide, secondSide,
                thirdSide, perimeterCalculation(), squareCalculation());
    }
}
