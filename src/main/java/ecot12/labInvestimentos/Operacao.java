package ecot12.labInvestimentos;

import java.util.ArrayList;

public interface Operacao {

    public abstract boolean visitar(Cambio c);
    public abstract boolean visitar(CDB c);
    public abstract boolean visitar(Debenture d);
    public abstract boolean visitar(Acao a);
}
