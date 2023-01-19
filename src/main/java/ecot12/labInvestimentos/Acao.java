package ecot12.labInvestimentos;

public class Acao extends Mercado {
    private String ticket;
    private double precoCompra;
    private double preco;

    protected Acao() {}

    public boolean aceitar(Operacao o) {
        return o.visitar(this);
    }

    public void comprar() {
        System.out.println("\nComprar acao..");
    }
    public void vender() {
        System.out.println("\nVender acao..");
    }

    //gets and sets
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public double getPrecoCompra() {
        return precoCompra;
    }
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
