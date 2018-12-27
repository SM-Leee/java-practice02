package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액 : ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		for(int i=0;i<10;i++) {
			int num =0;
			num = money/MONEYS[i];
			if(money/MONEYS[i]!=0) {
				money -= MONEYS[i]*num;
				System.out.println(MONEYS[i]+"원 : "+num+"개");
			}
			else {
				System.out.println(MONEYS[i]+"원 : "+num+"개");
			}
		}
	}

}
