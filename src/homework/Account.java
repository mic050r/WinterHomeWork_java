package homework;

import java.util.Scanner;

/*
#문제 6번 계좌를 위한 클래스를 정의하고, 계좌번호와 입금액
과 출금액 입력받아 예시와 같이 잔액을 출력하는 프로
그램을 작성
<조건>
조건 1. 클래스내에 다음 메서드를 작성하여 처리한다. 
입금 메서드 : void deposit([매개변수]) 
출금 메서드 : void withdraw([매개변수]) 
출력 메서드(입출금 후 계좌번호 ***의 현재 잔액 : &&&& 메시지 출력하는 메서드) 이용
 */
class Acount {
	private String acc_Num; // 계좌번호
	private int deposit; // 입금액
	private int withdraw; // 출금액

	public Acount() {
	}

	public Acount(String acc_Num, int deposit, int withdraw) {
		super();
		this.acc_Num = acc_Num;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	@Override
	public String toString() {
		return "Acount [acc_Num=" + acc_Num + ", deposit=" + deposit + ", withdraw=" + withdraw + "]";
	}

}

public class Account {

	public static void main(String[] args) {

	}

}
