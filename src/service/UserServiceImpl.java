package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.User;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao dao;

	public List<User> FindAllUser() {
		
		
		return dao.FindAllUser();
	}

}
