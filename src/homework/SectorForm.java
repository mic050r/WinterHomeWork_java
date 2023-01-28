package homework;

import java.util.Scanner;

/*
조건 1. 클래스내에 다음 메서드를 작성하여 처리한다. 
부채꼴의 면적 계산 메서드 : double area([매개변수]) 
부채꼴의 둘레 계산 메서드 : double circum([매개변수]) 
조건 2. 소수점 아래 출력되도록 한다.
 */

public class SectorForm {

	private double r;
	final private double PI = 3.14;

	public SectorForm() {
	}

	public SectorForm(double r) {
		this.r = r;
	}

	// 부채꼴 면적 구하는 방법 : 원의 넓이 * 중심각/360
	public double getArea() {
		return this.r * r * PI * 0.25;
	}

	// 부채꼴의 호의 길이 = 원의 둘레*중심각/360
	public double getCircum() {
		return this.r * 2 * PI * 0.25;
	}

}
