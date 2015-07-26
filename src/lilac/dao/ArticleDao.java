package lilac.dao;

import java.util.List;

import lilac.model.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	--private int id;
//	--	private String userId;
//	--	private String title;
//	--	private String content;
//	--	private String beforeImg;
//	--	private String afterImg;
//	--	private String address;
//	--	private int recruitCount;
//	--	private int nowCount;
//	--	private Timestamp articleTime;
	//데모를 위해 임시 주석 처리. 원래는 이 코드 써야 함. 
//	public void insert2(final Article article) {
//		String sql = "insert into ARTICLE values(null, ?, ?, ?, ?, ?, ?, ?, null, null)";
//		jdbcTemplate.update(sql, "user1", article.getTitle(), article.getContent(), article.getBeforeImg(), article.getAfterImg(), article.getAddress(), article.getRecruitCount());
//	}

	public void insert(Article article) {
		String sql = "insert into ARTICLE values(null, ?, ?, ?, null, null, ?, 0, 0, null)";
		jdbcTemplate.update(sql, "user1", article.getTitle(), article.getContent(), article.getAddress());
	}
//beforeImg, afterImg, recruitCount, nowCount 을 넣어주지 않음. 
//로그인 기능 없기 때문에 userId에 user1을 임의로 넣어줌. 구현 후 getUserId로 불러와야 함. 
//id, articleTime은 원래 null값 입력하면 됨. 
	
	public Article selectByPk(int articleId) {
		String sql = "select * from ARTICLE where ID=?";
		try {
			return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Article>(Article.class), articleId);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public List<Article> selectAll() {
		String sql = "select * from ARTICLE order by ID DESC";
		try {
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Article>(Article.class));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public void update(Article article) {
		String sql = "update ARTICLE set TITLE=?, CONTENT=?, BEFORE_IMG=?, AFTER_IMG=?, ADDRESS=?, RECRUIT_COUNT=?, NOW_COUNT=? where ID=?";
		jdbcTemplate.update(sql, article.getTitle(), article.getContent(), article.getId());
	}

	public void remove(int articleId) {
		String sql = "delete from ARTICLE where ID=?";
		jdbcTemplate.update(sql, articleId);
	}
}
