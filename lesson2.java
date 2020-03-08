package ru.geekbrains.java1.lesson2;

import javax.swing.*;
import java.util.Arrays;

public class lesson2 {

        private static void change(int[] arr) {
            int i =arr.length;
            int[] arr1 = new int[i];
            for (i = 0; i < arr.length; i++) {
                arr1[i] = (int) (Math.random() * 2);}
                System.out.println(Arrays.toString(arr1));

                for (i = 0; i < arr.length; i++) {
                    if (arr1[i] == 1) {
                        arr1[i] = 0;
                    } else {
                        arr1[i] = 1;
                    }
                }
                System.out.println(Arrays.toString(arr1));
            }

        private static void cycle(int[] arr) {
            int i =arr.length;
            int[] arr2 = new int[i];
            for (i = 0; i < arr.length; i++) {
                arr2[i] = 1+i*3;}
            System.out.println(Arrays.toString(arr2));}

      private static int[] na6(int[] arr) {
          int i = arr.length;
          int[] arr3 = new int[arr.length];
          for (i = 0; i < arr.length; i++) {
              if (arr[i] < 6) {
                  arr3[i] = arr[i] * 2;
              } else {
                  arr3[i] = arr[i];
              }
          }
          System.out.println(Arrays.toString(arr3));
          return arr3;
      }

      private static int max(int[] arr) {
          int a = arr[0];
          int i = arr.length;
          int[] arr4 = new int[arr.length];
          for (i = 0; i < arr.length; i++) {
              arr4[i] = arr[i];
              if (arr4[i] > a) {
                  a = arr4[i];
              } else {
                  a = a;
              }
          }
          System.out.println(Arrays.toString(arr4));
          System.out.println("Максимальное число в массиве " + a);
          return a;
      }

      private static int min(int[] arr){
            int a=arr[0];
            int i=arr.length;
            int[] arr4=new int[arr.length];
            for (i=0;i<arr.length;i++){
                arr4[i]=arr[i];
                if (arr4[i]<a){
                    a=arr4[i];
                }else {a=a;}
              }
              System.out.println(Arrays.toString(arr));
              System.out.println("минимальное число в массиве "+a);
              return a;

      }
      private static boolean checkBalance(int[] arr) {
            int i = arr.length;
            int j = arr.length;
            int a=0;
            int b=0;
            boolean c=false;
            int[] arr6 = new int[arr.length];
            for (i=0;i<arr.length;i++){
                arr6[i]=arr[i];}
            for (i = 0; i < arr.length; i++) {
                a=a+arr6[i];
                b=0;
                for (j = (i+1); j < arr.length; j++){
                b=b+arr6[j];}
                if (a==b) {
                    c=true;
                    break;
                }else continue;
        }
            System.out.println(c);
            return c;}

            //не додумался как через вспомогательный массив, только до такого метода дошел
        private static int[] smeshenie(int[] arr,int n) {
            int i = arr.length;
            int b=arr.length;
            int[] arr7 = new int[arr.length];
            if (n>0){
            for (i = 0; i < arr.length; i++) {
                if ((i+n)<arr.length){
                    arr7[i+n]=arr[i];
                }else {
                arr7[((i+n)%b)]=arr[i];}
            }}else{
            for (i = 0; i < arr.length; i++) {
                    if ((i-n)<arr.length){
                        arr7[i]=arr[i-n];
                    }else {
                        arr7[i]=arr[((i-n)%b)];}
            }
        }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr7));
            return arr7;
        }

        public static void main(String[] args) {
            int[] arr1 = new int[10];
            change(arr1);
            System.out.println();

            int[] arr2 = new int[8];
            cycle(arr2);
            System.out.println();

            int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arr3));
            na6(arr3);
            System.out.println();

            int[] arr4 = new int[]{1, 5, 3, -2, 11, 4, 5, 2, 4, 8, 9, 1};
            max(arr4);
            System.out.println();
            min(arr4);
            System.out.println();

            int x;
            int y;
            int[][] arr5 = new int[6][6];
            for (x = 0; x < arr5.length; x++) {
                for (y = 0; y < arr5[0].length; y++) {
                    if ((x == y) || ((x + y) == arr5.length - 1)) {
                        arr5[x][y] = 1;
                    } else {
                        arr5[x][y] = 0;
                    }
                }
                System.out.println(Arrays.toString(arr5[x]));
            }
            System.out.println();

            int[] arr6 = new int[]{1, 2, 3, 4};
            checkBalance(arr6);
            System.out.println();

            int[] arr7 = new int[]{1, 2, 3, 4};
            smeshenie(arr7,-5);

        }
        }
