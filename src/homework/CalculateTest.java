package homework;

import java.util.Scanner;

public class CalculateTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계산하고자 하는 첫번째 수 입력 : ");
		int n1 = scan.nextInt();
		System.out.print("계산하고자 하는 두번째 수 입력 : ");
		int n2 = scan.nextInt();
		Calculate c1 = new Calculate(n1, n2);
		c1.printResult();
	}

}
