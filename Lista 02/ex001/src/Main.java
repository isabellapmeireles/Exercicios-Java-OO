//1- Escreva um construtor para a classe Data que receba os valores correspondentes ao
//dia, mês e ano, e inicialize os campos da classe, verificando antes se a data é válida.


import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia. " ));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês. "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano. "));

        Data data = new Data (dia, mes, ano);

        if ((dia == 29) & (mes == 2)) {
            IdentificaAnoBissexto anoBi = new IdentificaAnoBissexto(dia, mes, ano);
            anoBi.identificaDataBissexto(dia, mes, ano);
        }

        VerificaData verificaData = new VerificaData(dia, mes, ano);
        verificaData.verificacaoData(dia, mes, ano);
    }
}