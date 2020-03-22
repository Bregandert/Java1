package ru.geekbrains.Java1.Lesson5;

import static java.sql.DriverManager.println;

public class Lesson5 {

    public static void main (String[] args){

//        Cat cat1=new Cat("Барсик");

//        System.out.println(cat1.run(200));

        Animal[] zoo = {new Cat("Мурзик"), new Dog("Тузик"), new Dog("Полкан"), new Horse("Орландо"), new Bird("Кеша")};
        for (int i=0; i<zoo.length;i++){
            System.out.println(zoo[i].run(300));
            System.out.println(zoo[i].swim(15));
            System.out.println(zoo[i].jump(1));
            System.out.println("________________________________");
        }

    }}
