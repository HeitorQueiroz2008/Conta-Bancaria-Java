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



        //Área de seleção
        while (true){
            //Redefine o limite ao final de cada operação
            account1.setLimit(account1.getBalance() + account1.getSpecialCheck());

            System.out.println("\nEscolha uma opção para continuar \n[1] Consultar saldo \n[2] Valor cheque especial\n[3] Depositar dinheiro \n[4] Sacar dinheiro \n[5] Pagar um boleto \n[6] Verificar uso cheque especial \n[0] Sair \n");
            var Answer = scanner.nextInt();

            if (Answer == 1) {
                System.out.printf("Saldo atual: R$ %s\n", account1.getBalance());

            } else if (Answer == 2) {
                System.out.printf("Valor atual do cheque especial: R$ %s\n", account1.getSpecialCheck());

            } else if (Answer == 3) {
                System.out.println("Qual o valor depositado?");
                var deposite = scanner.nextDouble();
                if (account1.getDebt() > 0 && deposite > account1.getDebt()){
                    account1.setBalance(account1.getBalance() + deposite - account1.getDebt());
                    System.out.printf("Valor da dívida foi descontado no depósito!\nValor da dívida: %s \nSaldo atual: R$ %s\n",account1.getDebt(), account1.getBalance());
                    account1.setDebt(0);

                } else {
                    account1.setBalance(account1.getBalance() + deposite);
                    System.out.printf("Valor depositado!!! Saldo atual: R$ %s\n", account1.getBalance());
                }

            } else if (Answer == 4) {
                System.out.println("Digite o valor que deseja sacar: ");
                var withdraw = scanner.nextDouble();

                if (account1.getLimit() < withdraw){
                    System.out.println("Saldo e cheque especial insuficiente!");

                } else if (account1.getBalance() < withdraw){
                    account1.setDebt(Math.abs(account1.getBalance() - withdraw) * 1.2);
                    account1.setSpecialCheck(account1.getSpecialCheck() + (account1.getBalance() - withdraw));
                    account1.setBalance(0);
                    System.out.printf("Seu cheque especial foi utilizado!\nSaldo atual: R$ %s \nValor restante do cheque especial: R$ %s \nValor da dívida: R$ %s\n", account1.getBalance(),account1.getSpecialCheck(),account1.getDebt());

                } else {
                    account1.setBalance(account1.getBalance() - withdraw);
                    System.out.printf("Saque efetuado com sucesso! \nSaldo atual: R$ %s\n", account1.getBalance());
                }

            } else if (Answer == 5) {
                System.out.println("Digite o valor do boleto: ");
                var boleto = scanner.nextDouble();

                if (account1.getLimit() < boleto){
                    System.out.println("Saldo e cheque especial insuficiente!");

                } else if (account1.getBalance() < boleto){
                    account1.setDebt(Math.abs(account1.getBalance() - boleto) * 1.2);
                    account1.setSpecialCheck(account1.getSpecialCheck() + (account1.getBalance() - boleto));
                    account1.setBalance(0);
                    System.out.printf("Seu cheque especial foi utilizado!\nSaldo atual: R$ %s \nValor restante do cheque especial: R$ %s \nValor da dívida: R$ %s\n", account1.getBalance(),account1.getSpecialCheck(),account1.getDebt());

                } else {
                    account1.setBalance(account1.getBalance() - boleto);
                    System.out.printf("Boleto pago com sucesso! Saldo atual: R$ %s\n", account1.getBalance());
                }

            } else if (Answer == 6) {
                if (account1.getDebt() > 0){
                    System.out.printf("Você possui dívidas com o cheque especial!\nValor da dívida: R$ %s\n", account1.getDebt());
                } else {
                    System.out.println("Você não possui dívidas com o cheque especial no momento!");
                }

            } else if (Answer == 0) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida!!!");
            }


        }

        //Linha de testes
        //System.out.printf("Nome: %s | Saldo: R$ %s | Cheque Especial: R$ %s | limite total: R$ %s\n", account1.getName(), account1.getBalance(), account1.getSpecialCheck(), account1.getLimit());

    }
}
