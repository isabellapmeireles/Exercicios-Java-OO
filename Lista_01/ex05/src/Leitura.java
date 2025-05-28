public class Leitura {
    int n1, n2;

    Leitura(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void verificarMaior(int n1, int n2){
        if (n1 > n2){
            System.out.print("O maior numero digitado foi "+ n1);
        } else {
            System.out.print("O maior número digitado foi "+ n2);
        }
    }

}