package EserciziJava;

import java.util.Scanner;

 public class esercizi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ti sta interessando informatica? (si/no):) ");
        String risposta = scanner.nextLine();
        if (risposta.equalsIgnoreCase("si")) {
            System.out.println("Iscriviti al MARCONI");
        } else {
            System.out.println("Ci sono tanti altri indirizzi interessanti.");

            
        }
}
 }