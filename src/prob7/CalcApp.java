package prob7;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print(">> ");
			String expression = scanner.nextLine();

			if (expression.equals("quit"))
				break;
			String[] tokens = expression.split(" ");
			String operator = tokens[1];
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			Arith cal = null;
			
			switch (operator) {
			case "+":
				cal = new Add();
				break;
			case "-":
				cal = new Sub();
				break;
			case "*":
				cal = new Mul();
				break;
			case "/":
				cal = new Div();
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			if(cal==null){
				System.out.println(">> 알수없는 연산입니다.");
				continue;
			}
			System.out.println(">> " + cal.setValue(a, b).calculate());
			/* 코드를 완성 합니다 */

		}
	}
}
