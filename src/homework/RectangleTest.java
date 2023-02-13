package homework;

/*
#문제 12번 사각형 두 곳의 좌표값을 통해 인스턴스 
①객체를 생성하고 ②좌표값을 출력하고 ③둘레를 구하며 ④넓이를 구하는 클래스(Rectangle)를 설계하라
조건 1. 멤버변수 : 사각형의 두 좌표 (x1, y1), (x2, y2) (x1,y1), (x2, y2) 
조건 2. ①~④까지의 각각의 메서드를 설계하라. 
조건 3. main구문은 다음과 같다. 
 */
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle t1 = new Rectangle(1, 1, 3, 3);
		t1.showRectangle();
		System.out.println("사각형의 둘레: " + t1.getRound());
		System.out.println("사각형의 넓이: " + t1.getArea());
	}

}
