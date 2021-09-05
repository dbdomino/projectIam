package org.onpups.security;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//JAVA setting
//@ContextConfiguration(classes= {RootConfig.class, ServletConfig.class})
@WebAppConfiguration 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml","file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class MemberTests {
	
//	@Setter(onMethod_ = @Autowired)
//	private PasswordEncoder pwencoder;
	
	static {
		try {
			Class cls= Class.forName("com.mysql.cj.jdbc.Driver");
			log.info("클래스 리딩");
			log.info(cls);
		} catch(Exception e) {
			log.info("클래스 리딩실패");
			e.printStackTrace();
		}
	}
	
	
//	@Test
	public void testUpdateMember() {
//		String sql = "insert into tbl_member(userid, userpw, username) values (?, ?, ?)";
		String sql = "update table_user set password=? where num = ? ";
		log.info("------------------------------------------------------------");
		for (int i = 1; i < 12; i++ ) {
//		for (int i = 0; i < 100; i++ ) {
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try {
				con= DriverManager.getConnection("jdbc:mysql://www.onpups.pe.kr:3306/onpups", "bae", "1q2w3e4r");
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, "qaqaqaqa");
				pstmt.setInt(2, i);
				
				log.info("process insert "+i);
				pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				if (pstmt != null) {try {pstmt.close(); } catch (Exception e) {} }
				if (con != null) {try {con.close(); } catch (Exception e) {} }
			}
			
		} // end for
			 
	}
	
//	@Test
	public void testInsertAuth() {
		String sql = "insert into tbl_member_auth(userid, auth) values (?, ?)";
		
		for (int i = 0; i < 100; i++ ) {
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try {
//				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				
				if (i < 80) {
					pstmt.setString(1, "user"+i);
					pstmt.setString(2, "ROLE_USER");
				} else if (i < 90) {
					pstmt.setString(1, "manager"+i);
					pstmt.setString(2, "ROLE_MEMBER");
				} else {
					pstmt.setString(1, "admin"+i);
					pstmt.setString(2, "ROLE_ADMIN");
				}
				log.info("process insert "+i);
				pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				if (pstmt != null) {try {pstmt.close(); } catch (Exception e) {} }
				if (con != null) {try {con.close(); } catch (Exception e) {} }
			}
			
		} // end for
			 
	}
	
	
	@Test
	public void testConnection() {
		
		try( Connection con= DriverManager.getConnection("jdbc:log4jdbc:mariadb://www.onpups.pe.kr:3306/onpups", "bae", "1q2w3e4r")  	) {
			log.info(con);
			con.close();
		} catch(Exception e) {
			fail(e.getMessage());
		} finally {
			
		}
		
	}
}


