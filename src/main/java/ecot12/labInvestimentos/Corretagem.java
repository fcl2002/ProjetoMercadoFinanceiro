package ecot12.labInvestimentos;

public class Corretagem implements Imposto {
    public double taxa(double v) {
        return v*0.05;
    }
}
