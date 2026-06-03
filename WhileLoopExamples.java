package LoopStatement;

public class WhileLoopExamples {

	public static void main(String[] args) {
		int count =0 ;
		while (count <5) 
		{// while this condn is true, loop is executed.
			System.out.println(count);
			count++;
			
		}//output is 01234
		
		count =5;
		while (count<5) 
		{
			System.out.println(count);
			count++;
		}//nothing is printed to output
	}

}