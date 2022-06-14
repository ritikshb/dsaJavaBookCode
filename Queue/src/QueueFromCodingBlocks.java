public class QueueFromCodingBlocks {
    private int front;
    private int rear;
    private int maxiSize;
    private int currentSize;
    int[] arr;

    public QueueFromCodingBlocks(int msize){
        front = 0;
        rear = msize-1;
        maxiSize = msize;
        currentSize = 0;
        arr = new int[msize];
    }

    public boolean isFull(){
        return currentSize == maxiSize;
    }

    public void pushEnqueue(int value){
        if(!isFull()){
            rear = (rear+1)%maxiSize;
            arr[rear] = value;
            currentSize++;
        }
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public void popDequeue(){
        if(!isEmpty()){
            front = (front+1)%maxiSize;
            currentSize--;
        }
    }

    public int getFront(){
        return arr[front];
    }

    public static void main(String[] args){
        QueueFromCodingBlocks queue = new QueueFromCodingBlocks(5);
        for(int i = 0;i<6;i++){
            queue.pushEnqueue(i);
        }

        queue.popDequeue();
        queue.pushEnqueue(8);

        while (!queue.isEmpty()){
            System.out.print(queue.getFront() +" ");
            queue.popDequeue();
        }
    }

}
