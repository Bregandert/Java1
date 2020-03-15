package ru.geekbrains.java1.lesson4;

import java.util.Arrays;

public class lesson4 {


    public static void main(String[] args) {
        int i;
        int xSallary=0;
        int xAge=0;

    Sotrudnik Sotrudnik0 = new Sotrudnik();

//4. Вывести при помощи методов из пункта 3 ФИО и должность
//        System.out.println(Sotrudnik0.getName() + " " + Sotrudnik0.getAge() + "лет " + Sotrudnik0.getSallary() + "руб. " + Sotrudnik0.getJob());
        System.out.println(Sotrudnik0.getName() + " " + Sotrudnik0.getJob());
        System.out.println();

//5.Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Sotrudnik[] Sotr=new Sotrudnik[5];
        Sotr[0]=new Sotrudnik("Ivanov", 27, 50000, "manager");
        Sotr[1]=new Sotrudnik("Petrov", 41, 30000, "prodavec");
        Sotr[2]=new Sotrudnik("Sidorov", 48, 150000, "director");
        Sotr[3]=new Sotrudnik("Volkov", 25, 15000, "gruzchik");
        Sotr[4]=new Sotrudnik("Somova", 28, 30000, "secretar");

        for (i=0;i<Sotr.length; i++) {
            if (Sotr[i].getAge()>40){
                System.out.println(Sotr[i].getName() + " " + Sotr[i].getAge() + "лет " + Sotr[i].getSallary() + "руб. " + Sotr[i].getJob());
            }
        }
        System.out.println();
//6.Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        for (i=0;i<Sotr.length; i++) {
            if (Sotr[i].getAge()>45){
                Sotr[i].sallary=Sotr[i].sallary+5000;
                System.out.println(Sotr[i].getName() + " " + Sotr[i].getAge() + "лет " + Sotr[i].getSallary() + "руб. " + Sotr[i].getJob());
            }
        }
        System.out.println();
//7. Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
        for (i=0;i<Sotr.length; i++) {
            xAge+=Sotr[i].getAge();
            xSallary+=Sotr[i].getSallary();
        }
        xAge=xAge/Sotr.length;
        xSallary=xSallary/Sotr.length;
        System.out.println("Средний возраст сотрудников "+xAge);
        System.out.println("Средняя зарплата сотрудников "+xSallary);
        System.out.println();

//8. Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
        System.out.println((Sotr[3].id));
        }
    }








