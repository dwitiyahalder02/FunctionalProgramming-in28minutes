package functionalprogramming.structre;

import java.util.Arrays;
import java.util.List;

public class FP01Structre1 {

	public static void main(String args[])
	{
		//printAllStructreList(Arrays.asList(1,2,3,4,9,8));
		printEvenNumberStructreList(Arrays.asList(2,4,6,7,1,9));
	}

	private static void printAllStructreList(List<Integer> number) {
		// TODO Auto-generated method stub
		//how to loop the numbers
		for(int i:number)
		{
			System.out.println(i);
		}
		
	}
	
	
	
	private static void printEvenNumberStructreList(List<Integer> number) {
		// TODO Auto-generated method stub
		//how to loop the numbers
		for(int i:number)
		{
			if(i%2==0)
			System.out.println(i);
		}
		
	}
}
