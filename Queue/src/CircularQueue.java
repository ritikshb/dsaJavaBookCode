public class CircularQueue {
    private int front;
    private int rear;
    private int[] arr;

    public CircularQueue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return  (rear == front-1 || (front == 0 && rear == arr.length-1));
    }

    public void enqueue(int value){
        if(isEmpty())
            return;
        front = 0;
        arr[++rear] = value;
    }

}
