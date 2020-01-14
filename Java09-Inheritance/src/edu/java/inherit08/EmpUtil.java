package edu.java.inherit08;

public class EmpUtil {
	// Employee
	// |_ Manager 
	public static void printEmpInfo(Employee emp) {
		if (emp instanceof Manager) {
			Manager m = (Manager) emp; // 강제 형변환(casting)
			System.out.println("이름 : " + m.getName());
			System.out.println("직책 : " + m.getType());
		} else if (emp instanceof Employee) {
			System.out.println("이름 : " + emp.getName());
		} else {
			System.out.println("직원이 아닙니다.");
		}
	} // end printEmpInfo()
} // end EmpUtil
