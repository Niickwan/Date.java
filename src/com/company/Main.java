package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Day = "Friday";
        int Date = 3;
        String Month = "September";
        int Year = 2021;

        System.out.println(Day);
        System.out.println(Date);
        System.out.println(Month);
        System.out.println(Year);

        System.out.println("American format: " + Day + ", " + Month + " " + Date + ", " + Year);
        System.out.println("European format: " + Day + " " + Date + " " + Month + " " + Year);
    }
}
