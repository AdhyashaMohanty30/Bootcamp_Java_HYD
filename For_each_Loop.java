package LoopStatement;

public class For_each_Loop {

	public static void main(String[] args) {
	   String[]names = {"java","C","C++","Python","JavaScript"};
      
	   System.out.println("Printing the content of the array names:\n");
	   for (String name: names)
	   {
		   System.out.println(name);
	   }
	}
	

}