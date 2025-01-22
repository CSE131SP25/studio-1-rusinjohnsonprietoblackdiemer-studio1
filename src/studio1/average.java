package studio1;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		
		System.out.println("Yo, sup?");
		int value1 = n1.nextInt();
		
		System.out.println("The first of two integers to be averaged");
		int value2 = n1.nextInt();
		
		System.out.println(( value1+value2)/2);
	}

}
