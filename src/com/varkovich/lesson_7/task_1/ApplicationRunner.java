package com.varkovich.lesson_7.task_1;

import com.varkovich.lesson_7.task_1.entity.impl.Accountant;
import com.varkovich.lesson_7.task_1.entity.impl.Director;
import com.varkovich.lesson_7.task_1.entity.impl.Worker;

import java.util.Scanner;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        boolean isCycleRunning = true;
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        Scanner console = new Scanner(System.in);
        int enteredPosition = 0;

        while (isCycleRunning) {
            System.out.println("Position code:");
            System.out.println("1 - Director");
            System.out.println("2 - Worker");
            System.out.println("3 - Accountant");
            System.out.println("4 - Exit");
            System.out.print("Enter the position: ");
            enteredPosition = console.nextInt();

            switch (enteredPosition) {
                case 1 -> director.showPosition(director.POSITION);
                case 2 -> worker.showPosition(worker.POSITION);
                case 3 -> accountant.showPosition(accountant.POSITION);
                case 4 -> isCycleRunning = false;
                default -> System.out.println("Invalid input,try again!\n");
            }

        }
    }
}
