import java.util.*;
//Stack class
class Stack 
{  
    int top;            //define top of stack
    int maxsize = 5;    //max size of the stack  
    int[] stack_arry = new int[maxsize];  //define array that will hold stack elements
    public  Stack() {            //stack constructor; initially top = -1
        top = -1;  
    }    
    boolean isEmpty()  //isEmpty () method
    {          
        return (top < 0);  
    }  
   boolean push (int val) //push () method
   {       
        if(top == maxsize-1) 
        {  
            System.out.println("Stack Overflow !!");  //stack is full
            return false;  
        }  
        else  
        {  
            top++;  
            stack_arry[top]=val;  
            return true;  
        }  
    }  
    boolean pop () //pop () method
    {            
        if (isEmpty()) 
        {  
            System.out.println("Stack Underflow !!");  //stack is empty
            return false;  
        }  
        else   
       {              
            System.out.println("\nItem popped: " + stack_arry[top--]);  
            return true;  
        }  
    }  
    void display () //print the stack elements
    {             
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--) 
       {  
            System.out.print(stack_arry[i] + " ");  
        }  
    }  
}  
 
public class MainStack {  
public static void main(String[] args) {  
    //define a stack object
    Stack stck = new Stack();
    System.out.println("Initial Stack Empty : " + stck.isEmpty());
    //push elements
    stck.push(10);
    stck.push(20);
    stck.push(30);
    stck.push(40);
    stck.push(60);
    

    


    System.out.println("After Push Operation...");
    //print the elements
    stck.display();
    //pop two elements from stack
    stck.pop();
    stck.pop();
    System.out.println("After Pop Operation...");
    //print the stack again
    stck.display();
}  
}
