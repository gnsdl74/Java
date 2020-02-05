package edu.java.contact06_1;

// JDBC에서 사용될 상ㅅ들, SQL 문장들을 정의
public interface OracleQuery {
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
	
	// select * from ex_contact order by name
	public static final String SQL_SELECT = 
			"select * from "+ TABLE_NAME +" order by "+ COL_NAME;
	
	// select * from ex_contact where name = ?
	public static final String SQL_SELECT_BY_NAME =
			"select * from "+ TABLE_NAME +" where "+ COL_NAME +" = ?";
	
	// insert into ex_contact
	// values (contact_pk.nextval, ?, ?, ?)
	public static final String SQL_INSERT =
			"insert into "+ TABLE_NAME +" values (contact_pk.nextval, ?, ?, ?)";
	
	// update ex_contact
	// set phone = ?, email = ?
	// where cid = ?
	public static final String SQL_UPDATE = 
			"update "+ TABLE_NAME +" set " + COL_NAME +" = ?, " + COL_PHONE +" = ?, "+ COL_EMAIL +" = ? where "+ COL_CID +" = ?";
	
	// delete from ex_contact where cid= ?
	public static final String SQL_DELETE =
			"delete from "+ TABLE_NAME +" where "+ COL_CID +" = ?";
}
