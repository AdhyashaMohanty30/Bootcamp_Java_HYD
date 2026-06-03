package JavaOperator;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println((5>3)&&(8>5));
		System.out.println((5>3)&&(5>8));
		
		System.out.println((5<3)||(8>5));
		System.out.println((5>3)||(8<5));
		System.out.println((5<3)||(8<5));
		
		System.out.println(!(5==3));
		System.out.println(!(5>3));
	}

}
