package org.lessons.java.snacks;

import java.util.ArrayList;

public class RegistroStudenti {
    private ArrayList<Studente> registroStudenti;

    public RegistroStudenti() {
        this.registroStudenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        registroStudenti.add(studente);
    }

    public void stampaStudenti() {
        if (registroStudenti.isEmpty()) {
            System.out.println("Il registro è vuoto.");
        } else {
            System.out.println("Lista degli studenti");
            for (int i = 0; i < registroStudenti.size(); i++) {
                registroStudenti.get(i).stampa();
            }
        }
    }
}
