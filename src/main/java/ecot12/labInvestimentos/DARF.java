package ecot12.labInvestimentos;

public class DARF implements Imposto {
    public double taxa(double v) {
        return v * 0.025;
    }
}
