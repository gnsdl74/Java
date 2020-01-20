package edu.java.collection07;

import java.util.*;

/* List<E>, Set<E> : 한 가지 타입의 데이터를 저장할 수 있는 Collection

 * Map<K, V> : Key-Value 쌍으로 데이터를 저장하는 구조
 *  1. Key는 중복되지 않는 값만 저장 가능
 *  2. Value는 중복된 값도 저장 가능
 *  3. 검색, 수정, 삭제할 때 Key값을 사용함

 * Map<K, V>
 * |_ HashMap<K, V>, TreeMap<K, V>

 * HashMap<K, V> : 검색을 빠르게 하기 위한 Hash 알고리즘이 적용된 Map
 * TreeMap<K, V> : 정렬을 빠르게 하기 위한 Tree 알고리즘이 적용된 Map   
*/
public class CollectionMain07 {

	public static void main(String[] args) {
		// HashMap<Integer, String> 객체 생성
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// Map<K, V>에 데이터 저장 : put(key, value)
		map.put(10, "아귀");
		map.put(16, "짝귀");
		map.put(22, "마귀");
		map.put(22, "평경장");
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>의 데이터 하나 검색 : get(key)
		// - 해당 key 값의 value를 리턴
		System.out.println(map.get(10));
		System.out.println(map.get(22));
		
		System.out.println();
		// Map<K, V>에서 데이터를 수정 : put(key, value)
		map.put(10, "조까치");
		System.out.println(map.get(10));
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>에서 데이터를 삭제 : remove(key)
		map.remove(10);
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>에서 key들로만 이루어진 Set을 생성 : KeySet()
		Set<Integer> keySet = map.keySet(); // 오름차순 키 set
//		map.descendingKeySet(); // 내림차순 키 set
		
		System.out.println(keySet);
		for(Integer key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
	} // end main()

} // end ColeectionMain07
