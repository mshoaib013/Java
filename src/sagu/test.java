package sagu;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		System.out.println("Give me todays date  number first in week");
		Scanner rm = new Scanner(System.in);

		int fd=0;
		fd = rm.nextInt();
		System.out.println("give me extended date");
		int ed = rm.nextInt();

		switch (fd) {
			case 1:
				System.out.println("Today Saturday");
				break;
			case 2:
				System.out.println("Today Sunday");
				break;
			case 3:
				System.out.println("Today Monday");
				break;
			case 4:
				System.out.println("Today Tuesday");
				break;
			case 5:
				System.out.println("Today Wednesday");
				break;
			case 6:
				System.out.println("Today Thusday");
				break;
			case 7:
				System.out.println("Today Friday");
				break;
		}


		int fpluse = fd + ed;


		if (fpluse > 7) {
			int a = fpluse % 7;
			switch (a) {
				case 1:
					System.out.println("Today Saturday");
					break;
				case 2:
					System.out.println("Today Sunday");
					break;
				case 3:
					System.out.println("Today Monday");
					break;
				case 4:
					System.out.println("Today Tuesday");
					break;
				case 5:
					System.out.println("Today Wednesday");
					break;
				case 6:
					System.out.println("Today Thusday");
					break;
				case 7:
					System.out.println("Today Friday");
					break;
			}
		} else
			switch (fpluse) {
				case 1:
					System.out.println("Today Saturday");
					break;
				case 2:
					System.out.println("Today Sunday");
					break;
				case 3:
					System.out.println("Today Monday");
					break;
				case 4:
					System.out.println("Today Tuesday");
					break;
				case 5:
					System.out.println("Today Wednesday");
					break;
				case 6:
					System.out.println("Today Thusday");
					break;
				case 7:
					System.out.println("Today Friday");
					break;


			}
	}
}
