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

	public String getAcc_Num() {
		return acc_Num;
	}

	public void setAcc_Num() {
		bar();
		System.out.print("계좌번호를 입력하세요 : ");
		this.acc_Num = sc.nextLine();
		printResult();
		empty();
	}

	public int getMoney() {
		return money;
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
		if (money < w_Mon) {
			System.out.println("출금하려는 계좌의 잔액이 부족하여 출금이 불가능합니다");
		} else {
			money -= w_Mon;
		}

		printResult();
	}

	public void empty() {
		System.out.println("");
	}

	public void bar() {
		System.out.println("=======================================");
	}

	public void printResult() {
		System.out.println("계좌번호 " + getAcc_Num() + "의 현재 잔액 : " + money);
	}
}

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String bar[] = { "\t계좌번호 \t\t", " 잔액" };
		// 계좌번호 리스트
		String acc_Num[] = new String[3];
		// 잔액 리스트
		int balance[] = new int[3];

		// 고객1
		Account a1 = new Account();
		a1.setAcc_Num();
		a1.deposit();
		a1.withdraw();
		acc_Num[0] = a1.getAcc_Num();
		balance[0] = a1.getMoney();

		// 고객2
		Account a2 = new Account();
		a2.setAcc_Num();
		a2.deposit();
		a2.withdraw();
		acc_Num[1] = a2.getAcc_Num();
		balance[1] = a2.getMoney();

		// 고객3
		Account a3 = new Account();
		a3.setAcc_Num();
		a3.deposit();
		a3.withdraw();
		acc_Num[2] = a3.getAcc_Num();
		balance[2] = a3.getMoney();

		a1.bar();
		for (int i = 0; i < bar.length; i++) {
			System.out.print(bar[i]);
		}
		a1.empty();
		a1.bar();

		// 반복문
		for (int i = 0; i < 3; i++) {
			System.out.println("\t" + acc_Num[i] + "\t\t" + balance[i]);
		}
		a1.bar();
	}

}
