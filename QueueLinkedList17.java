public class QueueLinkedList17 {

    Node17 front, rear;
    int size;
    int max = 10;

    QueueLinkedList17() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared.");
    }

    void enqueue(Student17 std) {

        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        Node17 newNode = new Node17(std, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Student added to queue.");
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Calling next student:");
        front.data.print();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    void peekFront() {

        if (!isEmpty()) {
            System.out.println("Front Student:");
            front.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void peekRear() {

        if (!isEmpty()) {
            System.out.println("Rear Student:");
            rear.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void printQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        Node17 temp = front;

        System.out.println("Student Queue:");
        while (temp != null) {
            temp.data.print();
            System.out.println("-------------------");
            temp = temp.next;
        }
    }

    void totalQueue() {
        System.out.println("Total students in queue: " + size);
    }
}