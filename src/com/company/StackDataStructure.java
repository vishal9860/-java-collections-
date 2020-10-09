package com.company;

import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {
        Stack<String>plates=new Stack<>();
        plates.add("first plate");
        plates.add("second plate");
        plates.add("third plate");
        plates.add("fourth plate");
        plates.add("fifth  plate");
        plates.push("last plate");
        plates.pop();
        System.out.println(plates.peek());//Returns the element on the top of the stack, but does not remove it.
        System.out.println(plates.search("first plate"));//It determines whether an object exists in the stack. If the element is found,

       // It returns the position of the element from the top of the stack. Else, it returns -1.
        System.out.println(plates);

    }
}
