package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100)+1;
		int checkNum = 0;
		int start = 1;
		int end = 100;

		System.out.println("수를 결정하였습니다. 맞추어보세요\n"+start+"-"+end);

		Scanner scanner = new Scanner(System.in);

		while(true) {
			checkNum++;
			System.out.print(checkNum+">>");
			int a = scanner.nextInt();

			if(num>a) {

				start = a;
				System.out.println("더 높게\n"+a+"-"+end);
			} else if(num<a){

				end = a;
				System.out.println("더 낮게\n"+start+"-"+a);
			} else {

				System.out.print("맞았습니다.\n다시하시겠습니까(y/n)>>");
				String answer = scanner.next();
				if(answer.equals("y")) {
					
				} else {
					break;
				}

			}
		}

	}

}
