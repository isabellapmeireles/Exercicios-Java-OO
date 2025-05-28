/*7) Escreva um script em Java que lê:
a) a porcentagem do IPI a ser acrescido no valor das peças;
b) o código da peça 1, valor unitário da peça 1, quantidade de peças 1;
c) o código da peça 2, valor unitário da peça 2, quantidade de peças 2;
O script deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
Utilize os conceitos de Orientação a Objetos vistos nas aulas, além de usar a biblioteca
Scanner para entrada e saída do script.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== Sobre a peça 1 ==");
        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitPeca1 = sc.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int qntdPeca1 = sc.nextInt();
        System.out.print("\n");

        System.out.println("== Sobre a peça 2 ==");
        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitPeca2 = sc.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int qntdPeca2 = sc.nextInt();
        System.out.print("\n");

        System.out.print("Digite a porcentagem IPI: ");
        int porcent = sc.nextInt();

        Produto1 peca1 = new Produto1(codigoPeca1, valorUnitPeca1, qntdPeca1);//Criação do objeto Produto 1
        Produto2 peca2 = new Produto2(codigoPeca2, valorUnitPeca2, qntdPeca2);//Criação do objeto Produto 2
        Porcentagem porcentagem = new Porcentagem(porcent);
        CalculoTotal calculoTotal = new CalculoTotal(valorUnitPeca1, valorUnitPeca2, qntdPeca1, qntdPeca2, porcent);

        calculoTotal.CalculoFinal(valorUnitPeca1, valorUnitPeca2, qntdPeca1, qntdPeca2, porcent);

        sc.close();
    }
}