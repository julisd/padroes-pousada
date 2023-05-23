package br.edu.ifsc.pousada.Pousada.controller;

public final class ReservasController {

    private static ReservasController instance;

    private ReservasController() {
        // Construtor privado para evitar a criação direta de instâncias
    }

    public static ReservasController getInstance() {
        if (instance == null) {
            instance = new ReservasController();
        }
        return instance;
    }



}
