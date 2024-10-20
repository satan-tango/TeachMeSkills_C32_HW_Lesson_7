package com.varkovich.lesson_7.task_2.service;

import com.varkovich.lesson_7.task_2.entity.Figure;

public interface FigureOperation {

    public double sumOfPerimeters(Figure[] figuresArray);

    public void showInformationAboutFigure(Figure[] figuresArray);
}
