public class DiferencaValores {
    int n1, n2;

    DiferencaValores(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void diferencaValores(int n1, int n2){
        if (n1 > n2){
            int subtracao1 = n1 - n2;
            System.out.println(" e a diferença entre " + n1 + " e "+ n2 + " é igual a " + subtracao1);
        } else {
            int subtracao2 = n2 - n1;
            System.out.println(" e a diferença entre "+ n1 + " e "+ n2 + " é igual a "+ subtracao2);
        }
    }
}
