import java.lang.String;
import java.util.Scanner;
public class String7{
    public static void s(String str)
    {
       String sub=str.substring(0,3);
       Scanner sc1=new Scanner(System.in);
       int n=sc1.nextInt();
       for(int i=0;i<n;i++)
       {
         System.out.print(sub);
       }
       sc1.close();
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string here: ");
        String str=sc.nextLine();
        s(str);
        sc.close();
    }
}
