package ru.geekbrains.Java1.Lesson5;

public class Horse extends Animal {

//    @Override
//    public void setMaxRun(int maxRun) {
//        this.maxRun=maxRun;
//    }
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
    public Horse(String name) {
        super(name, 1500, 500, 3);
//        setMaxRun(1500);
//        setMaxSweem(500);
//        setMaxJump(3);
    }
}
