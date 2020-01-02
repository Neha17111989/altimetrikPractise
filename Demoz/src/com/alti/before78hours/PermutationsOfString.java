package com.alti.before78hours;
public class PermutationsOfString 
{   
    static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
    private static void StringPermutation(String permutation, String input)
    {   
        if(input.length() == 0)
        {
        	//System.out.println("inside if");
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {   
				/*
				 * System.out.println("inside elseee");
				 * System.out.println(permutation+input.charAt(i));
				 * System.out.println(input.substring(0, i)+input.substring(i+1,
				 * input.length())); System.out.println(input.substring(i+1, input.length()));
				 */
            	
                StringPermutation(permutation+input.charAt(i), 
                		input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
     
    public static void main(String[] args) 
    {
        StringPermutation("NO");
    }   
}