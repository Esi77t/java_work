package ex04_array;

import java.util.Random;
import java.util.Scanner;

public class EXAM01 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		// 배열에 각각의 index에 1 ~ 10를 할당하고
		// 총합을 구하여 출력
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			iArr[i] += i + 1;
			sum += iArr[i];
		}
		System.out.println("총 합 : " + sum);
		System.out.println("---------------------------------------------------");
		
		// iArr에 각 index에 난수를 넣고
		// 배열의 짝수 요소들의 총합 구하기
		Random r = new Random();
		sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = r.nextInt(30) + 1;
			if(iArr[i] % 2 == 0) {
				sum += iArr[i];
			}
		}
		System.out.println("짝 수의 합 : " + sum);
		System.out.println("---------------------------------------------------");
		
		int[] nums = {5, 7, 2, 9, 4, 10, 3};
		int max = nums[0];
		int min = nums[0];
		// 배열에서 최대값과 최소값을 출력하는 프로그램 만들기
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) max = nums[i];
			if(nums[i] < min) min = nums[i];
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		System.out.println("---------------------------------------------------");
		
		int[] nums2 = {1, 2, 1, 3, 2, 1, 4};
		// 위 배열에서 각 숫자가 몇 번 나왔는지 출력
		// 1 : 3번
		// 2 : 2번
		// 3 : 1번
		// 4 : 1번
		int cnt1, cnt2, cnt3, cnt4;
		cnt1 = 0;
		cnt2 = 0;
		cnt3 = 0;
		cnt4 = 0;
		for(int i = 0; i < nums2.length; i++) {
			switch(nums2[i]) {
				case 1:
					cnt1 += 1;
					break;
				case 2:
					cnt2 += 1;
					break;
				case 3:
					cnt3 += 1;
					break;
				case 4:
					cnt4 += 1;
					break;
			}
		}
		System.out.println("1 : " + cnt1 + "번");
		System.out.println("2 : " + cnt2 + "번");
		System.out.println("3 : " + cnt3 + "번");
		System.out.println("4 : " + cnt4 + "번");
		System.out.println("---------------------------------------------------");
		
		int[] nums3 = {5, 3, 8, 4, 2};
		// 오름차순으로 정렬
		// 1. 버블 정렬
		for(int i = 0; i < nums3.length; i++) {
			for(int j = i + 1; j < nums3.length; j++) {
				if(nums3[i] > nums3[j]) {
					int temp = nums3[i];
					nums3[i] = nums3[j];
					nums3[j] = temp;
				}
			}
			System.out.print(nums3[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		// 배열에서 영문자만 추출하여 이어붙여 출력
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		for(int i = 0; i < cards.length; i++) {
			if((cards[i] >= 'A' && cards[i] <='Z') || (cards[i] >= 'a' && cards[i] <='z')) {
				myWord += cards[i];
			}
		}
		System.out.println("단어 : " + myWord);
		System.out.println("---------------------------------------------------");
		
		// 키보드에서 배열의 길이를 입력받고 입력받은 배열의 길이 만큼 알파벳을 넣고 출력
		// 배열의 길이 : 5
		// ABCDE
		// 배열의 길이 : 3
		// ABC
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int length = sc.nextInt();
		char[] ch = new char[length];
		for(int i = 0; i < ch.length; i++) {
			ch[i] += 'A' + i;
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		// 동전의 개수 구하기
		// 10 ~ 5000 사이의 난수를 변수에 담는다
		// 1의 자리는 반드시 0이 되도록 한다
		// 발생된 난수를 각 동전으로 바꿀 때 볓개 씩 필요한지 판단하여 작성
		// 가능한 적은 수의 동전을 사용
		int[] coin = {500, 100, 50, 10};
		int money = r.nextInt(500) + 1;
		money *= 10;
		System.out.println(money + "원");
		for(int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			System.out.println(coin[i] + "원 동전 개수 : " + res + "개");
			money %= coin[i];
		}
	}
}



