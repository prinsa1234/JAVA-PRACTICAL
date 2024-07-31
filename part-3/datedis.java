import java.util.*;
class date
{
	int d;
	int m;int y;
	date(){}
	
	date(int date,int month,int year)
	{
		d=date;
		m=month;
		y=year;
	}
	Scanner sc=new Scanner (System.in);
	void setd(){
		System.out.println("enter a day");
		d=sc.nextInt();
		
	}
	void setm(){
		System.out.println("enter a month");
		m=sc.nextInt();
		
	}
	void sety(){
		System.out.println("enter a year");
		y=sc.nextInt();
		
	}
	void display(){
		System.out.println("date is: ");
		System.out.print(d+"/"+m+"/"+y);
		
	}
}
public class datedis{
	public static void main(String args[])
	{
		date d1=new date();
		d1.setd();
		d1.setm();
		d1.sety();
		d1.display();
	}
}
