import java.util.*;

public class AtmInterface {
    public double balance=5000.00;

    public void amount_withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Withdrawl has been Successfully done.");
        }
    }
    public void amount_deposit(double deposit_amt)
    {
        if(deposit_amt>0)
        {
            balance+=deposit_amt;
            System.out.println("Deposit has been Successfully done.");
        }    
    }
    public void checkbalance()
    {
        System.out.println("Bank Balance:" +balance);
    }
    public static void main(String[] args) {
        Scanner iyne=new Scanner(System.in);
        System.out.println("Welcome to ATM Interface");
        System.out.println("1.Withdraw\n2.Deposit\n3.Checkbalance");
        System.out.print("Choice: ");
        int choice=iyne.nextInt();
        AtmInterface atm = new AtmInterface();
        switch(choice)
        {
            case 1:
                System.out.print("Enter a amount you want to withdraw: ");
                double withdraw=iyne.nextDouble();
                atm.amount_withdraw(withdraw);
                break;
            case 2:
                System.out.print("Enter a amount you want to Deposit: ");
                double Deposit=iyne.nextDouble();
                atm.amount_deposit(Deposit);
                break;
            case 3:
                atm.checkbalance();
                break;
            default:
                System.out.println("Balance:"+atm.balance);
                System.out.println("Thank you come again:");
                break;
        }
        iyne.close();
    }
}
