package org.onpups.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			Class cls= Class.forName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
			log.info("클래스 리딩");
			log.info(cls);
		} catch(Exception e) {
			log.info("클래스 리딩실패");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try( Connection con= DriverManager.getConnection("jdbc:log4jdbc:mariadb://www.onpups.pe.kr:3306/onpups", "bae", "1q2w3e4r")  	) {
			log.info(con);
			log.info("빠세 접속잘되나? 잘되면 이거뜸");
			con.close();
		} catch(Exception e) {
			log.info("빠세 접속잘되나? 안되면 이거뜸");
			fail(e.getMessage());
		} finally {
			
		}
		
	}
}

