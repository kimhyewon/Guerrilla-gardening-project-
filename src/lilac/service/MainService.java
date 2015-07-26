package lilac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lilac.dao.ArticleDao;
import lilac.model.Article;

@Service
@Transactional
public class MainService {
	@Autowired
	private ArticleDao articleDao;
	
	public List<Article> getArticles() {
		return articleDao.selectAll();
		
	}
}
