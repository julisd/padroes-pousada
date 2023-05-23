package br.edu.ifsc.pousada.Pousada.entidade;

import java.util.ArrayList;

public class Reserva {

    private int id;
    private String dataCheckIn;
    private String dataCheckOut;
    private int numeroHospedes;
    private ArrayList<ServicoAdicional> servicosAdicionais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataCheckIn(String dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public void setDataCheckOut(String dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
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

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", dataCheckIn='" + dataCheckIn + '\'' +
                ", dataCheckOut='" + dataCheckOut + '\'' +
                ", numeroHospedes=" + numeroHospedes +
                ", servicosAdicionais=" + servicosAdicionais +
                '}';
    }
}
