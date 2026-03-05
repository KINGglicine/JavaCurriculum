package curriculum.b;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

		int score ;
		score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}
		
		int age;
		age = 25;
		if (30 >= age && age >= 20) {
			System.out.println("適正年齢です");
		}else {
			System.out.println("対象外です");
		}
		
		age = 18;
		if (age >=20){
			System.out.println("成人です");
		} else if (19>=age && age>=13) {
			System.out.println("ティーンエイジャーです");
		}else {
			System.out.println("子供です");
		}
		
		int x,y,z ;
		x = 30;
		y = 15;
		z = 50;
		
		if (x>y && x>z) {
			System.out.println(x);
		}else if (y>x && y>z) {
			System.out.println(y);
		}else if (z>x && z>y) {
			System.out.println(z);
		}
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num>0) {
			System.out.println("正の数です");
		} else if (num==0) {
			System.out.println("0です");
		} else if (0>num) {
			System.out.println("負の数です");
		}
		
		int value = scanner.nextInt();
		if (value%2 ==0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}
		
		score = scanner.nextInt();
		if (score >= 90) {
			System.out.println("優");
		}else if(score >= 70) {
			System.out.println("良");
		}else if(score >= 50) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}

		
		
		scanner.close();
		
		
		
	}
}
