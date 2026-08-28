import java.util.List;

import dao.UserDao;
import dto.User;

public class UserMain {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
//		User user = new User("hong", "홍길동");
//		userDao.insertUser(user);
		
//		user.setName("퐁퐁퐁");
//		userDao.updateUser(user);
		
//		userDao.deleteUser("pong");
		
//		User user = userDao.selectUser("song");
//		System.out.println(user);
		
		List<User> list = userDao.selectUserList();
		for(User u: list) {
			System.out.println(u);
		}

	}

}
