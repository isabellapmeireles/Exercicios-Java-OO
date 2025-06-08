/*Classe criada para verificar se a data digitada pertence a um ano bissexto.
* A função identificaDataBissexto será chamada caso o dia digitado seja igual a 29
* e o mês seja o 2 (fevereiro) */


import javax.swing.JOptionPane;

public class IdentificaAnoBissexto {
    int diaBi, mesBi, anoBi;

    IdentificaAnoBissexto(int diaBi, int mesBi, int anoBi){
        this.diaBi = diaBi;
        this.mesBi = mesBi;
        this.anoBi = anoBi;
    }

    public void verificaAnoBissexto(int ano){
        if (!(ano %4 == 0) && ano % 100 == 0 || !(ano % 400 == 0)){
            JOptionPane.showMessageDialog(null, "O ano não é Bissexto, digite a data novamente", "",JOptionPane.ERROR_MESSAGE);
        }
    }
    // Função para caso o dia digitado seja igual a 29 e o mês seja fevereiro
    public void identificaDataBissexto(int diaBi, int mesBi, int anoBi){
        if (diaBi == 29 && (mesBi == 2 || mesBi == 02)){
            verificaAnoBissexto(anoBi);
        }
    }
}