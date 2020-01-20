package edu.java.date02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain02 {

	public static void main(String[] args) {
		// 날짜를 원하는 형식(format)으로 출력
		Date currentDate = new Date();	// 현재 시간을 선언
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // 시간형식을 선언
		String dateString = sdf.format(currentDate); // 현재 시간을 해당 형식으로 format한 후 문자열 저장
		System.out.println(dateString); // 현재 시간이 저장된 문자열 출력
		
		sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		dateString = sdf.format(currentDate);
		System.out.println(dateString);
		
	} // end main()

} // end DateMain02
