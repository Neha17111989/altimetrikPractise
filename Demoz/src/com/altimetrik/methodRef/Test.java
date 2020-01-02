package com.altimetrik.methodRef;

import java.io.*;

public class Test 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            System.out.printf("1"); 
            int value = 10 / 0;
            System.out.println("is this printed last line");
            throw new IOException(); 
        } 
        catch(EOFException e) 
        { 
            System.out.printf("2"); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.printf("3"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.printf("4"); 
        } 
        catch(IOException e) 
        { 
            System.out.printf("5"); 
        } 
        catch(Exception e) 
        { 
            System.out.printf("6"); 
        } 
    } 
} 