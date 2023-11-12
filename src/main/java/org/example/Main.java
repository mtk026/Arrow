package org.example;

import java.util.Scanner;

public class Main {
    ;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Matrix diamension");

        int input = scan.nextInt();


        while (true) {

            downArrow(input, input);
            leftArrow(input, input);
            upArrow(input, input);
            rightArrow(input, input);

        }
    }

    public static String[][] downArrow(int row, int col) {
        String arrow[][] = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arrow[i][j] = "* ";
            }
        }

        for (int i = 0; i < (halfRow(row)); i++) {
            for (int j = 0; j < col; j++) {

                if (i == j) {
                    arrow[i][j] = "\\ ";
                }

                if ((i + j) == (row - 1)) {
                    arrow[i][j] = "/ ";
                }
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrow[i][j]);

            }
            System.out.println();
        }
        System.out.println("--------------------");


        return arrow;
    }

    public static String[][] leftArrow(int row, int col) {
        String arrow[][] = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arrow[i][j] = "* ";
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = halfRow(row); j < col; j++) {

                if (i == j) {
                    arrow[i][j] = "\\ ";
                }

                if ((i + j) == (row - 1)) {
                    arrow[i][j] = "/ ";
                }
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrow[i][j]);

            }
            System.out.println();
        }
        System.out.println("--------------------");

        return arrow;
    }

    public static String[][] upArrow(int row, int col) {
        int halfRow;

        String arrow[][] = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arrow[i][j] = "* ";
            }
        }

        for (int i = halfRow(row); i < col; i++) {
            for (int j = 0; j < row; j++) {

                if (i == j) {
                    arrow[i][j] = "\\ ";
                }

                if ((i + j) == (row - 1)) {
                    arrow[i][j] = "/ ";
                }
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrow[i][j]);

            }
            System.out.println();
        }
        System.out.println("--------------------");

        return arrow;


    }


    public static String[][] rightArrow(int row, int col) {
        String arrow[][] = new String[row][col];

        int halfRow;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arrow[i][j] = "* ";
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < (halfRow(row)); j++) {

                if (i == j) {
                    arrow[i][j] = "\\ ";
                }

                if ((i + j) == (row - 1)) {
                    arrow[i][j] = "/ ";
                }
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrow[i][j]);

            }
            System.out.println();
        }
        System.out.println("--------------------");

        return arrow;


    }

    public static int halfRow(int row) {
        int halfRow;
        if (row % 2 == 0) {
            halfRow = row / 2;
        } else {
            halfRow = ((row - 1) / 2);


        }
        return halfRow;
    }


}
