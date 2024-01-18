/*
 * 1. Start
2. Read the number for which the multiplication table is to be printed (let's call it 'num').
3. Read the range up to which the multiplication table should be printed (let's call it 'range').
4. Initialize a variable 'i' to 1.
5. Repeat the following steps while 'i' is less than or equal to 'range':
    a. Calculate the product of 'num' and 'i'.
    b. Print the result in the format "num x i = product".
    c. Increment 'i' by 1.
6. End
 */

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for which the multiplication table is to be printed");
        int num = in.nextInt();
        System.out.print("Enter the range up to which the multiplication table should be printed");
        int range = in.nextInt();
        int i;
        for(i=1;i<=range;i++){
            int product = num * i;
            System.out.println(num + " x " + i + " = " +product);
        }
    }

}
