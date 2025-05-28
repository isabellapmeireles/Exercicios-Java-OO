//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

public class CalculoTotal {
    double valorPeca1, valorPeca2;
    int qntd1, qntd2, porcentagem;

    CalculoTotal (double valorPeca1, double valorPeca2, int qntd1, int qntd2, int porcentagem){
        this.valorPeca1 = valorPeca1;
        this.valorPeca2 = valorPeca2;
        this.qntd1 = qntd1;
        this.qntd2 = qntd2;
        this.porcentagem = porcentagem;
    }

    public void CalculoFinal (double valorPeca1, double valorPeca2, int qntd1, int qntd2, int porcentagem){
        double formula = ((valorPeca1*qntd1) + (valorPeca2*qntd2))*(((double) porcentagem /100) + 1);
        System.out.println("O valor total a ser pago por todas as peças é de: R$" + formula);
    }

}