import java.util.Scanner;

public class ReverseWord {
    private String word;
    public void reverseWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Down Word You Want to reverse");
        System.out.flush();
        word = scanner.nextLine();
        Stack stack = new Stack(word.length());
        int i = 0;
        while(!stack.isFull()){
            stack.push(word.charAt(i));
            i++;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() +" ");
        }
    }
    public static void main(String[] args){
        ReverseWord reverse = new ReverseWord();
        reverse.reverseWord();
    }
}
