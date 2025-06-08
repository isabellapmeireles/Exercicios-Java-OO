/*2- Escreva um construtor para a classe Lampada de forma que instâncias desta só
possam ser criadas se um estado inicial for passado para o construtor. Esse estado
pode ser o valor booleano que indica se a lâmpada está acesa (true) ou apagada
(false).*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int statusLampada = Integer.parseInt(JOptionPane.showInputDialog(null, "A lampada está acesa? [1] para acesa [2] para apagada"));

        if (statusLampada == 1){
            Lampada lampada = new Lampada(true);
            JOptionPane.showMessageDialog(null, "A Lampada está acesa");
        } else if (statusLampada == 2) {
            Lampada lampada = new Lampada(false);
            JOptionPane.showMessageDialog(null, "A Lampada está desligada");
        }
    }
}