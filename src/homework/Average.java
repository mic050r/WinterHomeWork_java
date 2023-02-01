package homework;
/* #문제 7번 정수 5개를 입력받아 배열에 저장하고 평균을 구하는 프로그램을 작성
<조건>
조건 1. 키보드를 통해서 입력받는다. 
조건 2. 결과는 소수점 이하 둘째자리까지 출력한다
 */
import java.util.Scanner;

public class Average {

	public Average() {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 수 : ");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		double avg = sum / num.length;
		System.out.printf("평균 : %.2f", avg);
	}

	public static void main(String[] args) {
		new Average();
	}

}
