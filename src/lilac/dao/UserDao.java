package lilac.dao;

import lilac.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(final User user) {
		String sql = "insert into USER values(?, ?, ?, ?, ? ,now(), null, 'F', ?)";
		jdbcTemplate.update(sql, user.getId(), user.getPassword(), user.getNickName(), user.getPhone(), user.getProfileImg());
	}

	public void updateUser(final User user) {
		String sql = "update USER set PHONE = ?, ADDRESS = ? where ID = ?";
		jdbcTemplate.update(sql, user.getPhone(), user.getProfileImg(), user.getId());
	}

	public User selectUserById(final String userId) {
		String sql = "select * from USER where ID=?";
		try {
			return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), userId);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public void removeUser(final String userId) {
		String sql = "delete from User where ID = ?";
		jdbcTemplate.update(sql, userId);
	}
}
