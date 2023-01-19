package ecot12.labInvestimentos;

public class Banco extends Instituicao<CDB> {

    public CDB emitirTitulo() {
        return new CDB();
    }
}
