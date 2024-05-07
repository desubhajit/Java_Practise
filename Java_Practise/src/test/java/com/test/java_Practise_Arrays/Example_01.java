package com.test.java_Practise_Arrays;

import java.util.Arrays;
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

	
	@Test
	public void Test_002()
	{
		
		// Read and Print Array Elements where the Array elements are added dynamically on the run
		
		
				int[] ids = new int[5];
						
				for(int i=0; i<5; i++)
				{
					ids[i] = i+14;
				}
						
						
				for(int j=0; j<ids.length; j++)
				{
					System.out.println("Array Elemets are :" + ids[j]);
				}
						

	}
	
	
	@Test
	public void Test_003()
	{
		
		// Sort in Ascending Order and Print Array Elements where the Array elements are pre-defined
		
		
				int[] roll_num = {1234, 2341, 1121, 2231, 3231, 1002};
				int temp = 0;
								
				for(int i=0; i<roll_num.length; i++)
				{
				  for(int j=0; j<roll_num.length; j++)
				  {
					  if(roll_num[i]<roll_num[j])
					  {
					    temp = roll_num[i];
					    
					    roll_num[i] = roll_num[j];
					    roll_num[j] = temp;
					  }
				  }
				}
					
				
				System.out.println("Sorted Array Elemets are :" );
				
				for(int j=0; j<roll_num.length; j++)
				{
					
					System.out.print(roll_num[j] + " , ");
				}
		

	}
	
	
	@Test
	public void Test_004()
	{
		
		// Sort in Ascending Order and Print Array Elements where the Array elements are pre-defined by using sort method of Arrays class
		
				int[] roll_nums = {1234, 2341, 1121, 2231, 3231, 1002};
				
								
				Arrays.sort(roll_nums);
					
				
				System.out.println("Sorted Array Elemets are :" );
				
				for(int j=0; j<roll_nums.length; j++)
				{
					
					System.out.print(roll_nums[j] + " , ");
				}
				


	}
	
	
}
