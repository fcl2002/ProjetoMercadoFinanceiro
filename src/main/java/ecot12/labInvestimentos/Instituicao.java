package ecot12.labInvestimentos;

public abstract class Instituicao<T extends Mercado> {
    private String nome;
    private boolean ehEstatal;

    public abstract T emitirTitulo();

    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isEhEstatal() {
        return ehEstatal;
    }
    public void setEhEstatal(boolean ehEstatal) {
        this.ehEstatal = ehEstatal;
    }
}
