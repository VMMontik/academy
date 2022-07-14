package by.academy.houmwork1;

public class Exercise3 {
	
	public static void main(String[] args) {
//	Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000. 
			
			int num = 2;
		    int result = num;
		    int power = 1;
		    do {
		        System.out.println(num + " в " + power + " = " + result);
		        power++;
		        result = result * num;
		    }while (result < 1_000_000);
		}

	}
