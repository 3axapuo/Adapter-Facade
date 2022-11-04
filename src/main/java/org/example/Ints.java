package org.example;

// ЗАДАЧА №1, пользователю же нужен другой интерфейс для работы с калькулятором
public interface Ints {
    int sum(int arg0, int arg1); // сложение

    int mult(int arg0, int arg1); // умножение

    int pow(int a, int b); // возведение в степень
}
