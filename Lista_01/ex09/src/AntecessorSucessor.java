public class AntecessorSucessor {
    int n1;

    AntecessorSucessor(int n1){
        this.n1 = n1;
    }

    public void resultado(int n1){
        System.out.print("O numero digitado foi "+ n1 + " o seu sucessor é "+ (n1 + 1) + " e seu antecessor é "+ (n1 - 1));
    }
}
