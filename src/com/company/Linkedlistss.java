package com.company;


import java.util.LinkedList;
public class Linkedlistss {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        // we implement a stack using linked list so linked list provide special methods for stack operation
        l.addFirst("jare");
        l.addFirst("bapu");
        l.addFirst("vishal");//first in
        System.out.println(l);
        System.out.println( l.getLast());//access last
        System.out.println(  l.removeLast());//remove last
        System.out.println(l);
        // we implement a queue  using linked list so linked list provide special methods for queue operation
        LinkedList q=new LinkedList();
        q.addLast(20);
        q.addLast(30);
        q.addLast(40);
        q.removeFirst();
        q.getFirst();
        System.out.println(q);
        l.add("jarewadi");//This method Appends the specified element to the end of this list.
        l.add(2,"chandrakant");//This method Inserts the specified element at the specified position
        //in this list.
        l.addAll(q);//This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.
         System.out.println(l.contains("vishal"));//This method returns true if this list contains the specified element.
        System.out.println(l.get(0));//This method returns the element at the specified position in this list.
    }
}
/*output
[vishal, bapu, jare]
jare
jare
[vishal, bapu]
[30, 40]
true
vishal
 */