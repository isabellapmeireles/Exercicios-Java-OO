/*9) Desenvolva um script em Java que leia um n mero inteiro e imprima o seu
antecessor e seu sucessor. Utilize os conceitos de Orientação a Objetos vistos nas aulas,
além de usar a biblioteca Scanner para entrada e saída do script.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = sc.nextInt();

        AntecessorSucessor antSuc = new AntecessorSucessor(n1);
        antSuc.resultado(n1);
    }
}