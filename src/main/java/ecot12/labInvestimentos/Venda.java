package ecot12.labInvestimentos;

public class Venda implements Operacao {
    public boolean visitar(Cambio c) {
        c.troca(c.getValor());
        return true;
    }
    public boolean visitar(CDB c) {
        if(c.getRentabilidade() < 13.00 ) {
            c.retirar();
        }
        return true;
    }
    public boolean visitar(Debenture d) {
        if (d.getRisco() >= 60)
            d.retirarD();
        return true;
    }
    public boolean visitar(Acao a) {
        if (a.getPreco() > a.getPrecoCompra())
            a.vender();
        return true;
    }
}
