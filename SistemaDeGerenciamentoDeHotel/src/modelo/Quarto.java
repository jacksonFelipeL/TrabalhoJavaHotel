package modelo;

public class Quarto {
    private int numero;
    private String tipo;
    private double precoDiario;
    private boolean disponivel;

    public Quarto(int numero, String tipo, double precoDiario) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiario = precoDiario;
        this.disponivel = true; // O quarto começa como disponível
    }

    // Obter o número do quarto
    public int getNumero() {
        return numero;
    }

    // Obter o tipo de quarto
    public String getTipo() {
        return tipo;
    }

    // Obter o preço diário do quarto
    public double getPrecoDiario() {
        return precoDiario;
    }

    // Verificar se o quarto está disponível
    public boolean isDisponivel() {
        return disponivel;
    }

    // Definir a disponibilidade do quarto
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
