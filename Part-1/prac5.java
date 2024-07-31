import java .util.*;
public class prac5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a case for 1=motor 2=fan 3=tubelight 4=wire 5=more");
        int select=sc.nextInt();
		double price=100;
        switch (select) {
            case 1:
            price=price+((8.0/100)*price);
               System.out.println(price); 
                break;
			case 2:
            System.out.println( price+((12.0/100)*price));
        break;
		case 3:
        System.out.println(price+((5.0/100)*price));
		break;
		case 4:
        System.out.println(price+((7.5/100)*price));
		break;
		case 5:
        System.out.println(price+((3.0/100)*price));
		break;
            
        }
    }
}
