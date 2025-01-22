package studio1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
				System.out.println("What year is it?");
				int year = in.nextInt();
				int criteria1 = year % 4;
				int criteria2 = year % 100;
				int criteria3 = year % 400;
				boolean answer = (criteria1 == 0 && criteria2 != 0) || (criteria3 == 0);
				System.out.println(year + " is a leap year:" + answer);
				
				
		
				

	}

}
