package homework;
/* 배열 A(5)와 B(5)에 데이터를 입력받아 두 배열을 병
합하여 오름차순으로 정렬한 후 중복없이 출력하는 
프로그램을 작성하시오
 */

import java.util.Scanner;
import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5]; //a 배열 선언
		int b[] = new int[5]; //b 배열 선언
		int sum[] = new int[a.length + b.length]; //a와b 값을 전부 넣을 sum 배열 선언
		//int i; //i 선언
		//입력
		System.out.print("첫 번쨰 배열의 데이터 : ");
		for(int i= 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum[i] = a[i];
		}
		
		System.out.print("두 번째 배열의 데이터 : ");
		for(int i= 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			sum[i + a.length] = b[i];
		}
		
		//정렬
		Arrays.sort(sum);
		
		for (int i : sum) {
			System.out.print(sum[i] + "  ");
		}
	}

}
