import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando a conta bancária
        var account1 = new Account();
        System.out.println("Digite o nome da conta: ");
        account1.setName(scanner.next());

        System.out.println("Digite o saldo inicial da conta: ");
        account1.setBalance(scanner.nextDouble());

        if (account1.getBalance() <= 500){
            account1.setSpecialCheck(50);
        } else {
            account1.setSpecialCheck(account1.getBalance() * 0.5);;
        }

        account1.setLimit(account1.getBalance() + account1.getSpecialCheck());

        //Área de seleção
        while (true){
            System.out.println("\nEscolha uma opção para continuar \n[1] Consultar saldo \n[2] Valor cheque especial\n[3] Depositar dinheiro \n[4] Sacar dinheiro \n[5] Pagar um boleto \n[6] Verificar uso cheque especial \n[0] Sair \n");
            var Answer = scanner.nextInt();

            if (Answer == 1) {
                System.out.printf("Saldo atual: R$ %s\n", account1.getBalance());

            } else if (Answer == 2) {
                System.out.printf("Valor atual do cheque especial: R$ %s\n", account1.getSpecialCheck());

            } else if (Answer == 3) {
                System.out.println("Qual o valor depositado?");
                var deposite = scanner.nextDouble();
                account1.setBalance(account1.getBalance() + deposite);
                System.out.printf("Valor depositado!!! Saldo atual: R$ %s\n", account1.getBalance());


            }



        }

        //Linha de testes
        //System.out.printf("Nome: %s | Saldo: R$ %s | Cheque Especial: R$ %s | limite total: R$ %s\n", account1.getName(), account1.getBalance(), account1.getSpecialCheck(), account1.getLimit());

    }
}
