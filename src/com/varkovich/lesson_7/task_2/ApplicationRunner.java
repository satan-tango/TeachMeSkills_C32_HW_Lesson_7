package com.varkovich.lesson_7.task_2;

import com.varkovich.lesson_7.task_2.entity.Figure;
import com.varkovich.lesson_7.task_2.entity.impl.Circle;
import com.varkovich.lesson_7.task_2.entity.impl.Rectangle;
import com.varkovich.lesson_7.task_2.entity.impl.Triangle;
import com.varkovich.lesson_7.task_2.service.FigureOperation;
import com.varkovich.lesson_7.task_2.service.impl.FigureOperationImpl;

/**
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
 * Создать массив из 5 разных фигур.
 * Пройтись циклом по массиву и вывести информацию о каждой фигуре.
 * Вывести на экран сумму периметров всех фигур в массиве.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3, 4, 5),
                new Rectangle(2, 3),
                new Circle(4.2),
                new Triangle(6, 8, 10),
                new Circle(55.55)
        };
        FigureOperation figureOperation = new FigureOperationImpl();

        figureOperation.showInformationAboutFigure(figures);
        double sumOfPerimeters = figureOperation.sumOfPerimeters(figures);
        System.out.printf("Perimeters summation: %.2f", sumOfPerimeters);

    }
}
