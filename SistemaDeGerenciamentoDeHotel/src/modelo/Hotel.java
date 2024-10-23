package modelo;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Adicionar um novo quarto ao hotel
    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    // Registrar uma nova reserva
    public void registrarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Obter a lista de quartos
    public List<Quarto> getQuartos() {
        return quartos;
    }

    // Obter a lista de reservas
    public List<Reserva> getReservas() {
        return reservas;
    }
}
