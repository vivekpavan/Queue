package com.Queuessss;

import java.util.Arrays;

public class Queue {
    private int[] array;
    private int rear;
    private int front;
    private int count;
    public Queue(int capacity){
        array = new int[capacity];
    }

    public void EnQueue(int item){
        if(count == array.length){
            throw new IllegalStateException();
        }
        array[rear] = item;
        rear = (rear + 1) % array.length;
        count++;
    }
    public int DeQueue(){
        var item = array[front];
        array[front] = 0;
        front = (front + 1) % array.length;
        count--;  //don't no why he did this ,ANS : because he is validating using count in the EnQueue() &
                    //also in IsEmpty() and IsFull().So ****COUNT counts THE ELEMENTS ADDDED AND SUBTRACTED
                    //FROM EnQueue and DeQueue methods ******.
        return item;
    }
    public int peek(){
        return array[front];
    }
    public boolean IsEmpty(){
        return count == 0;
    }
    public boolean IsFull(){
        return count == array.length;
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
