import java.lang.String;
import java.util.Scanner;
class prac9 {

    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(doubleChar(str1));      
        String str2=sc.nextLine();
        System.out.println(doubleChar(str2));
        String str3=sc.nextLine();
        System.out.println(doubleChar(str3));
        System.out.println("String1 is equals to string3? "+str1.equals(str3)); 
        
       
    }
}
