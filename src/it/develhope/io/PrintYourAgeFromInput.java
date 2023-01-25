package it.develhope.io;
import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.printf("Your age is: %d", age);
        input.close();
    }
    /*c'è un errore nel testo dell'esercizio, dice di usare %f, che si usa per i numeri in virgola mobile
    mentre in questo caso bisogna usare il %d che è per i numeri interi decimali.
     */
}
