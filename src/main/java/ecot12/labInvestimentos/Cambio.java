package ecot12.labInvestimentos;

public class Cambio extends Mercado {
    private String moedaOrigem;
    private String moedaTroca;
    private double cotacao;

    public boolean aceitar(Operacao o) {
        return o.visitar(this);
    }

    public double troca(double v) {
        return v / cotacao;
    }

    //gets and sets
    public String getMoedaOrigem() {
        return moedaOrigem;
    }
    public void setMoedaOrigem(String moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }
    public String getMoedaTroca() {
        return moedaTroca;
    }
    public void setMoedaTroca(String moedaTroca) {
        this.moedaTroca = moedaTroca;
    }
    public double getCotacao() {
        return cotacao;
    }
    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }
}
