package com.test.java_Practise_Arrays;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Example_01 {
	
	
	@Test
	
	public void Test_001()
	{
		
		// Read and Print Array Elements where the Array elements are pre-defined
		
		
		String[] cars = {"Toyoto","Hyundai","Volvo","Suzuki"};
		
		for(int i=0; i<cars.length; i++)
		{
			System.out.println("Array Elemets are :" + cars[i]);
		}
	}

}
