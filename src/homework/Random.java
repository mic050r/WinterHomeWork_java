package homework;

/*
#문제 11번 
2차원 배열 random[4][4]을 생성하고, 
이 곳에 1~10까지의 범위의 정수를 랜덤하게 생성하여 
정수 16개를 배열에 저장한 후 화면에 출력

<조건>
조건 1. 참고 ) 자바에서 0~0.999999 중에 하나의 수를 리턴해주는 함수 : Math.random()
조건 2. getRandom()메서드를 이용하여 처리하라. 
조건 3. main구문은 다음과 같다
 */
public class Random {

	public static void main(String[] args) {
		int[][] random = new int[4][4];
		getRandom(random);
	}

	private static void getRandom(int[][] random) {
		for (int i = 0; i < random.length; i++) {
			for (int j = 0; j < random.length; j++) {
				random[i][j] = (int) (Math.random() * 10) + 1;
				System.out.print(random[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
