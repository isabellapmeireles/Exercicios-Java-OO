// Agrupe em classes os objetos abaixo:
//avião
//elefante
//computador
//tigre
//calculadora
//motocicleta
//formiga - ok
//2) Instancie um objeto para cada uma das classes criadas no exercício 1.

public class Main {
    public static void main(String[] args) {

        Aviao aviao = new Aviao(10);
        System.out.println("Para a classe Avião, temos a intância quantidade de cadeiras: ");
        System.out.println("Todo avião tem, pelo menos, " + aviao.cadeiras + " cadeiras.");
        System.out.print("\n");

        Elefante elefante = new Elefante(4);
        System.out.println("Para a classe Elefante, temos a instância quantidade de pernas");
        System.out.println("Todo elefante tem "+ elefante.pernas + " pernas");
        System.out.print("\n");

        Computador computador = new Computador(1);
        System.out.println("Para toda classe Computador, temos a instância quantidade de teclado");
        System.out.println("Todo computador tem, pelo menos " + computador.teclado + " teclado");
        System.out.print("\n");

        Tigre tigre = new Tigre("animais");
        System.out.println("Para toda classe Tigre, temos a instância alimentos");
        System.out.println("Todo tigre se alimenta de carne de "+ tigre.alimento + " animais");
        System.out.print("\n");

        Calculadora calculadora = new Calculadora(10);
        System.out.println("Para toda classe Calculadora, temos a instância numeros");
        System.out.println("Toda calculadora tem, pelo menos, " + calculadora.numeros + " números");
        System.out.print("\n");

        Motocicleta motocicleta = new Motocicleta(2);
        System.out.println("Para toda classe Motocicleta, temos a instância pneus");
        System.out.println("Toda motocicleta tem, pelo menos, " + motocicleta.pneus + " pneus");
        System.out.print("\n");

        Formiga formiga = new Formiga(3);
        System.out.println("Para a classe Formiga, temos a instância quantidade de pernas: ");
        System.out.println("a Formiga possui" + formiga.qntdPernas + " pernas.");
        System.out.print("\n");

    }
}