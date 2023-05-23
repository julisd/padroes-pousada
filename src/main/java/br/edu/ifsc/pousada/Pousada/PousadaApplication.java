package br.edu.ifsc.pousada.Pousada;

import br.edu.ifsc.pousada.Pousada.controller.ReservasController;
import br.edu.ifsc.pousada.Pousada.entidade.Quarto;
import br.edu.ifsc.pousada.Pousada.entidade.Reserva;
import br.edu.ifsc.pousada.Pousada.entidade.ReservaBuilder;

import java.util.ArrayList;

public class PousadaApplication {

	public static void main(String[] args) {
		ReservasController reservasController = ReservasController.getInstance();
		Reserva reserva = new ReservaBuilder().addDataInOut("2023-06-01", "2023-06-05")
				.setNumeroHospedes(2)
				.addServicoAdicional("Café da manhã", 20.00)
				.addServicoAdicional("Almoço", 35.00)
				.build();
		reservasController.cadastrarReserva(reserva);

		ArrayList<Reserva> listaReserva = reservasController.listarReservas();
		for (Reserva reserva1 : listaReserva) {
			System.out.println(reserva1.toString());
		}


		Quarto quartoOriginal = new Quarto(101, "Quarto triplo", 200.0, 3);

		try {
			Quarto quartoClonado = quartoOriginal.clone();

			// Modificando o quarto clonado
			quartoClonado.setTipoQuarto("Quarto duplo");
			quartoClonado.setPreco(180.0);
			quartoClonado.setQtdCama(2);

			System.out.println("Quarto original: " + quartoOriginal);
			System.out.println("Quarto clonado: " + quartoClonado);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
