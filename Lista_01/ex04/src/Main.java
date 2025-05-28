/*4) Faça um script em Java que imprima a média aritméca dos números 8,9 e 7.
A média dos números 4, 5 e 6. A soma das duas médias. A média das médias. Utilize os
conceitos de Orientação a Objetos vistos nas aulas, além de usar a biblioteca Scanner
para entrada e saída do script (Pesquise a sua sintaxe).*/

public class Main {
    public static void main(String[] args) {
        //Média dos números 8, 9 e 7:
        MediaA mediaA = new MediaA(8, 9, 7);
        double media1 = mediaA.exibirMedia1(8, 9, 7);
        System.out.println("A média entre "+ mediaA.n1 + ", "+ mediaA.n2 + " e "+ mediaA.n3 + " é igual a "+ media1);

        //Média dos números 4, 5 e 6:
        MediaB mediaB = new MediaB(4,5,6);
        double media2 = mediaB.exibirMedia2(4,5,6);
        System.out.println("A média entre "+ mediaB.n1 + ", "+ mediaB.n2 + " e "+ mediaB.n3 + "é igual a "+ media2);

        //Soma das Medias das duas médias calculadas acima:
        SomaMedias somaDasMedias = new SomaMedias(media1, media2);
        double somaMedia1Media2 = somaDasMedias.exibirSomaDasMedias(media1, media2);
        System.out.println("A soma entre "+ media1 + " e "+ media2 + " é igual a "+ somaMedia1Media2);

        //Media das duas médias calculadas acima:
        MediasTotais mediastotais = new MediasTotais(media1, media2);
        double mediaDasMedias = mediastotais.exibirMediaDasMedias(media1, media2);
        System.out.println("A média entre "+ media1 + " e "+ media2+ " é igual a "+ mediaDasMedias);


    }
}