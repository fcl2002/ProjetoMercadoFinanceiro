package ecot12.labInvestimentos;

public class ImpostoRenda implements Imposto {
    public double taxa(double v) {
        return v * 0.2;
    }
}
