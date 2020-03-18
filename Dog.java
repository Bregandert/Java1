package ru.geekbrains.Java1.Lesson5;

import java.util.Random;

public class Dog extends Animal {


//Разброс значения нарисовал только собаке
    public void setMaxRun(int maxRun) {
        int range=100;
        this.maxRun=(int)(maxRun-(range/2)+(Math.random()*range));

    }
//
//    @Override
//    public void setMaxSweem(int maxSweem) {
//        this.maxSweem=maxSweem;
//    }
//
//    @Override
//    public void setMaxJump(float maxHigth) {
//        this.maxJump=maxJump;
//    }
    public Dog(String name) {
        super(name, 500, 500, 0.5f);
        setMaxRun(600);
//        setMaxSweem(500);
//        setMaxJump(0.5f);
    }
}
