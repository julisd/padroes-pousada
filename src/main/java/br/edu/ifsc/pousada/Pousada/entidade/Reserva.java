package br.edu.ifsc.pousada.Pousada.entidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private int numeroHospedes;
    private ArrayList<ServicoAdicional> servicosAdicionais;


    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public int getNumeroHospedes() {
        return numeroHospedes;
    }

    public void setNumeroHospedes(int numeroHospedes) {
        this.numeroHospedes = numeroHospedes;
    }

    public ArrayList<ServicoAdicional> getServicosAdicionais() {
        return servicosAdicionais;
    }

    public void setServicosAdicionais(ArrayList<ServicoAdicional> servicosAdicionais) {
        this.servicosAdicionais = servicosAdicionais;
    }
}
