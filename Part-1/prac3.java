import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a distance in meter:");
        float meter=sc.nextFloat();

        System.out.println("enter a hours:");
        float h=sc.nextFloat();
        System.out.println("enter a minute:");
        float m=sc.nextFloat();
        System.out.println("enter a second:");
        float s=sc.nextFloat();
        
		float km=meter/1000;
		float mile=meter/1609;
		float time_h=h+(m/60)+(s/3600);
		float time_s=(h*3600)+(m*60)+s;
		float m_dis=meter/time_s;
   
		System.out.println("distance in meter per second"+m_dis);
				System.out.println("distance in kilometer per hour"+(km/time_h));
						System.out.println("distance in miles per hour"+mile/time_h);


		float dis_mile=meter/1609;
    }
}
