import java.util.Scanner;
public class sumavg{
    public static void main(String[] args)
    {
        int i,sum=0;
        for(i=0;i<5;i++){
            System.out.println("Enter Number  "+i+": \t");
            Scanner S = new Scanner(System.in);
            float num= S.nextInt();
            sum+=num;
        }
        System.out.println("Sum of 5 Numbers : "+sum);
        float avg = sum/5;
        System.out.println("Average of 5 Numbers : "+avg);
    }
}