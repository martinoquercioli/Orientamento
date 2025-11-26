 package EserciziJava;

import java.util.Random;

class indovinanumero {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroDaIndovinare = random.nextInt(10) + 1; // Numero casuale tra 1 e 10
        int tentativo = 3; // Numero di tentativi concessi
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Benvenuto al gioco di indovina il numero!");
        System.out.println("Hai " + tentativo + " tentativi per indovinare il numero tra 1 e 10.");

        while (tentativo > 0) {
            System.out.print("Inserisci il tuo tentativo: ");
            int numeroUtente = scanner.nextInt();

            if (numeroUtente == numeroDaIndovinare) {
                System.out.println("Congratulazioni! Hai indovinato il numero.");
                break;
            } else {
                tentativo--;
                if (tentativo > 0) {
                    System.out.println("Numero sbagliato. Ti rimangono " + tentativo + " tentativi.");
                } else {
                    System.out.println("Mi dispiace, hai esaurito i tentativi. Il numero era: " + numeroDaIndovinare);
                }
            }
        }

        scanner.close();
    }   
}