package sagu;
import java.util.*;
import java.util.Scanner;

public class task5 {
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("user 1 input  r/p/s : ");


		char usr1 = sc.next().charAt(0);
		char usr2=0;// = sc.next().charAt(0);
		double us;
		us = Math.random();
		us = ((us*1000)%3);

		int usr = (int) us;

		System.out.println(usr);
		if (usr == 0){
			usr2='r';
		}
		else if (usr == 1){
			usr2='p';
		}

		else if (usr == 2){
			usr2='s';
		}

		if ((usr1 =='r' && usr2 == 's') || (usr1 =='p' && usr2 == 'r') || (usr1 =='s' && usr2 == 'p')){
			System.out.println("User 2 Win");
		}
		else if(usr1 == usr2){
			System.out.println("Draw");
		}
		else {
			System.out.println("User 2 Win");
		}
	}
}
