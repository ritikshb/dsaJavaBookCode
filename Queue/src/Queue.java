public class Queue {
    private int front;
    private int rear;
//    private int size;
    private int[] arr;
    public Queue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return rear == arr.length;
    }
    public void enqueue(int value){
        if(isFull()) {
            System.out.println("size out of bound");
            return;
        }
//        front = 0;
        arr[++rear] = value;
    }
    public void dequeue(){
        int value ;
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        else {
           value = arr[++front];
        }
        if(front >= rear){
            front = -1;
            rear = -1;
        }
        System.out.println("Dequeue value "+value);
//            front++;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
//        for(int i = front;i<=rear;i++){A
//            System.out.print(arr[i] +" ");
//        }

        if(front == -1){
            for(int i = front+1;i<=rear;i++){
            System.out.print(arr[i] +" ");
            }
        }
        else {
            for(int i = front+1;i<=rear;i++){
                System.out.print(arr[i] +" ");
            }
        }

    }

    public static void main(String[] args){
        Queue queue = new Queue(5);

        queue.enqueue(5);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.printQueue();
        System.out.println();
        queue.dequeue();
        queue.printQueue();
        System.out.println();

        queue.enqueue(2);
//        queue.enqueue(6);

        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.dequeue();

        queue.printQueue();
        System.out.println();

        queue.enqueue(8);
        queue.printQueue();
        System.out.println();
        queue.dequeue();
//        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        System.out.println();
        queue.dequeue();
        queue.enqueue(8);
        queue.printQueue();
    }
}
