package Single_Res;

class BankAccount{

    public static void printBalance(){
        System.out.println("Balance is printing");
    }

    public static void getLoan(){
        System.out.println("Loan has been successfully passed");
    }

    public static void depositMoney(){
        System.out.println("Money successfully deposited");
    }

    public static void withdraw(){
        System.out.println("Money successfully withdrawn");
    }
}


public class Before_SRP {
    public static void main(String[] args) {

        BankAccount bnk = new BankAccount();
        bnk.getLoan();
        bnk.depositMoney();
        bnk.withdraw();
        bnk.printBalance();

    }
}
