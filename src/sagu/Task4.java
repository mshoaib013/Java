package sagu;

import java.util.Scanner;

public class Task4 {
	public static void main(String[]args){
		System.out.println("Give me 3 digit number to find palindrome");
		Scanner palin= new Scanner(System.in);

		int x =palin.nextInt();

		int a= x%10;
			x=x/10;
		int b=x%10;
		int c=x/10;

		if(a==c) {
			System.out.println("Fucking idiot this is palindrome");
		}else {
			System.out.println("this is not fucking palindrome");
		}
	}

}
