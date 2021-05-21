package test;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import model.User;
import service.UserService;

public class TestEvn {
	
	@Test
	public void TestEvn() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring.xml");
		SqlSessionFactory s = (SqlSessionFactory) ctx.getBean("sqlSessionFactoryBean");
		System.out.println(s.openSession().getConnection());
		
	}
	
	@Test
	public void TestDao() {
		
	
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring.xml");
			
			UserDao list = (UserDao) ctx.getBean("userDao");
			
			List<User> list1 = list.FindAllUser();
			
			System.out.println(list1);
			
	}
	@Test
	public void TestService() {
		
	
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring.xml");
			
			UserService list = (UserService) ctx.getBean("userService");
			
			List<User> list1 = list.FindAllUser();
			
			System.out.println(list1);
			
	}
}
