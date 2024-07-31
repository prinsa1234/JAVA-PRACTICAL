import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        float exp[]=new float[5];
        float sum=0;
        for(int i=0;i<exp.length;i++)
        {    System.out.println("enter a expense:");
            exp[i]=sc.nextFloat();
             sum+=exp[i];
        }
        System.out.println(sum);
    }
}
