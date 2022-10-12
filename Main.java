import java.util.Scanner;

public class Main {
    /**Scanner object som är globalt över hela programmet. */
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        // Gör en array som vi använder som parameter, under kallar vi på våra metoder.
        int[] numbArray = new int[5];
        number(numbArray);
        numChange(numbArray);
    }
    /**En metod som tar en int array så vi kan lägga in våran array som parameter */
    public static void number(int[] num) {
        // En metod med array int parameter, vi loopar arrayen för varje input och gör en try catch för att hantera input som inte är nummer.
        System.out.println("Enter 5 numbers!");
        try {
            for(int i = 0; i < num.length; i++)
            {
                num[i] = scn.nextInt();
            }
            
        }catch (Exception e) {
            System.out.println("You must enter a number!");
        }
        sum(num);
    }
    /**
     * En metod som räknar ut summan och tar en int array som parameter.
     */
    public static void sum(int[] num) {
        // Metoden som räknar ut vårt resultat av input nummren vi matar in.
        System.out.println(num[0] + num[1] + num[2] + num[3] + num[4]);
    }
    public static void numChange(int[] num) {
        // Ändrar värdet på plats 2 och 4.
        num[1] = 4;
        num[3] = 9;
        sum(num);
        // Kallar på sum här igen så vi även får resultatet av våra ändrade värden.
    }
}