public class Idade {
    int anos, meses, dias;

    Idade (int anos, int meses, int dias){
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public void mostrarDias(){
        System.out.println("Você tem "+ anos + " anos, " + meses + " meses e "+ dias + " dias." );
        int diasTotais = (anos * 365) + (meses * 30) + dias;
        System.out.print("Dias totais: "+ diasTotais );
    }

}