package homework;

import java.util.Scanner;

/*
#문제 4번 양의 정수 10개를 입력받아 배열에 저장하고 제일 큰 수를 출력
<조건>
조건 1. 키보드를 통해서 입력받는다. 
조건 2. 양의 정수만 입력된다고 가정한다. 
 */
public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];

		// 10개 숫자 입력
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자 : ");
			num[i] = sc.nextInt();
		}

		// 가장 큰수 구하기
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("가장 큰 수 : " + max);
	}

}
