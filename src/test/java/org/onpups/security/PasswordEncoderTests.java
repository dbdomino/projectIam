package org.onpups.security;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@WebAppConfiguration 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class PasswordEncoderTests {
//	@Autowired
//	private PasswordEncoder pwencoder;
	
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

