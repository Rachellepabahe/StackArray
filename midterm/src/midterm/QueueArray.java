package midterm;

/**
 *
 * @author admin
 */
public class QueueArray {

    private int[] queue = new int[5];
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    
    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }
        
        // Wrap around using modulo if rear reaches the end
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }
    
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        
        int value = queue[front];
        // Wrap around using modulo if front reaches the end
        front = (front + 1) % queue.length;
        size--;
        return value;
    }
    
    public static void main(String[] args) {
       QueueArray q = new QueueArray();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Dequeued: " + q.dequeue()); // 20
        
        // This would have crashed your old code, but works perfectly now:
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
    }
}

    
    
