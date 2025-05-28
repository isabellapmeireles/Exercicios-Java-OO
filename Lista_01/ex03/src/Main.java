/*3) Faça um script em Java que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
Ex: 3 anos, 2 meses e 15 dias = 1170 dias. U lize os conceitos de Orientação a
Objetos vistos nas aulas, além de usar a biblioteca Scanner (Pesquise a sua sintaxe).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = sc.nextInt();

        System.out.print("Digite os meses: ");
        int meses = sc.nextInt();

        System.out.print("Digite os dias: ");
        int dias = sc.nextInt();

        Idade idade = new Idade(anos, meses, dias);

        idade.mostrarDias();

        sc.close();
    }
}