import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i; 
            }
        }
        return sum;
    }
}

public class prac22 {
    public static void main(String[] args) {
        MyCalculator m1 = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int result = m1.divisor_sum(num);
        System.out.println("The sum of divisors of " + num + " is: " + result);
        
        sc.close(); 
    }
}
