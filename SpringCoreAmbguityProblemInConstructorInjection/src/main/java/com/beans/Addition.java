package com.beans;

public class Addition {
    
    private int a;
    private int b;
    
    
    // Constructor with float parameters
    public Addition(float a, float b) {
    	
    	System.out.println("In float Contructor");
        this.a = (int) a; // Explicitly cast float to int
        this.b = (int) b; // Explicitly cast float to int
    }
    
    // Constructor with int parameters
    public Addition(int a, int b) {
    	System.out.println("In int Contructor");
        this.a = a;
        this.b = b;
    }
    
    
   /* // Constructor with String parameters
    public Addition(String a, String b) {
    	
    	System.out.println("In String Contructor");
            this.a = Integer.parseInt(a); // Convert String to int
            this.b = Integer.parseInt(b); // Convert String to int
    }*/
    
    // Method to get the sum of a and b
    public int getSum() {
		
        return a + b;
    }

    // Method to display the values
    public void displayValues() {
    	System.out.println("Values of a: " +a);
    	System.out.println("Values of b: " +b);
    }
}
