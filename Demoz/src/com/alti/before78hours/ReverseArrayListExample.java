package com.alti.before78hours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReverseArrayListExample
{
    public static void main(String[] args) 
    {
        //Constructing an ArrayList
         
        ArrayList<String> list = new ArrayList<String>();
                 
        list.add("Gold");
         
        list.add("Iron");
         
        list.add("Copper");
         
        list.add("Silver");
         
        list.add("Nickel");
         
        list.add("Cobalt");
        list.add("Cobalt");
         
        list.add("Zinc");
         
        //Printing list before reverse
         
        System.out.println("ArrayList Before Reverse :");
         
        System.out.println(list);
       
         
        //Reversing the list using Collections.reverse() method
         
       // Collections.reverse(list);
        Collections.reverse(list);
        Set<String> s=new HashSet<String>(list);
         
        //Printing list after reverse
         
        System.out.println("ArrayList After Reverse :");
         
        System.out.println(list);
    }
}