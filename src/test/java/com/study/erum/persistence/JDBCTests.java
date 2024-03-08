package com.study.erum.persistence;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testConnection() {
		try ( Connection con = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE",//xe 대문자 소문자 상관없음.
						"webdb",
						"12345"
						)) {
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
}
