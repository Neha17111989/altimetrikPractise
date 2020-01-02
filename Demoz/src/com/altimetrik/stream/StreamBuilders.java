package com.altimetrik.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders 
{
     public static void main(String[] args)
     {
         Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         System.out.println(stream);
         
         List<String> ll = Arrays.asList("neha", "mehta", "veer", "nitin", "aman", "avi", "pushkar");
         Stream<String> streamOfString=ll.stream();
         System.out.println(streamOfString);
        // stream.forEach(p -> System.out.println(p));
     }
}