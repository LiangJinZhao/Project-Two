package cn.itcast.springboot;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Test {

	// 注入DataSource
	@Autowired
	private DataSource dataSource;
	
	@org.junit.Test
	public void test() {
		try {
			System.out.println("111111111111111111111111111111");
			Connection connection = dataSource.getConnection();
			System.out.println("222222222222222222222222222222" + connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
