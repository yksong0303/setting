package com.test.sp;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test {

	
	@Autowired
	SqlSessionFactory ssf;
	@Test
	public void test() {
		
		assertNotNull(ssf);
	}
	

}
