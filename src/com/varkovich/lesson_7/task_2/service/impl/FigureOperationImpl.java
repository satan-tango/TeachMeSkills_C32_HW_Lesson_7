package com.varkovich.lesson_7.task_2.service.impl;

import com.varkovich.lesson_7.task_2.entity.Figure;
import com.varkovich.lesson_7.task_2.service.FigureOperation;

public class FigureOperationImpl implements FigureOperation {

    @Override
    public double sumOfPerimeters(Figure[] figuresArray) {
        double resultOfSummation = 0;

        if (figuresArray == null) {
            return 0;
        }

        for (int i = 0; i < figuresArray.length; i++) {
            resultOfSummation += figuresArray[i].perimeterCalculation();
        }

        return resultOfSummation;
    }

    @Override
    public void showInformationAboutFigure(Figure[] figuresArray) {
        if (figuresArray == null) {
            System.out.println("There is no array");
        }

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i].showInformationAboutFigure();
        }
    }
}
