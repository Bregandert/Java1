package ru.geekbrains.Java1.Lesson5;

import jdk.dynalink.beans.StaticClass;

public abstract class Animal {

    protected String name;
      protected int maxRun;
    protected int maxSwim;
    protected float maxJump;


    protected int runLength;
    protected int swimLength;
    protected float jumpHigth;

//Сначала хотел обязать прописывать эти методы а потом понял что все проще
//    public abstract void setMaxRun(int maxRun);
//    public abstract void setMaxSweem(int maxSweem);
//    public abstract void setMaxJump(float maxHigth);

//Конструктор сократил до имени для простоты
    public Animal(String name, int maxRun, int maxSwim, float maxJump){
       this.name=name;
       this.maxRun=maxRun;
       this.maxSwim=maxSwim;
       this.maxJump=maxJump;


     }

//     Все условия прописал в классе животных
    public String run(int runLength){
        String a="";
        if (runLength<=maxRun&&runLength>0) {
//Добавил для проверки разброса вывод в строку MaxRun
            a = this.name + " пробежал " +runLength+ " метров. Может пробежать "+maxRun +" метров";
        } else if (runLength==0||runLength<0||maxRun==0){
            a=this.name + " не умеет бегать";
        }else if (runLength>maxRun) {
            a = this.name + " столько не пробежит, не издевайтесь над животным";
        }
        return a;
    }


    public String swim(int swimLength){
        String a="";
        if (swimLength<=maxSwim&&swimLength>0) {
            a = this.name + " проплыл " +swimLength+ " метров";
        } else if (swimLength==0||swimLength<0||maxSwim==0) {
            a = this.name + " не умеет плавать";
        } else if (swimLength>maxSwim) {
            a = this.name + " столько не проплывет, не издевайтесь над животным";
        }

        return a;
    }

    public String jump(int jumpHigth){
        String a="";
        if (jumpHigth<=maxJump&&jumpHigth>0) {
            a = this.name + " прыгнул на " +jumpHigth+ " метров";
        } else if (jumpHigth==0||jumpHigth<0||maxJump==0){
            a=this.name + " не умеет прыгать";
        } else if (jumpHigth>maxJump) {
            a = this.name + " так высоко не прыгнет, не издевайтесь над животным";
        }
        return a;
    }

}

