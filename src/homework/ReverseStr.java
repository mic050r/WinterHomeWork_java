package homework;

/*
#문제 10번 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성
조건 1. 메서드 length(), charAt()를 필요에 따라 사용한다.
 */
public class ReverseStr {
	private String strF;

	public ReverseStr() {
	}

	public ReverseStr(String strF) {
		super();
		this.strF = strF;
	}

	public String getLength() {
		return strF;
	}

	// StringBuffer / reverse() 메소드 사용하기
	public StringBuffer charAt() {
		StringBuffer strR = new StringBuffer(strF);
		String reverse = strR.reverse().toString();
		return strR;
	}

	/*
	 반복문 사용하기 
	 public String charAt(){ 
	 	String reverse = ""; 
	 	for (int i = strF.length() - 1; i >= 0; i--) { 
	 		reverse = reverse + strF.charAt(i); 
	 	}
	 	return reverse; 
	 }
	 */
}
