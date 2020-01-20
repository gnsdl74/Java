package edu.java.string06;

public class StringMain06 {

	public static void main(String[] args) {
		String str = "사과:배:바나나:복숭아";
		String[] list = str.split(":");

		StringBuffer bf = new StringBuffer();
		for (String x : list) {
			bf.append(x);
		} // end for
		System.out.println(bf);
	
	} // end main()

} // end StringMain06
