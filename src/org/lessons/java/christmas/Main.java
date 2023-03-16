package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wishes = new ArrayList<>();
//        System.out.println(wishes.isEmpty());
//        System.out.println(wishes.size());

        // Flag per ciclo while
        boolean stop = false;
        while (!stop){
            System.out.print("Inserisci il tuo desiderio: ");
            String wish = scan.nextLine();

            // AGGIUNGO IL DESIDERIO ALLA LISTA
            wishes.add(wish);

            // CHIEDO ALL'UTENTE SE NE VUOLE AGGIUNGERE ALTRI
            System.out.print("Ne vuoi aggiungere un'altro? (s/n): ");

            // FERMO IL CICLO SE DIGITA "N"
            stop = scan.nextLine().equalsIgnoreCase("n");
        }

        System.out.println("Ecco la tua lista: ");
        System.out.println(wishes);
    }
}
