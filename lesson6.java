package ru.geekbrains.java1.Lesson6;

import java.io.*;
import java.util.Scanner;

public class lesson6 {



    public static void main (String[] args) {

        String dir="E:\\java\\Lesson6";
        String poisk="study";

        try {
        PrintStream ps1=new PrintStream(new FileOutputStream("file1.txt"));
            ps1.println("Hello World.");
            ps1.println("My name is Dmitriy.");
            ps1.println("I am from Russia & I study Java on this Lesson.");

        PrintStream ps2=new PrintStream(new FileOutputStream("file2.txt"));
            ps2.println("Hello Guys & Girs.");
            ps2.println("I am here.");
            ps2.println("Java is very important in our life.");
            ps1.close();
            ps2.close();
        } catch (IOException e) {
                e.printStackTrace();
            }


        try {
            PrintStream ps3=new PrintStream(new FileOutputStream("file3.txt"));
            ps3.print(chitka("file1.txt"));
            ps3.print(chitka("file2.txt"));


        } catch (IOException e) {
            e.printStackTrace();
        }


        if (proverka("file1.txt", poisk)){
            System.out.println();
            System.out.println("Слово найдено");
        } else {
            System.out.println();
            System.out.println("Слово не найдено");
        }



        for (int i=0; i<getList(dir).length;i++){
            if (getList(dir)[i]==null){
                continue;
            }
            else if (proverka(getList(dir)[i],poisk)){
                System.out.println();
                System.out.println("Слово найдено в файле "+getList(dir)[i]);
            } else {
                System.out.println();
                System.out.println("В файле "+getList(dir)[i]+" cлово не найдено");
            }
        }

    }





        public static StringBuilder chitka(String name) {
            StringBuilder a=new StringBuilder(" ");
            try {
                Scanner sc1 = new Scanner(new FileInputStream(name));
                while (sc1.hasNext()) {
                    a.append(sc1.nextLine());
                    a.append("\n");

                }
                sc1.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print(a);
            return a;
        }
        public static boolean proverka(String name, String poisk) {

            String a;

            try {
                Scanner sc1 = new Scanner(new FileInputStream(name));
                while (sc1.hasNext()) {
                    a=sc1.next();

                    if (a.equals(poisk)){
                    return true;
                }

            }
            sc1.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
    return false;
    }

    public static String[] getList(String directory) {

            File[] filesList;
            File filesPath = new java.io.File(directory); // создаем объект на папку с файлами

            filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File
            String[] a=new String[filesList.length];

        int j=0;
            for(int i=0; i<filesList.length; i++){

                String buf = filesList[i].getName(); // читаем текущее имя файла
                if(buf.endsWith(".txt")){  // если заканчивается на .txt, то
                    a[j]=buf;
                    j++;
                }
            } return a;
}}





