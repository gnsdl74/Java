package edu.java.rps01;

import java.util.Scanner;

public class GameMain01 {

	public static void main(String[] args) {
		// RPS(Rock, Paper, Scissors)
		
		// 가위바위보 게임
		// 1. 사용자에게 가위(1), 바위(2), 보(3) 중에서 선택하도록 하고, 선택 결과 저장
		// 2. 컴퓨터는 난수(1, 2, 3)을 발생시켜서 저장
		// 3. 게임의 로직
		// 1) if 사용자가 가위(1)을 냈을 때
		//    (1) if 컴퓨터가 가위(1)를 냈을 때
		//    (2) else if 컴퓨어가 바위(2)를 냈을 때
		//    (3) else 컴퓨터가 보(3)를 냈을 때
		// 2) else if 사용자가 바위(2)를 냈을 때
		//    (1) if 컴퓨터가 가위(1)를 냈을 때
		//    (2) else if 컴퓨어가 바위(2)를 냈을 때
		//    (3) else 컴퓨터가 보(3)를 냈을 때
		// 3) else 사용자가 보(3)를 냈을 때
		//    (1) if 컴퓨터가 가위(1)를 냈을 때
		//    (2) else if 컴퓨어가 바위(2)를 냈을 때
		//    (3) else 컴퓨터가 보(3)를 냈을 때
		
		// 1. 사용자의 선택을 입력받아서 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1) , 바위(2), 보(3) 선택 > ");
		int userChoice = sc.nextInt();
		sc.close();
		
		// 2. 컴퓨터의 선택을 난수로 저장
		int comChoice = (int)(3*Math.random()+1);
		System.out.println("com의 선택 : " + comChoice);
		
		// 3. 사용자와 컴퓨터의 승무패 판단
		if(userChoice == 1) {	// user 가위
			if(comChoice == 1) {
				System.out.println("비겼습니다.");
			} else if(comChoice == 2) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else {
				System.out.println("사용자가 이겼습니다.");
			}
			
		} else if(userChoice == 2) {	// user 바위
			if(comChoice == 1) {
				System.out.println("사용자가 이겼습니다.");
			} else if(comChoice == 2) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
			
		} else {	// user 보
			if(comChoice == 1) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else if(comChoice == 2) {
				System.out.println("사용자가 이겼습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
		}
		
		
	}	// end main()

}	// end GameMain01
