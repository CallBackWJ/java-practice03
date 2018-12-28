package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print(">> ");
			String expression = scanner.nextLine();

			if (expression.equals("quit"))
				break;
			String[] tokens = expression.split(" ");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			
			switch (tokens[1]) {
			case "+":
				System.out.println(">> " + new Add(a, b).calculate());
				break;
			case "-":
				System.out.println(">> " + new Sub(a, b).calculate());
				break;
			case "*":
				System.out.println(">> " + new Mul(a, b).calculate());
				break;
			case "/":
				System.out.println(">> " + new Div(a, b).calculate());
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			/* 코드를 완성 합니다 */

		}
	}
}
