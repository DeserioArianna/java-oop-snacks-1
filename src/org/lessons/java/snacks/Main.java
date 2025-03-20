package org.lessons.java.snacks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        String cognome = input.nextLine();
        int eta = input.nextInt();

        Studente studente = new Studente(nome, cognome, eta);
        studente.stampa();
    }
}
