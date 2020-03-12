package ru.geekbrains.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';

    private static int fieldSizeX=4;
    private static int fieldSizeY=4;
    private static int win=4;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static void initField() {
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("------");
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >=0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода X и Y (от 1 до "+fieldSizeX+") через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int ax;
        int ay;
        int indStroka=0;
        int indStolbec=0;
        int ind1diag=0;
//        int ind2diag=0;

        for (int y=0; y<fieldSizeY; y++) {
            for (int x = 1; x < fieldSizeX; x++) {
                if ((field[y][x - 1] == field[y][x]) && (field[y][x] == DOT_AI)) {
                    indStroka++;
                if (indStroka == (win - 2) && field[y][x] == DOT_EMPTY) {
                    field[y][x] = DOT_AI;
                    return;}
                if (indStroka == (win - 2) && field[y][win-1-x] == DOT_EMPTY) {
                    field[y][win-1-x] = DOT_AI;
                    return;}}}}
        for (int y=0; y<fieldSizeY; y++) {
            for (int x = 1; x < fieldSizeX; x++) {
                if ((field[y][x - 1] == field[y][x]) && (field[y][x] == DOT_HUMAN)) {
                    indStroka++;
                if (indStroka == (win - 2)&& field[y][x] == DOT_EMPTY) {
                    field[y][x] = DOT_AI;
                    return;}
                if (indStroka == (win - 2) && field[y][win-1-x] == DOT_EMPTY) {
                    field[y][win-1-x] = DOT_AI;
                    return;}}}}


        for (int y=0; y<fieldSizeY; y++) {
            for (int x = 1; x < fieldSizeX; x++) {
                if ((field[x - 1][y] == field[x][y]) && (field[x][y] == DOT_AI)) {
                    indStolbec=indStolbec+1;
                if (indStolbec == (win - 2) && field[x][y] == DOT_EMPTY) {
                    field[x][y] = DOT_AI;
                    return;}
                if (indStolbec == (win - 2) && field[win-1-x][y] == DOT_EMPTY) {
                    field[win-1-x][y] = DOT_AI;
                    return;}}}}
        for (int y=0; y<fieldSizeY; y++) {
            for (int x = 1; x < fieldSizeX; x++) {
                if ((field[x - 1][y] == field[x][y]) && (field[x][y] == DOT_HUMAN)) {
                    indStolbec=indStolbec+1;}
                for (int a = 1; x < fieldSizeX; x++) {
                if ((indStolbec == (win - 2)) && (field[a][y] == DOT_EMPTY)) {
                    field[a][y] = DOT_AI;
                return;}
                 if ((indStolbec == (win - 2)) && (field[win-1-a][y] == DOT_EMPTY)) {
                 field[win-1-a][y] = DOT_AI;
                 return;}}}}



        for (int y=0; y<fieldSizeY; y++) {
            for (int x = 1; x < fieldSizeX; x++) {
                if ((field[x-1][x - 1] == field[x][x]) && (field[x][x] == DOT_AI)) {
                    ind1diag++;
                if ((ind1diag == (win - 2)) && (field[x][x] == DOT_EMPTY)) {
                    field[x][x] = DOT_AI;
                    return;}
                else if ((ind1diag == (win - 2)) && (field[win-1-x][win-1-x] == DOT_EMPTY)) {
                    field[win-1-x][win-1-x] = DOT_AI;
                    return;}}}}
        for (int y=0; y<fieldSizeY; y++) {
            for (int x = 1; x < fieldSizeX; x++) {
                if ((field[x - 1][x - 1] == field[x][x]) && (field[x][x] == DOT_HUMAN)) {
                    ind1diag++;
                if ((ind1diag == (win - 2)) && (field[x][x] == DOT_EMPTY)) {
                    field[x][x] = DOT_AI;
                    return;}
                else if ((ind1diag == (win - 2)) && (field[win-1-x][win-1-x] == DOT_EMPTY)) {
                    field[win-1-x][win-1-x] = DOT_AI;
                    return;}}}}


//                if ((field[x-1][y]==field[x][y])&&(field[x][y]==c))
//                {indStolbec++;} else {indStolbec=0;}
//                if ((field[x-1][x-1]==field[x][x])&&(field[x][x]==c))
//                {ind1diag++;} else {ind1diag=0;}
//                if ((field[fieldSizeY-1-(x-1)][x-1]==field[fieldSizeY-1-x][x])&&(field[fieldSizeY-1-x][x]==c))
//                {ind2diag++;} else {ind2diag=0;}
//                if ((indStroka==(win-1))||(indStolbec==(win-1))||(ind1diag==(win-1))||(ind2diag==(win-1))) {
//            }
//    }

        do {
            ax = RANDOM.nextInt(fieldSizeX);
            ay = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(ax, ay)); {
            field[ay][ax] = DOT_AI;
        }}

    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char c) {
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
//        return false;
        int indStroka=0;
        int indStolbec=0;
        int ind1diag=0;
        int ind2diag=0;
        for (int y=0; y<fieldSizeY; y++) {
            for(int x=1; x<fieldSizeX;x++){
                if ((field[y][x-1]==field[y][x])&&(field[y][x]==c))
                {indStroka++;} else {indStroka=0;}
                if ((field[x-1][y]==field[x][y])&&(field[x][y]==c))
                {indStolbec++;} else {indStolbec=0;}
                if ((field[x-1][x-1]==field[x][x])&&(field[x][x]==c))
                {ind1diag++;} else {ind1diag=0;}
                if ((field[fieldSizeY-1-(x-1)][x-1]==field[fieldSizeY-1-x][x])&&(field[fieldSizeY-1-x][x]==c))
                {ind2diag++;} else {ind2diag=0;}
                if ((indStroka==(win-1))||(indStolbec==(win-1))||(ind1diag==(win-1))||(ind2diag==(win-1))) {
                    return true;
            }}}
            return false;
    }



    public static void main(String[] args) {
//        while (true) {
        playOneRound();
//            System.out.println("Play again?");
//            if (SCANNER.next().equals("no"))
//                break;
//        }
    }

    private static void playOneRound() {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выиграл игрок!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
}
