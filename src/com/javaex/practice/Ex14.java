package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요."+"\t"+"(단위:\"만 원\")");
		System.out.print("금익: ");
		double earn = sc.nextDouble();
		
		if(earn<=1000 && earn>=0) {
			System.out.println("소득세는 "+(earn*0.09)+" 입니다.");
		}
		else if(earn>1000 && earn<=4000) {
			System.out.println("소득세는 "+((1000*0.09)+(0.18*(earn-1000))+" 입니다."));
		}
		else if(earn>4000 && earn<8000) {
			System.out.println("소득세는 "+((1000*0.09)+(3000*0.18)+(0.27*(earn-4000)))+" 입니다.");
		}
		else if(earn>8000) {
			System.out.println("소득세는 "+((1000*0.09)+(3000*0.18)+(0.27*4000)+(0.36*(earn-8000)))+" 입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
		
	}

}
