import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SearchString {
    public static void main(String[] args) {
   // String name = "Nishitha";
    //char target = '5';
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string:");
    String name = in.next();
    System.out.println("Enter the character to be searched for: ");
    char target = in.next().charAt(0);
    System.out.println(search(name,target));
}


static boolean search(String str, char target ){
    if(str.length() == 0){
        return false;
     }
     for(int i=0; i<str.length();i++ ){
        if(target == str.charAt(i)){
            return true;
        }
     }
     return false;

}

}
