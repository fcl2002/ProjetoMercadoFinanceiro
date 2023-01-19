package ecot12.labInvestimentos;

public class Compra implements Operacao {
    public boolean visitar(Cambio c) {
        c.troca(c.getValor());
        return true;
    }
    public boolean visitar(CDB cdb) {
        if(cdb.getRentabilidade() >= 13.00 )
            cdb.investir();
        return true;
    }
    public boolean visitar(Debenture d) {
        if (d.getRisco() < 60)
            d.investirD();
        return true;
    }
    public boolean visitar(Acao a) {
        if (a.getPreco() < a.getPrecoCompra())
            a.comprar();
        return true;
    }
}
