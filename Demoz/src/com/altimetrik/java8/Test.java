package com.altimetrik.java8;
public class Test 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            System.out.printf("1"+"\n"); 
            int data = 5 / 0; 
        } 
        catch(ArithmeticException e) 
        { 
            Throwable obj = new Throwable("Sample"); 
            try 
            { 
            	System.out.println(obj);
                throw obj; 
            }  
            catch (Throwable e1)  
            { 
                System.out.printf("8"); 
            } 
            System.out.println("NEha");
        } 
        finally
        { 
            System.out.printf("3"); 
        } 
        System.out.printf("4"); 
    } 
} 