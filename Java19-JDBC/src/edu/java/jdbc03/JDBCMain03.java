package edu.java.jdbc03;

import java.sql.*;

import oracle.jdbc.OracleDriver;

class JDBCMain03 {

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

	public static void main(String[] args) {
		System.out.println("JDBC 3 - select");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 2. Oracle JDBC 드라이버를 메모리에 로드
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 로드 성공");

			// 3. DB와 Connection(연결)을 맺음
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");

			// 4. Connection 객체를 사용해서 Statement 객체를 생성
			stmt = conn.createStatement();

			// 5. SQL 문장 작성
			String sql_select = "select * from " + TABLE_NAME + " order by " + COL_CID;
			System.out.println(sql_select);

			// 6. SQL 문장 실행(DB서버로 SQL 전송)
			// executeUpdate() : INSERT, UPDATE, DELETE를 처리할 때
			// executeQuery() : SELECT를 처리할 때
			rs = stmt.executeQuery(sql_select);

			// 7. DB서버가 보낸 결과 확인/처리
			// ResultSet.next()
			// ResultSet에서 다음 행(row, 레코드)이 있으면
			// true를 리턴하고, ResultSet에서 가리키는 위치를 다음(Next) 위치로 변경 (= iterator가 유사한 구조)
			StringBuffer buffer = new StringBuffer();
			while (rs.next()) {
				int cid = rs.getInt(1); // cid 컬럼
				String name = rs.getString(2); // name 컬럼
				String phone = rs.getString(3); // phone 컬럼
				String email = rs.getString(4); // email 컬럼
				buffer.append(cid + " | ").append(name + " | ").append(phone + " | ").append(email + "\n");
			}

			System.out.println(buffer.toString());

			System.out.println("==================================================");
			// select 특정 데이터 검색
			// cid를 이용하여 홍길동의 데이터를 가져오는 SQL 쿼리 작성
			buffer.setLength(0); // buffer 초기화 (초기화하지 않으면 위의 전체 검색도 포함해서 데이터를 출력함)
			// buffer를 사용하지않고 아래 if문에서 sysout문을 이용하여 바로 출력하는 방법도 있다 - 가져올 데이터가 1행이기 때문에 가능.
			String sql_select_by_cid = "select * from " + TABLE_NAME + " where " + COL_CID + " = 2";
			System.out.println(sql_select_by_cid);

			rs = stmt.executeQuery(sql_select_by_cid);
			if (rs.next()) { // 첫번째 데이터(레코드)가 있으면
				int cid = rs.getInt(COL_CID); // cid 컬럼
				String name = rs.getString(COL_NAME); // name 컬럼
				String phone = rs.getString(COL_PHONE); // phone 컬럼
				String email = rs.getString(COL_EMAIL); // email 컬럼
				// 위와 다르게 메소드의 매개변수로 컬럼명을 전달하면 DB에서 컬럼의 순서가 바뀌더라도 컬럼명을 통해 데이터를 찾아감. (추천 코딩)

				buffer.append(cid + " | ").append(name + " | ").append(phone + " | ").append(email + "\n");

//				System.out.println("인덱스 : " + cid);
//				System.out.println("이름 : " + name);
//				System.out.println("전화번호 : " + phone);
//				System.out.println("이메일 : " + email);
			}
			System.out.println(buffer.toString());

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				// 생성한 리소스 해제
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} // end try-catch-finally

	}

}
