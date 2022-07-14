package by.academy.houmwork1;

import java.util.Scanner;

public class Exe1 {
	
		public static void main(String [] args) {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Введте стоимость товара :");
			double price = in.nextDouble();
			double sum = 0;
			System.out.println("Введите ваш возраст :");
			int ags = in.nextInt();

			
			if (price < 101) {
				sum = price*0.95;  //Сумма до 100 рублей -> 5% 
			} else if (100 < price && price < 200) {
				sum = price*0.93; //Сумма от 100 рублей включая до 200 рублей не включая -> 7%
			} else if (ags > 17 && 199 < price && price < 300) {
				sum = price*0.84; //Сумма от 200 рублей включая до 300 рублей не включая -> 16% (больше 18 лет)
			} else if (ags <= 17 && 199 < price && price < 300) {
				sum = price*0.91; //Сумма от 200 рублей включая до 300 рублей не включая -> 9% (меньше 18 лет)
			} else if (299 < price && price < 400) {
				sum = price*0.85; //Сумма от 300 рублей включая до 400 рублей не включая -> 15%
			} else if (399 < price) {
				sum = price*0.80; // Сумма покупки больше 400 рублей включая -> 20%
			}
			System.out.println("ЦЕНА с учетом скидки :" + sum);
			in.close();
		}
			
	}



