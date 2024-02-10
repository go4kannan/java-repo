package com.example.datastructures;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue is a FIFO data structure. 
 * Queue is an interface  but not a class hence you can't instantiate a queue.
 * To use Queue you need to instantiate the class that implements queue. 
 * In hava LinkedList and Priority queue implements Queue
 * In this example we have used Queue.
 * 
 */

public class QueueExample {

    public static void main(String[] args){

    

        Queue<String> myQueue = new LinkedList<String>();
        
        myQueue.add("Shirt");
        myQueue.add("Pants");
        myQueue.add("Belt");
        myQueue.add("Shoes");
        myQueue.add("Shorts");


        System.out.println(myQueue);

        //peek() method is just used to list the first element in the queue 
        //but does not remove from the queue.
        
        System.out.println(myQueue.peek());

        System.out.println(myQueue);

        //poll() method is just used to list the first element in the queue 
        //but does remove from the queue.

        System.out.println(myQueue.poll());

        System.out.println(myQueue);

    }
    
}
