package edu.java.jdbc01;

import java.sql.*;

import oracle.jdbc.OracleDriver;

/*
 * JDBC : Java DataBase Connection
 * 0. 데이터베이스 라이브러리를 프로젝트에 추가
 *    1) 프로젝트에 lib 폴더를 생성
 *    2) C:\Users\goott\product\11.2.0\dbhome_1\jdbc\lib
 *    또는 (오라클 설치 경로)\product\11.2.0\dbhome_1\jdbc\lib (OracleDB 11g home 기준)
 *    폴더에 있는 ojbdc5/jar 파일을 lib 폴더에 복사
 *    3) 복사한 jar 파일(라이브러리)를 빌드 패스에 추가(Add to build path)
 * 1. DB와 연동하기 위해서 필요한 상수들을 정의(세팅)
 * 2. JDBC 드라이버를 메모리에 로드
 * 3. DB와 Connection(연결)을 맺음
 * 4. Connection 객체를 사용해서 Statement 객체를 생성
 * 5. SQL 문장을 작성
 * 6. Statement 객체를 사용해서 SQL 문장을 실행(DB 서버로 SQL 문장을 전송)
 * 7. DB 서버가 보내준 결과를 확인/처리
 */
public class JDBCMain01 {
	// 1. DB에 사용될 상수들
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // 접속할 오라클 DB 경로
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	// 이클립스와 연동할 DB의 사용자는 cmd를 통해서 계정 활성화 및 권한부여를하고 사용한다.

	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";

	public static void main(String[] args) {
		System.out.println("JDBC 1 - insert");

		Connection conn = null;
		Statement stmt = null;

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
			String sql_insert = "insert into " + TABLE_NAME
					+ " values (contact_pk.nextval, 'aaa', '010-111-1111', 'test@test.com')";
			System.out.println(sql_insert);

			// 6. SQL 문장 실행(DB서버로 SQL 전송)
			int result = stmt.executeUpdate(sql_insert);

			// 7. DB서버가 보낸 결과 확인/처리
			System.out.println(result + "행이 삽입됐습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} // end try-catch-finally

	} // end main()

} // end JDBCMain01
