public class Saldo {
    double saldo;

    Saldo (double saldo){
        this.saldo = saldo;
    }

    public double executarReajuste(double saldo){
        return saldo + (saldo * 0.01);
    }
}
