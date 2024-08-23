package Calculater;

import java.util.Scanner;

public class Calculater01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = sc.nextInt();
		System.out.println("Enter any number");
		int b = sc.nextInt();
		System.out.println("operation");

		int operation = sc.nextInt();
		switch (operation) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
			
		case 3:
			System.out.println(a * b);
			break;
		case 4:
			System.out.println(a % b);
			break;
		default:
			System.out.println("invalid operation");
		}
	}

}
