package ecot12.labInvestimentos;

public class Investidor {
    private String nome;
    private String cpf;
    private String perfil;
    private Corretora conta;

    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Corretora getConta() {
        return conta;
    }
    public void setConta(Corretora conta) {
        this.conta = conta;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
