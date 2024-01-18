import java.util.Scanner;

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front = 0; 
    int rear = -1;

    void enqueue(int element) {
        if (rear == SIZE - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            items[rear] = element;
            System.out.println(element + " Enqueued");
        }
    }

    int dequeue() {
        int element;
        if (front > rear) {
            System.out.println("Queue is empty");
            return 0;
        } else {
            element = items[front++];
            System.out.println(element + " Dequeued");
            return element;
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Items -> ");
            for (int i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");
           // System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue Q = new Queue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1: Enqueue 2: Dequeue 3: Display 4: Exit ");
            System.out.println("Enter the option ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the value to be inserted into Q");
                    int val = sc.nextInt();
                    Q.enqueue(val);
                    break;
                case 2:
                    Q.dequeue();
                    break;
                case 3:
                    Q.display();
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
