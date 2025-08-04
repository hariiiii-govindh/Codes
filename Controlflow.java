import java.util.*;
public class Controlflow
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month-num:");
        int month = scanner.nextInt();
        if(month<1 || month>12) System.out.println("Not valid");
        else if(month>1 && month<=5) System.out.println("It's Summer");
        else if(month>5 && month>=8) System.out.println("It's Winter");
        else System.out.println("It's Rainy Season");
        for(int i=0;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        int num = 10;
        while(num<1) 
        {
            System.out.print(num+" ");
            num--;
        }
        System.out.println("");
        int[] a = {10,20,30};
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}