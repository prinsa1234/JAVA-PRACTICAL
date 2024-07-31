import java.util.*;
class emp
{
	String fs;
	String ls;
	double sal;
	emp(){
		
	}
	emp(String f,String l,double salary)
	{
		fs=f;
		ls=l;
		sal=salary;
	}
	Scanner sc=new Scanner(System.in);
	void setfs()
	{  
		fs=sc.nextLine();
		}
	void setls()
	{   
		ls=sc.nextLine();
	}
	void setsal()
	{
		sal=sc.nextDouble();
		if(sal<0)
		{
		 sal=0.0;	
		}
		else{
			sal=sal+sal*(10/100);
		}
	}
	String getfs()
	{
		return fs;
	}
	String getls()
	{
		return ls;
	}
	Double getsal()
	{
		return sal;
	}
}
	public class emptest{
		public static void main(String args[]){
		emp e1=new emp();
		emp e2=new emp();
		e1.setfs();
		e1.setls();
		e1.setsal();
		System.out.println(e1.getfs());
		System.out.println(e1.getls());
		System.out.println(e1.getsal());
		
		System.out.println(" ");
		e2.setfs();
		e2.setls();
		e2.setsal();
		System.out.println(e2.getfs());
		System.out.println(e2.getls());
		System.out.println(e2.getsal());
		}
		}

