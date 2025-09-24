package rvt;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prasam lietotājam ievadīt skaitli
        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        // Pārbaudām ar % operatoru
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

        scanner.close();
    }
}
