import java.util.Scanner;
class rect{
	int l;
	int b;
	rect(){}
	rect(int la,int ba){
		l=la;
		b=ba;
	}
	int area()
	{
		return l*b;
	}
}
public class ractangle{
	public static void main(String args[])
	{  Scanner sc=new Scanner(System.in);
	System.out.println("enter a length:");
	int len=sc.nextInt();
	System.out.println("enter a bredth:");
	int bre=sc.nextInt();
	
		rect r1=new rect(len,bre);
		System.out.println("area is :");
		System.out.println(r1.area());
		//rect r2=new rect();
		//System.out.println(r2.area());
	


}
}
