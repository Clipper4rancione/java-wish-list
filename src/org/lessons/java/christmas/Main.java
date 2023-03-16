package org.lessons.java.christmas;

import java.util.*;

public class Main {
    public static void main(String[] args) throws wishesException {
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

            // STAMPO QUANTI DESIDERI SONO STATI AGGIUNTI FINO AD ORA NELLA LISTA
            System.out.println("Hai aggiunto " + wishes.toArray().length + " desideri");

        }
        // DATI DEL MITTENTE
        System.out.print("Come ti chiami? ");
        String name = scan.nextLine();
        System.out.print("Il tuo indirizzo? ");
        String address = scan.nextLine();

        Collections.sort(wishes);
        System.out.println("***************");
        System.out.println("Ecco la tua lista: ");
        System.out.println();
        System.out.println(wishes);
        System.out.println("***************");


        try {
            ChristmasLetter letter = new ChristmasLetter(name, address, wishes);
            System.out.println(letter.send());
        } catch (wishesException e) {
            e.getMessage();
        }
    }



}
