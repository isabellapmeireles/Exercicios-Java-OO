/*3- Considere a classe Lampada que também representa o número de watts da
lâmpada. Escreva dois construtores para a classe: um que recebe como argumentos o
número de watts da lâmpada, e outro, sem argumentos, que considera que a lâmpada
tem 60 watts por default.*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int statusLampada = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos watts possui a lampada? [0] Se não souber "));

        if (statusLampada == 0){
            Lampada lampada = new Lampada(60);
            JOptionPane.showMessageDialog(null, "O watts da lampada é 60KWz");
        } else {
            Lampada lampada = new Lampada(statusLampada);
            JOptionPane.showMessageDialog(null, "O watts da lampada é " + statusLampada + "KWz");
        }

    }
}