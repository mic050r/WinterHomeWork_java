package homework;

/*
#문제 9번 정수의 사칙연산(+, - , * , /)을 처리하는 계산기(Calculate)클래스를 설계하라
조건 1. 멤버변수 : int 타입의 필드 a, b
조건 2. 사칙연산 및 계산결과를 출력하는 메서드를 각각 설계하라(메서드는 최소 5개 이상). 
조건 3. 생성자 메서드는 두 개의 필드 값을 갖는다. 
조건 4. main구문은 다음과 같다. 
*/
public class Calculate {
	// 멤버변수 선언
	private int a;
	private int b;

	public Calculate() {
	}

	// 생성자 메소드
	public Calculate(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	// 더하기 메소드
	public int getPlus() {
		return a + b;
	}

	// 뺴기 메소드
	public int getMinus() {
		return a - b;
	}

	// 곱하기 메소드
	public int getMulti() {
		return a * b;
	}

	// 나누기 메소드
	public int getDivision() {
		return a / b;
	}

	// 결과 출력 메소드
	public void printResult() {
		System.out.println("===두 수의 사칙 연산 결과===");
		System.out.println(a + " + " + b + " = " + getPlus());
		System.out.println(a + " - " + b + " = " + getMinus());
		System.out.println(a + " * " + b + " = " + getMulti());
		System.out.println(a + " / " + b + " = " + getDivision());
	}

}
