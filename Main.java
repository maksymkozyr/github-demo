package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a month");
        Months month = Months.valueOf(br.readLine().toUpperCase());


        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Spring");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Autumn");
                break;
        }
    }
}

enum Months {
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    JUNE,
    JULY,
    AUGUST,
    MARCH,
    APRIL,
    MAY,
    DECEMBER,
    JANUARY,
    FEBRUARY;

}