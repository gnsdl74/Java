package edu.java.contact06;

import java.sql.*;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class ContactDAOImple implements ContactDAO, OracleQuery {
	// start singleton
	private static ContactDAOImple instance;
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	private ContactDAOImple() {
		// DB 연결 초기화
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 연결 성공");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // end ContactDAOImple() - 생성자

	public static ContactDAOImple getInstance() {
		if (instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	// end singleton

	// conn, stmt 리소스 해제 함수
	private void closeResource(Connection conn, Statement stmt) {
		try {
			if(conn != null) {
				try {conn.close();} catch (Exception ce) {}
			}
			if(stmt != null) {
				try {stmt.close();} catch (Exception pe) {}
			}
		} catch (Exception e) {
			
		}
	} // end closerResource
	
	// conn, stmt, rs 리소스 해제 함수
	private void closeResource(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(conn != null) {
				try {conn.close();} catch (Exception ce) {}
			}
			if(stmt != null) {
				try {stmt.close();} catch (Exception pe) {}
			}
			if(rs != null) {
				try {rs.close();} catch (Exception re) {}
			}
		} catch (Exception e) {
			
		}
	} // end closerResource
	
	@Override
	public int insert(ContactVO vo) {
		// DB에 데이터(vo) 저장
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			closeResource(conn, pstmt);
		}
		return result;
	} // end insert()

	@Override
	public ArrayList<ContactVO> select() {
		// DB에서 연락처 전체 데이터 가져오기
		ArrayList<ContactVO> list = new ArrayList<ContactVO>();
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(SQL_SELECT);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				int cid = rs.getInt(COL_CID);
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);
				
				ContactVO vo = new ContactVO(name, phone, email);
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
				closeResource(conn, pstmt, rs);
		}
		return list;
	} // end selectAll()

	@Override
	public ContactVO select(int index) {
		// index 번호(cid)로 데이터 검색하여 결과 리턴(vo)
		ContactVO vo = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(SQL_SELECT_BY_CID);
			pstmt.setInt(1, index);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);
				
				vo = new ContactVO(name, phone, email);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
				closeResource(conn, pstmt, rs);
			}
		return vo;
	} // end select_By_Index()

	@Override
	public int update(int index, ContactVO vo) {
		// index 번호(cid)로 검색한 위치에 데이터(vo) 수정
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			pstmt.setInt(4, index);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			closeResource(conn, pstmt);
		}
		return result;
	} // end update()

	@Override
	public int delete(int index) {
		// index(cid)로 데이터 삭제
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(SQL_DELETE);
			pstmt.setInt(1, index);
			
			result = pstmt.executeUpdate(); 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(conn, pstmt);
		}
		return result;
	} // end delete()

} // end ContactDAOImple
