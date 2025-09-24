package rvt;
import java.util.Scanner;

public class sazarojumi {


public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int speed = Integer.valueOf(scanner.nextLine());
if (speed > 120) {
System.out.println("Speeding ticket!");
} else {
System.out.println("no speeding ticket");
}
scanner.close();
}
}

