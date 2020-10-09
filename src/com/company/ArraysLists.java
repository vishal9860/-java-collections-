package com.company;

import java.util.ArrayList;


public class ArraysLists {
    public static void main(String[] args) {
        //int n;
        //Scanner sc=new Scanner(System.in);
        //n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        //Adding element into arraylist by using add method
        arr.add(20);
        arr.add(40);
        arr.add(60);
        arr.add(80);
        arr.add(100);
        //Adding element atn specific position
        arr.add(2,50);
        //removing element at specific position
        arr.remove(0);
         ArrayList<Integer>arr2=new ArrayList<>();//creating another arraylist
         arr2.add(25);
         arr2.add(35);
         arr2.add(45);
         arr2.add(55);
         arr.addAll(3,arr2);//adding another arraylist into that arraylist
         boolean b;
         b=arr.contains(25);//checking whether the element is containing in the list if that contain return true
         System.out.println(b);
         System.out.println(arr.get(0));//Returns the element at the specified position in this list.
         System.out.println( arr.isEmpty());//Returns true if this list contains no elements.
        System.out.println("last index of 40 is");
        System.out.println(arr.lastIndexOf(40));
        ArrayList<Integer>arr3=new ArrayList<>();
        arr3.add(25);
        arr3.add(30);
        arr3.add(55);
        arr3.add(45);
        System.out.println("ArrayList before "
                + "removeAll() operation : "
                + arr);
        System.out.println("collection element to be removed"+arr3);
        arr.removeAll(arr3);//Removes from this list all of its elements that are contained in the specified collection.
        System.out.println("ArrayList after "
                + "removeAll() operation : "
                + arr);
         int size=arr.size();
         System.out.println("Size of list = "+size);
          arr.set(0,50);//Replaces the element at the specified position in this list with the specified element.
        System.out.println("after inserting 50 at 0 positions");
          System.out.println(arr);
          // and output is [50, 50, 60, 35, 80, 100]
         arr.subList(0,3);//Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
         Object ob=arr.toArray();//This method is used to return an array containing all of the elements in the list in the correct order.
         System.out.println(ob);
    }
}
