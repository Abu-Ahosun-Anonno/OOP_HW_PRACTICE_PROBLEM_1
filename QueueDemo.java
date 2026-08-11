class Queue{
    int que[]=new int[10];

    int front,rear;
    Queue(){
        front=0;
        rear=-1;
    }
    void push(int item){
        if(rear==9){
            System.out.println("Queue Full");
        }
        else{
            que[++rear]=item;
        }
    }
    int pop(){
        if(front > rear){
            System.out.println("Queue Underflow");
            return 0;
        }
        else{
            return que[front++];
        }
    }
}


public class QueueDemo {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        // Push elements
        for (int i = 10; i < 20; i++) {
            myQueue.push(i);
        }

        // Attempt to push one more (queue is full)
        myQueue.push(20);

        System.out.println("Popping:");
        // Pop elements
        for (int i = 0; i < 10; i++) {
            System.out.println(myQueue.pop());
        }

        // Attempt to pop from empty queue
        myQueue.pop();
    }
}
