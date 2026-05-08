import java.util.Scanner;

public class MainQueue17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueLinkedList17 queue = new QueueLinkedList17();

        int choice;

        do {

            System.out.println("\n=== STUDENT SERVICE QUEUE ===");
            System.out.println("1. Add Student");
            System.out.println("2. Call Next Student");
            System.out.println("3. Show Front Student");
            System.out.println("4. Show Rear Student");
            System.out.println("5. Display All Queue");
            System.out.println("6. Check Empty");
            System.out.println("7. Check Full");
            System.out.println("8. Clear Queue");
            System.out.println("9. Total Queue");
            System.out.println("0. Exit");

            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Input NIM    : ");
                    String nim = sc.nextLine();

                    System.out.print("Input Name   : ");
                    String name = sc.nextLine();

                    System.out.print("Input Major  : ");
                    String major = sc.nextLine();

                    Student17 std = new Student17(nim, name, major);

                    queue.enqueue(std);

                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peekFront();
                    break;

                case 4:
                    queue.peekRear();
                    break;

                case 5:
                    queue.printQueue();
                    break;

                case 6:
                    System.out.println("Queue Empty : " + queue.isEmpty());
                    break;

                case 7:
                    System.out.println("Queue Full : " + queue.isFull());
                    break;

                case 8:
                    queue.clear();
                    break;

                case 9:
                    queue.totalQueue();
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid menu!");
            }

        } while (choice != 0);
    }
}