/*
 * Stack is a LIFO Data Structure
 * Store objects as vertical towwer
 * push() to add objects to the top of the stack
 * pop() to remove object from the top of the stack
 */


package com.example.datastructures;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args){
        
        Stack<String> myStack = new Stack<String>();

        myStack.push("Shirt");
        myStack.push("Pants");

        System.out.println(myStack);
        
        System.out.println(myStack.search("Shirt"));
    }


}