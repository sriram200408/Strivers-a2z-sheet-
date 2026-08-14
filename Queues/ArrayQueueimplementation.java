package Queues;

class ArrayQueue{
    public int size;
    public int topindex;
    public int currindex;
    public int[] Arrayqueue;
    public ArrayQueue(int length){
        size = length;
Arrayqueue = new int[size];
topindex = -1;
currindex = 0;
    }
    public ArrayQueue(){
        this(1000);
    }
    public boolean isEmpty(){
        return currindex>topindex;
    }
    public void push(int ele){
        if(topindex >= size-1){
            System.out.println("The queue is full");
            return;
        }
        Arrayqueue[++topindex] = ele;
        return;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }
        return Arrayqueue[currindex];
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        // if(currindex == size-1){
        //     int temp = currindex;
        //     currindex = 0;
        //     return Arrayqueue[temp];
            
        // }
        return Arrayqueue[currindex++];

    }
}

public class ArrayQueueimplementation {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        String[] commands = {"ArrayQueue", "push", "push", 
                             "peek", "pop", "isEmpty"};
        int[][] inputs = {{}, {5}, {10}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    queue.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(queue.pop() + " ");
                    break;
                case "peek":
                    System.out.print(queue.peek() + " ");
                    break;
                case "isEmpty":
                    System.out.print(queue.isEmpty() ? "true " : "false ");
                    break;
                case "ArrayQueue":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
