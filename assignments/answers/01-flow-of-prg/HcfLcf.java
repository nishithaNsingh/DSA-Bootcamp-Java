import java.util.*;

public class HcfLcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers for which you want to find LCM and HCF: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int x = Math.max(a, b);
        int y = Math.min(a, b);
        int remainder = 1; // Initialize remainder to a non-zero value

        // Euclidean algorithm to find HCF (GCD)
        while (y != 0) {
            remainder = x % y;
            x = y;
            y = remainder;
        }

        int hcf = x;
        int lcm = (a * b) / hcf;

        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}
