package org.example;

import java.util.Scanner;

public class Parking {
    public static double calculateParkingFee(int hours) {
        double fee = 0.0;

        if (hours <= 5) {
            fee = 1.0; // Biaya untuk 5 jam pertama
        } else if (hours <= 24) {
            fee = 0.5 * (hours - 5); // Biaya setelah 5 jam pertama
        } else {
            fee = 15.0; // Biaya flat untuk lebih dari 24 jam
        }

        return fee;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        int hours1 = 26;
        System.out.println("Biaya parkir untuk " + hours1 + " jam: $" + calculateParkingFee(hours1));

        int hours2 = 8;
        System.out.println("Biaya parkir untuk " + hours2 + " jam: $" + calculateParkingFee(hours2));

//        int hours3 = ;
//        system.out.println("Biaya parkir untuk " + )
    }
}