package com.test.java_Practise_Arrays;

import org.testng.annotations.Test;

public class Example_02 {
	
	
	@Test
	
	public void Test_005()
	{
		
		// Read and Print 2 Dimensional Array Elements where the Array elements are pre-defined
		
		
		String[][] cars = {{"Toyoto","Hyundai","Volvo","Suzuki"},{"Nano","Mahindra","Chevrolet","Ferrari"}};
		
		for(int i=0; i<cars.length; i++)
		{
			for(int j=0; j<cars.length; j++)
			{
				System.out.println("Array Elemets are :" + cars[i][j]);
			}
			
		}
	}

	
    @Test
	
	public void Test_006()
	{
		
		// Read and Print 2 Dimensional Array Elements where the Array elements are added dynamically
		
		
		int[][] roll_num = new int[5][5];
		
		for(int i=0; i<roll_num.length; i++)
		{
			for(int j=0; j<roll_num.length; j++)
			{
				roll_num[i][j] = i+j ;
			}
			
		}
		
		
		for(int i=0; i<roll_num.length; i++)
		{
			for(int j=0; j<roll_num.length; j++)
			{
				System.out.print(roll_num[i][j]+"  ");
			}
			
			System.out.println(" ");
		}
		
		
	}
    
    
    
@Test
	
	public void Test_007()
	{
		
		// Read and Print 2 Dimensional Array Elements where the String Array elements are added 
	    // dynamically to print square * pattern
		
		
		String[][] roll_num = new String[10][10];
		
		for(int i=0; i<roll_num.length; i++)
		{
			for(int j=0; j<roll_num.length; j++)
			{
				roll_num[i][j] = "*" ;
			}
			
		}
		
		
		for(int i=0; i<roll_num.length; i++)
		{
			for(int j=0; j<roll_num.length; j++)
			{
				System.out.print(roll_num[i][j]+" ");
			}
			
			System.out.println(" ");
		}
		
		
	}
	
	
}
