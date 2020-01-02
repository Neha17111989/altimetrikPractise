package com.nag;
class SomeClass
{
    public static void main(String args[]) 
    { 
        // call the proveIt method and print the return value
    	System.out.println(SomeClass.proveIt()); 
    }

    public static int proveIt()
    {
    	try {  
            	throw new RuntimeException("custom ");  
    	}  
    	finally {  
    	   System.out.println("finally");
    	   return 43;
    	}
    }
}