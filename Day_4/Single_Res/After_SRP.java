package Single_Res;

class printBalance{
    public static void printBalance(){
        System.out.println("printing the balance");
    }
}

class getLoan{
    public static void get_Loan(){
        System.out.println("getting loan from bank");
    }
}

class withdraw_money{
    public static void moneyWithdraw(){
        System.out.println("Money withdrawal");
    }
}

class deposit_Money{
    public static void deposit_money(){
        System.out.println("Money deposited");
    }
}



public class After_SRP {
    public static void main(String[] args) {
        printBalance pr = new printBalance();
        pr.printBalance();

        getLoan gt = new getLoan();
        gt.get_Loan();

        withdraw_money wd = new withdraw_money();
        wd.moneyWithdraw();

        deposit_Money dp = new deposit_Money();
        dp.deposit_money();
    }

}
