package ru.geekbrains.Java1.Lesson5;

public class Bird extends Animal {

//    @Override
//    public void setMaxRun(int maxRun) {
//       this.maxRun=maxRun;
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

    public Bird(String name) {
        super(name, 5, 0, 0.2f);
//        setMaxRun(5);
//        setMaxSweem(0);
//        setMaxJump(0.2f);
    }
}
