package rvt;

import java.util.Scanner;

public class positive_negative {

public static void main(String[] args) {
//1
Scanner scanner = new Scanner(System.in);

int number = Integer.valueOf(scanner.nextLine());
if (number > 0) {
System.out.println("pozitivs skaitlis");
} else {
System.out.println("negativs skaitlis");
}
scanner.close();
}
}
