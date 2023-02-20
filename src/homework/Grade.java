package homework;

import java.util.Scanner;

/*
#문제 2번 학생 수를 입력받아 한 학급의 성적을 처리하는 프로그램을 작성
<조건>
조건 1. 학생별 점수 3개를 입력받아 2차원 배열에 저장한다. 
조건 2. 각 학생은 시험을 3번 본 다음 그 중 가장 좋은 점수(최고점)를 가지고 평점을 계산한다. 
조건 3. 최고점이 90점 이상이면 5, 80점 이상이면 4, 70점 이상이면 3, 60점 이상이면 2, 그 나머지는 1로 한다. 
조건 4. 한 학급의 인원수(학생수)는 입력을 받는다. 조건 5. 100보다 크거나 0보다 작은 수 입력하면 ‘다시 입력하세요==> ’ 메시지 출력!
 */
public class Grade {

	public Grade() {
		Scanner sc = new Scanner(System.in);
		int st_Num; //학생수

		//학생 수 입력
		System.out.print("학생수 입력 : ");
		st_Num = sc.nextInt();
		
		//점수 3개 입력
		int st_Sco[][] = new int[st_Num][3];
		for (int i = 0; i < st_Sco.length; i++) {
			for (int j = 0; j < st_Sco.length; j++) {
				System.out.print("점수" + (j + 1) + "입력 : ");
				st_Sco[i][j] = sc.nextInt();
				if(st_Sco[i][j]<0) {
					System.out.print("다시 입력하세요 ===>");
					j -= 1;
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		new Grade();
	}

}
