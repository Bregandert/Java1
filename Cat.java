package ru.geekbrains.Java1.Lesson5;

public class Cat extends Animal {



    public void setMaxRun(int maxRun) {
        this.maxRun=maxRun;
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


    public Cat(String name) {
        super(name, 200, 0,2);
        setMaxRun(400);
//        setMaxSweem(0);
//        setMaxJump(2);
    }



}
