package homework;

/*
#문제 12번 사각형 두 곳의 좌표값을 통해 인스턴스 
①객체를 생성하고 ②좌표값을 출력하고 ③둘레를 구하며 ④넓이를 구하는 클래스(Rectangle)를 설계하라
조건 1. 멤버변수 : 사각형의 두 좌표 (x1, y1), (x2, y2) (x1,y1), (x2, y2) 
조건 2. ①~④까지의 각각의 메서드를 설계하라. 
조건 3. main구문은 다음과 같다. 
 */
public class Rectangle {

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Rectangle() {
	}

	public Rectangle(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	//사각형의 둘레 구하기
	public int getRound() {
		return 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2)); //절댓값 함수 : Math.abs()이용하기
	}

	//사각형의 넓이 구하기
	public int getArea() {
		return Math.abs(x1 - x2) * Math.abs(y1 - y2);
	}

	public void showRectangle() {
		System.out.println("사각형의 좌표는 왼쪽 위 (" + x1 + "," + y1 + ")");
		System.out.println("사각형의 좌표는 오른쪽 위 (" + x2 + "," + y2 + ")");
	}

}
