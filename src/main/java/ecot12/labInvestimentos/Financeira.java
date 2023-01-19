package ecot12.labInvestimentos;

public class Financeira extends Instituicao<Debenture> {

    public Debenture emitirTitulo() {
        return new Debenture();
    }
}
