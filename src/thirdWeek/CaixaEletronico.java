package thirdWeek;

public class CaixaEletronico {
    public static void main(String[] args) {
        double balance = 2500.49;
        double requestedAmount = 1049.49;

        if(requestedAmount < balance){
            balance = balance - requestedAmount;

        System.out.println("O seu saldo agora é de " + balance );
        }
    }
}
