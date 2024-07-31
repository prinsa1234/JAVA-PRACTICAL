import java.util.Scanner;
import java.lang.String;
import java.util.*;

public class prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String s = str;
        System.out.println("String length is: " + s.length());
        System.out.println("String in upper case is: " + s.toUpperCase());
        System.out.println("String in lower case is: " + s.toLowerCase());
        
        System.out.println("sorted string is: "+sortstring(s));
        System.out.println("Reversed string is: " + reverseString(s));
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
    public static String sortstring(String input)
    {
       char[] charArray=input.toCharArray();
       Arrays.sort(charArray);
       return new String(charArray);
    }
}
