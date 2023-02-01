package homework;

import java.util.Scanner;
/*
#문제 5 2차원 배열에 1,2 학기 성적을 다음과 같이 저장하고 3년간의 전체 평균 점수를 구하라
<조건>
조건 1. 키보드를 통해서 입력받는다. 
조건 2. 2차원 배열 score[3][2] 을 선언하라. 
조건 3. 평균 점수는 소수점 이하 둘째자리까지 출력
한다. 
 */
public class Grade2 {

	public Grade2() {
		Scanner sc = new Scanner(System.in);
		//선언
		int score[][] = new int[3][2]; // 성적 2차원 배열로 선언
		int sum = 0; // 총합 
		int cnt = 0; // 총 점수 갯수

		//점수 입력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < (score.length - 1); j++) {
				System.out.print((i + 1) + "학년 " + (j + 1) + "학기 점수 입력 : ");
				score[i][j] = sc.nextInt();
				sum += score[i][j];
				cnt++;
			}
		}

		// 평균 구하기
		double avg = sum / cnt;
		// 소수점 둘째자리까지
		System.out.printf("3년간 의 평균 \t : %.2f", avg);
		//commit 확인
	}

	public static void main(String[] args) {
		new Grade2();
	}
	
}
