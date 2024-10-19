import java.util.Scanner;
class rectangle{
    int length;
    int breadth;
    rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int  area(){
        int a_ans=length*breadth;
     return a_ans;
    }
   int perimeter()
    {
        int p_ans=2*(length+breadth);
        return p_ans;
    }
}
 class square extends rectangle{
square(int s)
{
    super(s, s);

}
}
public class prac19 {
    public static void main(String[] args){
    
      Scanner sc=new Scanner(System.in);
      rectangle[] arr= new rectangle[2];
      System.out.println("enter a length of rectangle:");
      int l=sc.nextInt();
      System.out.println("enter a breadth of rectangle:");
      int b=sc.nextInt();
      System.out.println("enter a side of square:");
      int si=sc.nextInt();
      arr[0]=new rectangle(l, b);
      arr[1]=new square(si);
         System.out.println("-----rectangle-----");
      System.out.println("area is:");
      System.out.println(arr[0].area());
         System.out.println("perimeter is:");
      System.out.println(arr[0].perimeter());
       System.out.println("-----square-----");
      System.out.println("area is:");
      System.out.println(arr[1].area());
       System.out.println("perimeter is:");
      System.out.println(arr[1].perimeter());
     sc.close();
    }
}
