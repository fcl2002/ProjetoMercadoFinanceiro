package ecot12.labInvestimentos;

import java.util.ArrayList;

public abstract class Mercado {
    private String pais;
    private double valor;
    private String titulo;
    ArrayList<Indicador> indicadores = new ArrayList<Indicador>();
    ArrayList<Instituicao> instituicoes = new ArrayList<Instituicao>();
    ArrayList<Imposto> impostos = new ArrayList<>();

    public abstract boolean aceitar(Operacao o);

    //gets and sets
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public ArrayList<Indicador> getIndicadores() {
        return indicadores;
    }
    public void setIndicadores(ArrayList<Indicador> indicadores) {
        this.indicadores = indicadores;
    }
    public ArrayList<Instituicao> getInstituicoes() {
        return instituicoes;
    }
    public void setInstituicoes(ArrayList<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public ArrayList<Imposto> getImpostos() {
        return impostos;
    }
    public void setImpostos(ArrayList<Imposto> impostos) {
        this.impostos = impostos;
    }
}
