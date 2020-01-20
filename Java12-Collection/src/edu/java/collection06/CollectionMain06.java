package edu.java.collection06;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionMain06 {

	public static void main(String[] args) {
		// TreeSet<String> 객체 생성
		TreeSet<String> set = new TreeSet<String>();
		
		// 데이터 저장 : add(element)
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		// TreeSet<E>인 경우
		// iterator() : 오름차순 Iterator 객체 생성
		// descendingIterator() : 내림차순 Iterator 객체 생성
		//   -> HashSet<E>은 내림차순 Iterator가 없음
		
		// Iterator 객체를 사용한 데이터 출력
		Iterator<String> itr = set.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	} // end main

} // end CollectionMain06
