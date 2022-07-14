package by.academy.houmwork1;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число от 1 до 10: ");
		int n = in.nextInt();
		  
		for (int i = 1; i <= 10; i++) {
		   System.out.println(n + "*" + i + " =" + (n * i));
		   }
		in.close();
	    }
	}
