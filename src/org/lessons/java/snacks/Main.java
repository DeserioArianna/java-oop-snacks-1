package org.lessons.java.snacks;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        String cognome = input.nextLine();
        int eta = input.nextInt();

        Studente studente = new Studente(nome, cognome, eta);
        studente.stampa();

        ContoBancario contoBancario = new ContoBancario();
        contoBancario.depositoDenaro(new BigDecimal("200.00"));
        System.out.println("Saldo con soldi depositati: " + contoBancario.getSaldo());
        contoBancario.prelievoDenaro(new BigDecimal("100.10"));
        System.out.println("Saldo dopo il prelievo: " + contoBancario.getSaldo());

        RegistroStudenti registroStudenti = new RegistroStudenti();
        Studente studente2 = new Studente("Rossella", "Rossi", 24);
        Studente studente3 = new Studente("Maria", "Panaro", 46);
        Studente studente4 = new Studente("Vincenza", "Cardone", 53);
        Studente studente5 = new Studente("Tiziana", "Grassi", 23);
        registroStudenti.aggiungiStudente(studente2);
        registroStudenti.aggiungiStudente(studente3);
        registroStudenti.aggiungiStudente(studente4);
        registroStudenti.aggiungiStudente(studente5);

        registroStudenti.stampaStudenti();
    }
}
