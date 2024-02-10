package com.example.datastructures;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args){

        PriorityQueue<Double> myPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        myPriorityQueue.offer(2.0);
        myPriorityQueue.offer(1.0);
        myPriorityQueue.offer(1.3);
        myPriorityQueue.offer(2.4);
        myPriorityQueue.offer(5.0);
        myPriorityQueue.offer(3.0);


        while(!myPriorityQueue.isEmpty()){
            System.out.println("\n");
            System.out.print(myPriorityQueue.poll());
        }

    



    }
    
}
