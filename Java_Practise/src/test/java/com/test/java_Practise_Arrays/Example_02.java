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

	
	
	
	
}
