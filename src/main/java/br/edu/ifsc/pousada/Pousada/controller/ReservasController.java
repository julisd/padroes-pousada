package br.edu.ifsc.pousada.Pousada.controller;

import br.edu.ifsc.pousada.Pousada.entidade.Reserva;

import java.util.ArrayList;

public final class ReservasController {

    private static ReservasController instance;
    private ArrayList<Reserva> reservas;
    private int idReserva = 1;


    private ReservasController() {
        reservas = new ArrayList<>();
    }

    public static ReservasController getInstance() {
        if (instance == null) {
            instance = new ReservasController();
        }
        return instance;
    }

    public void cadastrarReserva(Reserva reserva){
        if(buscarPorId(reserva.getId())==null){
            reserva.setId(idReserva);
            reservas.add(reserva);
            idReserva++;
            System.out.println("Reserva cadastrada com sucesso: " + reserva.getId());
        }else{
            System.out.println("Reserva já cadastrada: " + reserva.getId());
        }
    }

    public ArrayList<Reserva> listarReservas(){
        return reservas;
    }

    public Reserva buscarPorId(int id){
        for(Reserva r: reservas){
            if(r.getId() == id){
                return r;
            }
        }
        return null;
    }


}
