package ecot12.labInvestimentos;

public class CDB extends Mercado {
    private String titulo;
    private double rentabilidade; //anual

    protected CDB() {}

    public boolean aceitar(Operacao o) {
        return o.visitar(this);
    }

    public void investir() {
        System.out.println("\nInvestindo em CDB..");
    }
    public void retirar() {
        System.out.println("\nRetirando capital investido em CBD..");
    }

    //gets and sets
    public double getRentabilidade() {
        return rentabilidade;
    }
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
}
