package modelo;

import java.time.LocalDate;

public class Reserva {
    private String nomeHospede;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private int numeroQuartos;
    private String tipoQuarto;

    public Reserva(String nomeHospede, LocalDate dataCheckIn, LocalDate dataCheckOut, int numeroQuartos, String tipoQuarto) {
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.numeroQuartos = numeroQuartos;
        this.tipoQuarto = tipoQuarto;
    }

    // Obter o nome do hóspede
    public String getNomeHospede() {
        return nomeHospede;
    }

    // Obter a data de check-in
    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    // Obter a data de check-out
    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    // Obter o número de quartos reservados
    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    // Obter o tipo de quarto reservado
    public String getTipoQuarto() {
        return tipoQuarto;
    }
}