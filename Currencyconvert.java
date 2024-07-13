import java.util.*;

public class Currencyconvert {
    static void rupee_to_other_convert(double amount,int target)
    {
            if(target==1)
            {
                System.out.println("Rupee:"+amount); //give target choice is rupee
            }
            else if(target==2)
            {
            System.out.println("Rupee to dollar "+(amount*0.012));  //1rupee- 0.012 dollar 
            }
            else if(target==3)
            {
                System.out.println("Rupee to Euro "+(amount*0.011));   //1 rupee- 0.011 euro
            }
    }
    static void dollar_to_other_convert(double amount,int target)
    {
        if(target==1)
        {
            System.out.println("Dollar to rupee "+(amount*83.51)); //1 Dollar-83.51 rupee
        }
        else if(target==2)
        {
            System.out.println("Dolllar "+amount);
        }
        else if(target==3)
        {
            System.out.println("Dollar to euro "+(amount*0.92));   // 1 Dollar-0.92 euro
        }
    }
    static void euro_to_other_convert(double amount,int target)
    {
        if(target==1)
        {
            System.out.println("Euro to rupee: "+(amount*90.39));   //1 Euro - 90.39 rupees
        }
        else if(target==2)
        {
            System.out.println("Euro to dollar: "+(amount*1.08));   //1Euro -1.08 dollar
        }
        else if(target==3)
        {
            System.out.println("Euro"+amount);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Select a currency you have in hand:");
        System.out.println("1.Rupees");
        System.out.println("2.Dollar");
        System.out.println("3.Euro");
        System.out.print("choice:");
        int choice=scan.nextInt();
        System.out.println("Select a currency you want to change:");
        System.out.println("1.Rupees");
        System.out.println("2.Dollar");
        System.out.println("3.Euro");
        System.out.print("Target:");
        int target=scan.nextInt();
        System.out.print("The amount you have at the hand:");
        double amount=scan.nextDouble();
        switch(choice)
        {
            case 1:
                rupee_to_other_convert(amount,target);
                break;
            case 2:
                dollar_to_other_convert(amount,target);
                break;
            case 3:
                euro_to_other_convert(amount,target);
                break;    
            default:
                System.out.print("Invalid choice");
                break;    
        }
        scan.close();
    }
}
