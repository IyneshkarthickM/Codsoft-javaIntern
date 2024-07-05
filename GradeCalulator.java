import java.util.Scanner;

public class GradeCalulator {
     static int gettotalmark(int n,int[] arr)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    static double calavg(int total,int n)
    {
        double avg = (double)total/n;
        return avg;
    }
    static String  gradecal(double average)
    {
        if(average>=95.0)
        {
            return "O";
        }
        else if(average>=85.0)
        {
            return "A";
        }
        else if(average>=75.0)
        {
            return "B";
        }
        else if(average>=65.0)
        {
            return "C";
        }
        else if(average>=50.0)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number of Subject:");
        int n=scan.nextInt(); //number of subject
        System.out.println("Marks taken in each subject:");
        int[] sub = new int[n];
        for(int i=0;i<n;i++)
        {
            sub[i]=scan.nextInt();
            System.out.println("Enter the Mark of "+(i+1)+" Subject: "+sub[i]+"/100");
        }
        int total=gettotalmark(n,sub);
        double average=calavg(total,n);
        String grade=gradecal(average);
        System.out.println("Total Marks get out of "+(n*100)+" :"+total);
        System.out.println("Average Percentage: "+average+"%");
        System.out.println("Grade taken:"+grade);
        scan.close();
    }
}
