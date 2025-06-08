import javax.swing.JOptionPane;

public class VerificaData {
    int dia, mes, ano;

    VerificaData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void verificacaoData(int dia, int mes, int ano){
        if (dia <= 0 || dia > 31){
            JOptionPane.showMessageDialog(null, "Não existe este dia. Tente Novamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else if (dia == 31) {
            if ((mes == 4) || (mes == 04) || (mes == 5) || (mes == 05) || (mes == 6) || (mes == 06) || (mes == 9) || (mes == 11)) {
                JOptionPane.showMessageDialog(null, "Não existe 31 dias no mês digitado. Tente Novamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (mes <= 0 || mes > 12){
            JOptionPane.showMessageDialog(null, "Não existe este mês. Tente Novamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "A data " + dia + "/" + mes + "/" + ano + " é válida!", "Parabens!", JOptionPane.PLAIN_MESSAGE);
        }

    }


}