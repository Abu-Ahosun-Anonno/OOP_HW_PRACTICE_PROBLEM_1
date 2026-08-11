import java.util.Scanner;
class Stack{
    int stck[]=new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==9){
            System.out.println("Stack Full");
        }
        else{
            stck[++tos]=item;
        }

    }
    int pop(){
        if(tos<0){
            System.out.println("System Underflow");
            return 0;
        }
      else{
       return   stck[tos--];
        }

    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack();
// Push elements
        for (int i = 10; i < 20; i++) {
            myStack.push(i);
        }
// Attempt to push one more
        myStack.push(20);
        System.out.println("Popping:");
// Pop elements
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack.pop());
        }
// Attempt to pop from empty stack
        myStack.pop();
    }
}
