import java.util.*;

class Question2 {
    public String officePrinterWars(String jobs) {
        Queue<Integer> sales = new LinkedList<>();
        Queue<Integer> marketing = new LinkedList<>();

        int n = jobs.length();

        for (int i = 0; i < n; i++) {
            if (jobs.charAt(i) == 'S') {
                sales.offer(i);
            } else {
                marketing.offer(i);
            }
        }

        while (!sales.isEmpty() && !marketing.isEmpty()) {
            int s = sales.poll();
            int m = marketing.poll();

            if (s < m) {
                sales.offer(s + n);
            } else {
                marketing.offer(m + n);
            }
        }

        return sales.isEmpty() ? "Marketing" : "Sales";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jobs = sc.nextLine();

        Question2 obj = new Question2();
        System.out.println(obj.officePrinterWars(jobs));

        sc.close();
    }
}
class MyCircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) 
    {
        capacity = k;
        queue = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) 
    {
        if (isFull()) 
        {
            return false;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;

        return true;
    }
    
    public boolean deQueue() 
    {
        if (isEmpty()) 
        {
            return false;
        }

        front = (front + 1) % capacity;
        size--;

        return true;
    }
    
    public int Front() 
    {
        if (isEmpty()) 
        {
            return -1;
        }

        return queue[front];
    }
    
    public int Rear() 
    {
        if (isEmpty()) 
        {
            return -1;
        }

        return queue[rear];
    }
    
    public boolean isEmpty() 
    {
        return size == 0;
    }
    
    public boolean isFull() 
    {
        return size == capacity;
    }
}