package ecot12.labInvestimentos;

public class Debenture extends Mercado {
    private String titulo;
    private double rentabilidade; //anual
    private int risco; //vai de 0 até 100, quanto mais próximo de 0, menor o risco do investimento

    protected Debenture() {}

    public boolean aceitar(Operacao o) {
        return o.visitar(this);
    }

    public void investirD() {
        System.out.println("\nInvestindo em debenture...");
    }
    public void retirarD() {
        System.out.println("\nRetirando capital investido em debenture...");
    }

    //gets and sets
    public double getRentabilidade() {
        return rentabilidade;
    }
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
    public int getRisco() {
        return risco;
    }
    public void setRisco(int risco) {
        this.risco = risco;
    }
}
