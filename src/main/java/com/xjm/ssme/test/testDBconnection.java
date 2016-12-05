package com.xjm.ssme.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class testDBconnection {
	
	@Test
	public void testDBConnection() throws IOException, ClassNotFoundException, SQLException{
		
		Properties p = new Properties();
		
		InputStream  is = this.getClass().getResourceAsStream("/db/db.properties");
		
		p.load(is);
		
		Class.forName(p.getProperty("jdbc_driver"));
		DriverManager.getConnection(p.getProperty("jdbc.url"),p.getProperty("jdbc.user"),p.getProperty("jdbc.password"));
		
	}
}
