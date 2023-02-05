package homework;

/*
#문제 8번 2019~2021년 3년 동안의 분기별 판매량을 입력받아 
2차원 배열에 저장한 후 년도별, 분기별 판매량과 연
간판매량 누적판매량을 출력하는 프로그램을 작성
 */
import java.util.Scanner;

public class SalesVol {
	public SalesVol() {
		Scanner sc = new Scanner(System.in);
		int sales[][] = new int[3][4]; // 판매량
		int annual = 0; // 연간 판매량
		int cumulative = 0; // 누적 판매량
		String str[] = { "\t", "  1분기 ", " 2분기 ", " 3분기 ", " 4분기 ", " 연간판매량 ", " 누적판매량 " };

		// 분기별 판매량 입력
		for (int i = 0; i < sales.length; i++) {
			System.out.print((2019 + i) + "년도 : ");
			for (int j = 0; j < sales.length + 1; j++) {
				sales[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println("");

		// 년도별, 분기별 판매량과 연간판매량 누적판매량을 출력
		for (int i = 0; i < sales.length; i++) {
			System.out.print((2019 + i) + "년도 : "); // 년도 출력
			for (int j = 0; j < sales.length + 1; j++) {
				System.out.print(sales[i][j] + "   ");
				annual += sales[i][j];
			}
			cumulative += annual;
			System.out.print(" " + annual + "     ");
			System.out.println(cumulative);
		}
	}

	public static void main(String[] args) {
		new SalesVol();
	}

}
