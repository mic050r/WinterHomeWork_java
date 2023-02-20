package homework;
/*
#문제 10번 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성
조건 1. 메서드 length(), charAt()를 필요에 따라 사용한다.
 */
import java.util.Scanner;

public class ReverseStrTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		String strF = sc.nextLine();
		ReverseStr s1 = new ReverseStr(strF);
		System.out.print("변환된 문자 : " + s1.charAt());
	}

}
