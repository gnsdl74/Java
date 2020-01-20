package edu.java.string07;

import java.util.regex.Pattern;

public class StringMain07 {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// (02|010) : 02 또는 010으로 시작
		// - : '-'기호 확인
		// \d{3,4} : 3~4자리의 숫자
		// \d{4} : 4자리의 숫자
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);	// matches(형식, 데이터) : 데이터가 주어진 형식에 맞는지 확인 (맞으면 true, 틀리면 false)
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		} // end if-else
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// \w+ : 한 개 이상의 알파벳 또는 숫자
		// @ : @가 존재하는지
		// \w+ : 한 개 이상의 알파벳 또는 숫자
		// \. : .이 존재하는지
		// \w+ : 한 개 이상의 알파벳 또는 숫자
		// (\.\w+)? : \.\w+ 가 없거나 한 번 더 올 수 있음
		data = "test@test.co.kr";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		} // end if-else
		
	} // end main()

} // end StringMain07
