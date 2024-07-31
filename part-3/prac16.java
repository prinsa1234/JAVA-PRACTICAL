import java.util.Scanner;

public class prac16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        int real1 = scanner.nextInt();
        System.out.print("Enter the imaginary part of the first complex number: ");
        int imag1 = scanner.nextInt();
        
        Complex c1 = new Complex(real1, imag1);

        System.out.print("Enter the real part of the second complex number: ");
        int real2 = scanner.nextInt();
        System.out.print("Enter the imaginary part of the second complex number: ");
        int imag2 = scanner.nextInt();
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex difference = c1.diff(c2);
        Complex product = c1.mul(c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        difference.display();
        System.out.print("Product: ");
        product.display();

        scanner.close();
    }
}

class Complex {
    int real;
    int imag;

    Complex() {
    }

    public Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    // Instance methods
    public Complex add(Complex b) {
        return new Complex(this.real + b.real, this.imag + b.imag);
    }

    public Complex diff(Complex b) {
        return new Complex(this.real - b.real, this.imag - b.imag);
    }

    public Complex mul(Complex b) {
        int x = this.real;
        int p = this.imag;
        int y = b.real;
        int q = b.imag;
        return new Complex(x * y - p * q, x * q + p * y);
    }

    // Display method
    public void display() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            // Handle negative imaginary part
            if (imag > 0) {
                System.out.println(real + "+" + imag + "i");
            } else {
                System.out.println(real + "" + imag + "i");  // Imaginary part is negative
            }
        }
    }
}
