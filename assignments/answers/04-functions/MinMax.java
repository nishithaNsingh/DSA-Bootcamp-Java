import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        findMinMax();
    }

    static void findMinMax() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
