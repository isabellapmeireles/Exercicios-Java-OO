public class Resultado {
    double salarioMinimo, salarioAtual;

    Resultado(double salarioMinimo, double salarioAtual){
        this.salarioMinimo = salarioMinimo;
        this.salarioAtual = salarioAtual;
    }

    public void exibirResultado(double salarioMinimo, double salarioAtual){
        double resultado;
        resultado = (int) salarioAtual/salarioMinimo;
        System.out.printf("O salario de R$ %.2f é equivalente a %.2f salarios minimos", salarioAtual, resultado);
    }



}
