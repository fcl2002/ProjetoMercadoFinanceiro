package ecot12.labInvestimentos;

public class Corretora {
    private String nome;
    private String pais;
    private CarteiraInvestimento carteira;

    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String conta) {
        this.pais = pais;
    }
    public CarteiraInvestimento getCarteira() {
        return carteira;
    }
    public void setCarteira(CarteiraInvestimento carteira) {
        this.carteira = carteira;
    }
}
