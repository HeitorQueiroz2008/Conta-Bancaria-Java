import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var account1 = new Account();

        System.out.println("##########");

        System.out.println("Digite o nome da conta: ");
        account1.setName(scanner.next());

        System.out.println("Digite o saldo inicial da conta: ");
        account1.setBalance(scanner.nextDouble());

        if (account1.getBalance() <= 500){
            account1.setSpecialCheck(50);
        } else {
            account1.setSpecialCheck(account1.getBalance() * 0.5);;
        }

        System.out.printf("Nome: %s | Saldo: R$ %s | Cheque Especial: R$ %s\n", account1.getName(), account1.getBalance(), account1.getSpecialCheck());

    }
}
