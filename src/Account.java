

public class Account {

    //variáveis da classe


    private String name;

    private double balance;

    private double specialCheck;


    //setters e getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setSpecialCheck(double specialCheck) {
        this.specialCheck = specialCheck;
    }

    public double getSpecialCheck() {
        return specialCheck;
    }

    //builder
    public Account(){



    }



}
