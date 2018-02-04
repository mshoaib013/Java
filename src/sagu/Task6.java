package sagu;

import java.util.Scanner;

public class Task6 {
	public static void main(String[]args){
		System.out.println("give me value of three edge to compute the perimeter of triangle ");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int peri;
		if (((a+b)>c)  && ((b+c)>a)  && ((c+a)>b)){
			peri = a+b+c;
			System.out.println(peri);
		}
		else
		{

			System.out.println("invalid");

		}

	}
}
