package ScreenshotPackages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class TryandCatchBlock {

	public static void main(String[] args) {
		
	//	int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	//	System.out.println(num[20]);  
		
		try
		{
			int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
			System.out.println(numbers[55]);	
		}
		
		catch(Exception e)
		{
			System.out.println("You are outof the number index accessing");
			System.out.println("====Error due to the exception is :"+e);
		} 
		
		
	}

}
