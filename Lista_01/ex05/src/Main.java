/*5) Elabore um script em Java que lê dois números aleatórios (entre 0 e 1000) e
verifique qual dos números gerados maior e o valor dessa diferença. Utilize os
conceitos de Orientação a Objetos vistos nas aulas, além de usar a biblioteca Scanner
(Pesquise a sua sintaxe).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 0 a 1000: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro número inteiro entre 0 a 1000: ");
        int n2 = sc.nextInt();

        Leitura leitura = new Leitura(n1, n2);
        leitura.verificarMaior(n1, n2); //Chama a função que verifica qual maior número digitado

        DiferencaValores diferenca = new DiferencaValores(n1, n2);
        diferenca.diferencaValores(n1,n2);

        sc.close();
    }
}