package homework;

import java.util.Scanner;

import javax.swing.JMenuBar;

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
class Account {
	Scanner sc = new Scanner(System.in);

	private String acc_Num; // 계좌번호
	private int deposit; // 입금액
	private int withdraw; // 출금액
	private int money = 0; // 총금액

	public Account() {
	}

	public Account(String acc_Num, int deposit, int withdraw, int money) {
		super();
		this.acc_Num = acc_Num;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.money = money;
	}

	public void printResult() {
		System.out.println("계좌번호 " + getAcc_Num() + "의 현재 잔액 : " + money);
	}

	
	public String getAcc_Num() {
		return acc_Num;
	}

	//계좌번호 입력
	public void setAcc_Num() {
		//this.acc_Num = acc_Num;
		System.out.print("계좌번호를 입력하세요 : ");
		acc_Num = sc.nextLine();
		printResult();
		empty();
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void deposit() {
		System.out.print("입금할 금액 : ");
		int d_Mon = sc.nextInt();
		money += d_Mon;
		printResult();
		empty();
	}

	public void withdraw() {
		System.out.print("출금할 금액 : ");
		int w_Mon = sc.nextInt();
		money -= w_Mon;
		printResult();
	}

	public void empty() {
		System.out.println("");
	}
	
	public void bar() {
		System.out.println("=======================================");
	}
}

public class AccountTest {

	
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.bar();
		a1.setAcc_Num();
		a1.deposit();
		a1.withdraw();
		a1.bar();
		
	}

}
