package java101;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		
	Scanner inp = new Scanner(System.in);
	int n1,n2,select;
	
	System.out.print("Enter first number:");
	n1 = inp.nextInt();
	System.out.print("Enter second number:");
	n2 = inp.nextInt();
	
	System.out.print(" 1-plus\n 2-minus\n 3-multiply\n 4-divide\n");
	System.out.print("Your choice: ");
	select = inp.nextInt();
	
	switch (select) {
	
	case 1:
		System.out.print("plus:" + (n1 + n2));
		break;
		
	case 2:
		System.out.print("minus:" + (n1 - n2));
		break;
		
	case 3:
		System.out.print("multiply:" + (n1 * n2));
		break;
		
	case 4:
		System.out.print("divide:" + (n1 / n2));
		break;
	}
	}
}
