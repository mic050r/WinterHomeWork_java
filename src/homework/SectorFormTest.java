package homework;

import java.util.Scanner;

/*
#문제 3번 중심 각도가 90도인 부채꼴을 위한 클래스를 정의하고, 반지름을 입력받아, 부채꼴을 생성하여 
부채꼴의 둘레와 면적을 계산하여 출력하는 프로그램을 작성
<조건>
부채꼴의 둘레와 면적을 계산하여 출력하는 프로그램을 작성
조건 1. 클래스내에 다음 메서드를 작성하여 처리한다. 
부채꼴의 면적 계산 메서드 : double area([매개변수]) 
부채꼴의 둘레 계산 메서드 : double circum([매개변수]) 
조건 2. 소수점 아래 출력되도록 한다.
 */

public class SectorFormTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.print("반지름 입력 : ");
		r = sc.nextDouble();
		SectorForm s1 = new SectorForm(r);
		System.out.println("반지름이 " + r + "인 부채꼴의 면적 : " + s1.getArea());
		System.out.println("반지름이 " + r + "인 부채꼴의 둘레 : " + s1.getCircum());
	}
}
