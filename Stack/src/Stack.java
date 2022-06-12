
public class Stack {
    private char[] arr;
    private int top;
    public Stack(int size){
        arr = new char[size];
        top = -1;
    }
    public void push(char value){
        arr[++top] = value;
    }
    public char pop(){
        return arr[top--];
    }
    public char peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public int size(){
        return top;
    }
}
