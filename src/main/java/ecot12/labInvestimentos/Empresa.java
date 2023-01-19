package ecot12.labInvestimentos;

public class Empresa extends Instituicao<Acao> {
    private String cnpj;

    public Acao emitirTitulo() {
        return new Acao();
    }

    //gets and sets
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
