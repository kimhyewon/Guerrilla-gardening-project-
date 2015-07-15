package lilac.service;

import java.util.HashMap;
import java.util.Map;

import lilac.dao.UserDao;
import lilac.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;

	public Map<String, Object> getUserInfo(String userId) {
		Map<String, Object> userInfo = new HashMap<String, Object>();
		User user = userDao.selectUserById(userId);
		userInfo.put("user", user);

		return userInfo;
	}

	@Transactional
	public void insertUser(User user) throws DuplicateKeyException {
		User tempUser = userDao.selectUserById(user.getId());
		if (tempUser != null) {
			throw new DuplicateKeyException("이미 가입된 사용자입니다.");
		}
		userDao.insert(user);
	}

	public User selectUserById(String userId) {
		return userDao.selectUserById(userId);
	}
	
	public void updateUser(User userFromEdit) {
		User user = userDao.selectUserById(userFromEdit.getId());
		if (user.update(userFromEdit)) {
			userDao.updateUser(userFromEdit);
		}
	}
	
	public void DeleteUser(String userId) {
		userDao.removeUser(userId);
	}
}
