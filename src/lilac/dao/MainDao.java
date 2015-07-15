package lilac.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MainDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(String url) {
		String sql = "insert into BLOG values(?)";
		jdbcTemplate.update(sql, url);
	}
}
