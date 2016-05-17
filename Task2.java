package D.eclipse.vera.dz;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("введите значения для переменных");
		int x;
		int y;
		
		x=sc.nextInt();
		y=sc.nextInt();
		int razn;
		int summa;
		int proizv;
		double czas;
		
		if(x>=y)
		   {
			razn=x-y;
			czas=(double)x/(double)y;
		   }
		else
		   {
			razn=y-x;
			czas=(double)y/(double)x;
		   }
		summa=x+y;
		proizv=x*y;
		
		System.out.println("частное="+czas+" разность="+razn+" сумма="+summa+ " произведение="+proizv);
		

	}

}
