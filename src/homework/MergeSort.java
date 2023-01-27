package homework;
/* #문제 1번 배열 A(5)와 B(5)에 데이터를 입력받아 두 배열을 병
합하여 오름차순으로 정렬한 후 중복없이 출력하는 
프로그램을 작성하시오
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MergeSort {

	public MergeSort() {
		Scanner sc = new Scanner(System.in);

		// 입력받을 데이터 선언
		int a[] = new int[5]; // a 배열 선언
		int b[] = new int[5]; // b 배열 선언
		int sum[] = new int[a.length + b.length]; // a와b 값을 전부 넣을 sum 배열 선언

		// 입력
		System.out.print("첫 번쨰 배열의 데이터 : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum[i] = a[i];
		}

		System.out.print("두 번째 배열의 데이터 : ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			sum[i + a.length] = b[i];
		}

		// 오름 차순 정렬
		Arrays.sort(sum);

		// 중복 제거하기
		int cnt = 0;
		for (int i = 1; i < sum.length; i++) {
			if (sum[i - 1] == sum[i]) {
				cnt++;// 중복 개수 확인
			}
		}

		int result[] = new int[sum.length - cnt];// 중복된 개수만큼 sum의 길이에서 빼기
		int rIdx = 0; // result의 인덱스값
		result[0] = sum[0]; // result[0]에 먼저 sum[0] 값을 넣어주기
		for (int i = 1; i < sum.length; i++) {
			if (result[rIdx] == sum[i])
				continue; // 같다면
			result[++rIdx] = sum[i];
		}

		System.out.print("병합된 배열의 데이터 : ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		new MergeSort();
	}

}
