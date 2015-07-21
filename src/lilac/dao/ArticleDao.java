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

	public void insert(final Article article) {
		String sql = "insert into ARTICLE values(null, ?, ?, ?, ?, ?, ?, null, ?, null)";
		jdbcTemplate.update(sql, "user1", article.getTitle(), article.getContent(), article.getBeforeImg(), article.getAfterImg(), article.getAddress(), article.getRecruitCount());
	}

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
