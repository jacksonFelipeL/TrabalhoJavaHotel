package principal;

import modelo.*;

import java.time.LocalDate;
import java.util.Scanner;

public class SistemaDeGerenciamentoDeHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Sistema de Gerenciamento de Hotel ===");
            System.out.println("1. Cadastrar Quarto");
            System.out.println("2. Cadastrar Reserva");
            System.out.println("3. Listar Quartos");
            System.out.println("4. Listar Reservas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    // Cadastro de quarto
                    System.out.print("Número do Quarto: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    System.out.print("Tipo do Quarto (solteiro, casal, suite): ");
                    String tipo = scanner.nextLine();

                    System.out.print("Preço Diário: ");
                    double preco = scanner.nextDouble();

                    Quarto quarto = new Quarto(numero, tipo, preco);
                    hotel.adicionarQuarto(quarto);
                    System.out.println("Quarto cadastrado com sucesso!\n");
                    break;

                case 2:
                    // Cadastro de reserva
                    System.out.print("Nome do Hóspede: ");
                    String nomeHospede = scanner.nextLine();

                    System.out.print("Data de Check-in (YYYY-MM-DD): ");
                    LocalDate checkIn = LocalDate.parse(scanner.nextLine());

                    System.out.print("Data de Check-out (YYYY-MM-DD): ");
                    LocalDate checkOut = LocalDate.parse(scanner.nextLine());

                    System.out.print("Número de Quartos Reservados: ");
                    int numeroQuartos = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    System.out.print("Tipo de Quarto Reservado: ");
                    String tipoQuarto = scanner.nextLine();

                    Reserva reserva = new Reserva(nomeHospede, checkIn, checkOut, numeroQuartos, tipoQuarto);
                    hotel.registrarReserva(reserva);
                    System.out.println("Reserva cadastrada com sucesso!\n");
                    break;

                case 3:
                    // Listar quartos
                    System.out.println("=== Lista de Quartos ===");
                    for (Quarto q : hotel.getQuartos()) {
                        System.out.println("Número: " + q.getNumero() + ", Tipo: " + q.getTipo() + ", Preço: " + q.getPrecoDiario() + ", Disponível: " + (q.isDisponivel() ? "Sim" : "Não"));
                    }
                    break;

                case 4:
                    // Listar reservas
                    System.out.println("=== Lista de Reservas ===");
                    for (Reserva r : hotel.getReservas()) {
                        System.out.println("Nome: " + r.getNomeHospede() + ", Check-in: " + r.getDataCheckIn() + ", Check-out: " + r.getDataCheckOut() + ", Número de Quartos: " + r.getNumeroQuartos() + ", Tipo: " + r.getTipoQuarto());
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
