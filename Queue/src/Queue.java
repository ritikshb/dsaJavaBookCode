public class Queue {
    private int front;
    private int rear;
    private int size;
    private int[] arr;
    public Queue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return rear == arr.length;
    }
    public void enqueue(int value){
        if(isFull())
            return;

        front = 0;
        rear++;
        arr[rear] = value;
    }
    public void dequeue(){
        if(isEmpty()){
            return;
        }
        else if(rear == front){
            front = -1;
            rear = -1;
        }
        else{
            int value = arr[front];
            System.out.println("Dequeue value "+value);
            front++;
        }
    }
    public void printQueue(){
        if(isEmpty()){
            return;
        }
        for(int i = front;i<=rear;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args){
        Queue queue = new Queue(5);

        queue.enqueue(5);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(6);

        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

    }
}
