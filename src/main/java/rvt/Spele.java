package rvt;

import java.util.*; // * - immportē visu


public class Spele {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
Random random = new Random();
int result = random.nextInt(10) + 1;

int guessamount = 0;
System.out.println("Es domaju par skaitli no 1 lidz 10\n Tev tas jauzmin 3 meginajumos");
System.out.println("Pirmais minejums: ");

while (true) {

int guess = scanner.nextInt();
if (guess == result) {
System.out.println("Pareizi!!!!!\n Tu uzvareji!!!!");
break;
}else {
    System.out.println("Nepareizi");
    guessamount++;
    }
    if (guessamount == 3) {
    System.out.println("Pareizais skaitlis bija: "+ result);
    break;
    }
    }
    scanner.close();
    }
    
    
    
    }
    