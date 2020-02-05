package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JDBCMain04 {
	// 1. DB에 사용될 상수들
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // 접속할 오라클 DB 경로
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	// 이클립스와 연동할 DB의 사용자는 cmd를 통해서 계정 활성화 및 권한부여를하고 사용한다.

	// 프로그램에 사용될 테이블과 컬럼들을 상수로 설정
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";

	// insert ex_contact
	// values (contact_pk.nextval, ?, ?, ?)
	public static final String SQL_INSERT = "insert into " + TABLE_NAME + " values (contact_pk.nextval, ?, ?, ?)";
	// String을 제대로 썻는지 확인하기 위해 SQL_INSERT에 커서를 올리면 확인가능

	// delete : cid 번호로 검색해서 데이터 삭제
	// delete from ex_contact where cid = ?
	public static final String SQL_DELETE = "delete from " + TABLE_NAME + " where " + COL_CID + " = ?";

	// update ex_contact
	// set name = ?, phone = ?, email = ?
	// where cid = ?
	public static final String SQL_UPDATE = "update " + TABLE_NAME + " set " + COL_NAME + " = ?, " + COL_PHONE
			+ " = ?, " + COL_EMAIL + " = ? where " + COL_CID + " = ?";

	public static void main(String[] args) {
		// 키보드 입력 준비
		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;

		// 2. JDBC 드라이버를 등록(메모리에 로드)
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 등록 성공");

			// 3. DB 연결(Connection)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");

			// 4. PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(SQL_UPDATE);

			// 데이터를 입력받음
			System.out.println("수정할 인덱스 입력> ");
			int cid = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 입력된 엔터를 제거

			System.out.println("수정할 이름 입력> ");
			String name = sc.nextLine();

			System.out.println("수정할 전화번호 입력> ");
			String phone = sc.nextLine();

			System.out.println("수정할 이메일 입력> ");
			String email = sc.nextLine();

			// 5. SQL 문장을 완성 - SQL_UPDATE의 ?를 채워주는 코드
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			pstmt.setInt(4, cid);

			int result = pstmt.executeUpdate();

			System.out.println(result + "행이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				sc.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end try-catch-finally

	} // end main()

} // end JDBCMain04
