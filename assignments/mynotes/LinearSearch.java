 // //This is a simple linear search algorithm that searches for an element in the array.
//     //It starts from the beginning of the array and checks each element one by one until it finds
//     //the desired element or reaches the end of the array.
import java.util.*;
public class LinearSearch{
    public static void main(String[] arg){
        // int[] nums = {2,45,67,89,10};
        // int target = 3;
        // int ans = searchIng(nums, target);
        // System.out.println(ans);
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        System.out.println("\nEnter Elements :");
        while (n-- > 0) {
            int x = in.nextInt();
            list.add(x);
            }
            System.out.print("Enter the value to be searched : ");
            int t = in.nextInt();
            int index=searching(list,t);
            if(index==-1)
            System.out.println("Element not found.");
            else
            System.out.println("Element Found at Index "+index+".");
            }
    public static int searching(ArrayList<Integer> arr,int key)
            {
                int n = arr.size();
                for (int i = 0; i < n; i++)
                if (arr.get(i).equals(key))
           //     if (arr.get[i]==t)
                return i;
                return -1;
                }
                

//search the array//return index if item found
    // static int searchIng(int[] arr, int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }
    //     for(int index=0;index<arr.length;index++){
    //         int element = arr[index]; 
    //         if(arr[index]==target) {
    //             return index;
    //     }

    // }
    // return -1;

    // }

}

//Searching an element
// import java.util.ArrayList;
// import java.util.Scanner;

// class Solution {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         ArrayList<Integer> list = new ArrayList<>();
//         int n = in.nextInt();

//         while (n-- > 0) {
//             int x = in.nextInt();
//             list.add(x);
//         }

//         int t = in.nextInt();
//         int index = searching(list, t);
//         System.out.println(index);
//     }

//     public static int searching(ArrayList<Integer> arr, int key) {
//         int n = arr.size();
//         for (int i = 0; i < n; i++) {
//             if (arr.get(i).equals(key)) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
// 