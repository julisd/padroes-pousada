package br.edu.ifsc.pousada.Pousada.entidade;

import java.util.ArrayList;

public class ReservaBuilder {
    private Reserva reserva;

    public ReservaBuilder() {
        reserva = new Reserva();
    }

    public ReservaBuilder addDataInOut(String dataCheckIn, String dataCheckOut) {
        this.reserva.setDataCheckIn(dataCheckIn);
        this.reserva.setDataCheckOut(dataCheckOut);
        return this;
    }

    public ReservaBuilder setNumeroHospedes(int numeroHospedes) {
        this.reserva.setNumeroHospedes(numeroHospedes);
        return this;
    }

    public ReservaBuilder addServicoAdicional(String nome, double preco) {
        if (this.reserva.getServicosAdicionais() == null) {
            this.reserva.setServicosAdicionais(new ArrayList<>());
        }
        ServicoAdicional servicoAdicional = new ServicoAdicional(nome, preco);
        this.reserva.getServicosAdicionais().add(servicoAdicional);

        return this;
    }

    public Reserva build() {
        return reserva;
    }
}
