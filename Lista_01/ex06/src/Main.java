/*6) Faça um script em Java que informe um saldo e imprime o saldo com reajuste de 1%.
Utilize os conceitos de Orientação a Objetos vistos nas aulas, além de usar a biblioteca
Scanner para entrada do script (Pesquise a sua sintaxe).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        Saldo valor = new Saldo (saldo);
        double novoSaldo = valor.executarReajuste(saldo);
        System.out.println("O saldo de "+ saldo + " com reajuste de 1% fica R$"+ novoSaldo);

        sc.close();
    }
}