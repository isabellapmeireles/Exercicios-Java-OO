/*8) Escreva um script em Java que leia o valor do salário mínimo e o valor do salário de
um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o
resultado. (1SM=R$788,00). Utilize os conceitos de Orientação a Objetos vistos nas
aulas, além de usar a biblioteca Scanner.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo em vigência: ");
        double salarioMinimo = sc.nextDouble();
        System.out.print("Digite o valor do seu salário: ");
        double salario = sc.nextDouble();

        SalarioMinimo salarioMin = new SalarioMinimo(salarioMinimo);
        Salario salarioAtual = new Salario(salario);
        Resultado resultadoFinal = new Resultado(salarioMinimo, salario);
        resultadoFinal.exibirResultado(salarioMinimo, salario);


    }
}