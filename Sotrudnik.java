package ru.geekbrains.java1.lesson4;

import java.security.DrbgParameters;

//1.Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
public class Sotrudnik {
    private String name;
    int sallary;
    private int age;
    private String job;
//8. Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
    static int count;
    public int id;

//3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getName(){
        return this.name;
    }
    public String getJob(){
        return this.job;
    }
    public int getSallary(){
        return this.sallary;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(){
        this.name=name;
    }
    public void setSallary(){
        this.sallary=sallary;
    }
    public void setAge(){
        this.age=age;
    }
    public void setJob(){
        this.job=job;
    }




//2. Конструктор класса должен заполнять эти поля при создании объекта;
    public Sotrudnik() {
        count++;
        name = "Ivanov";
        sallary = 50000;
        age = 27;
        job = "manager";
//        this.i+=1;
//        id[i]=i;
        id=count;

        }


    public Sotrudnik (String setName, int setAge, int setSallary, String setJob) {
        count++;
        this.name=setName;
        this.age=setAge;
        this.job=setJob;
        this.sallary=setSallary;
//        this.i+=1;
//        id[i]=i;
        id=count;

        }

    }



