package com.Queuessss;

public class Main {

    public static void main(String[] args) {
	    var queue = new Queue(5);
        queue.EnQueue(10);
        queue.EnQueue(20);
        queue.EnQueue(30);
        queue.DeQueue();
        queue.DeQueue();
        queue.EnQueue(40);
        queue.EnQueue(50);
        queue.EnQueue(60);

        System.out.println(queue.peek());
        System.out.println(queue.toString());
    }
}
