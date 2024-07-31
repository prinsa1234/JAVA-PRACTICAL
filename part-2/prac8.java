import java.util.Scanner;
public class prac8 {
    public static void count(int arr[],int key)
    { int count=0;
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]==key)
         {
            count++;
         }
       }
       System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        count(arr,9);
    }
}
