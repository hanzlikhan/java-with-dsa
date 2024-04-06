public class normalQueue {
    public static class Queue {
        int[] items;
        int front, rear;
        int size;

        Queue(int size) {
            this.size = size;
            items = new int[size];
            front = -1;
            rear = -1;
        }

        // check if the queue is full
        static boolean isFull(Queue queue) {
            return (queue.rear == queue.size - 1);
        }

        // check if the queue is empty
        static boolean isEmpty(Queue queue) {
            return (queue.front == -1);
        }

        // insert elements to the queue
        static void enQueue(Queue queue, int element) {
            if (isFull(queue)) {
                System.out.println("Queue is full");
            } else {
                if (queue.front == -1) {
                    // mark front denote first element of queue
                    queue.front = 0;
                }
                queue.rear++;
                // insert element at the rear
                queue.items[queue.rear] = element;
                System.out.println("Insert " + element);
            }
        }

        // delete element from the queue
        static int deQueue(Queue queue) {
            int element;

            // if queue is empty
            if (isEmpty(queue)) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                // remove element from the front of queue
                element = queue.items[queue.front];

                // if the queue has only one element
                if (queue.front >= queue.rear) {
                    queue.front = -1;
                    queue.rear = -1;
                } else {
                    // mark next element as the front
                    queue.front++;
                }
                System.out.println(element + " Deleted");
                return element;
            }
        }

        // display element of the queue
        static void display(Queue queue) {
            int i;
            if (isEmpty(queue)) {
                System.out.println("Empty Queue");
            } else {
                // display the front of the queue
                System.out.println("\nFront index-> " + queue.front);

                // display element of the queue
                System.out.println("Items -> ");
                for (i = queue.front; i <= queue.rear; i++)
                    System.out.print(queue.items[i] + "  ");

                // display the rear of the queue
                System.out.println("\nRear index-> " + queue.rear);
            }
        }
    }

    public static void main(String[] args) {
        // create an object of Queue class
        Queue q = new Queue(5);

        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        q.deQueue(q);

        // insert elements to the queue
        for (int i = 1; i < 6; i++) {
            q.enQueue(q, i);
        }

        // 6th element can't be added to queue because queue is full
        q.enQueue(q, 6);

        q.display(q);

        // deQueue removes element entered first i.e. 1
        q.deQueue(q);

        // Now we have just 4 elements
        q.display(q);
    }
}
