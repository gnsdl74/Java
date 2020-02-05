package edu.java.jdbc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JDBCMain05 {
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

	// select : cid 번호로 검색해서 데이터 선택
	// select * from ex_contact where cid = ?
	public static final String SQL_SELECT_BY_CID = "select * from " + TABLE_NAME + " where " + COL_CID + " = ?";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 등록 성공");

			// 3. DB 연결(Connection)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");

			// 4. PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(SQL_SELECT_BY_CID);

			// 데이터를 입력받음
			System.out.println("검색할 인덱스 입력> ");
			int cid = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 입력된 엔터를 제거

			// 5. SQL 문장을 완성 - SQL_UPDATE의 ?를 채워주는 코드
			pstmt.setInt(1, cid);

			// 6. SQL 문장 실행(DB 서버로 전송)
			rs = pstmt.executeQuery();
			
			// 7. 결과 확인
			if (rs.next()) {
//				cid = rs.getInt(COL_CID);
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);

//				System.out.println("인덱스 : " + cid);
				System.out.println("이름 : " + name);
				System.out.println("전화번호 : " + phone);
				System.out.println("이메일 : " + email);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				sc.close();
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end try-catch-finally

	} // end main()

} // end JDBCMain05
