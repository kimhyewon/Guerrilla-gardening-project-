package lilac.service;

import java.util.List;

import lilac.dao.ArticleCommentDao;
import lilac.dao.ArticleDao;
import lilac.model.Article;
import lilac.model.ArticleComment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import core.exception.ForignKeyException;
import core.exception.InsertTargetRecordNotFoundException;

@Service
@Transactional
public class ArticleService {
	@Autowired
	private ArticleDao articleDao;
	@Autowired
	private ArticleCommentDao articleCommentDao;

	public void insertArticle(Article article) throws InsertTargetRecordNotFoundException {
		articleDao.insert(article);
	}

	public List<Article> getArticles() {
		return articleDao.selectAll();
	}

	public Article getArticle(int articleId) {
		return articleDao.selectByPk(articleId);
	}

	public List<ArticleComment> getComments(int articleId) {
		return articleCommentDao.findByArticle(articleId);
	}

	public void insertArticleCommnet(ArticleComment articleComment) throws InsertTargetRecordNotFoundException {
		Article article = articleDao.selectByPk(articleComment.getArticleId());
		if (article == null) {
			throw new InsertTargetRecordNotFoundException("댓글 등록 대상 게시물이 존재하지 않습니다.");
		}
		articleCommentDao.insert(articleComment);
	}

	public void deleteArticleComment(int articleId, String userId, String commentTime) {
		articleCommentDao.remove(articleId, userId, commentTime);
	}

	public void deleteArticle(int articleId) {
		List<ArticleComment> comments = articleCommentDao.findByArticle(articleId);
		for (ArticleComment articleComment : comments) {
			if(!articleComment.getUserId().equals(articleId)) {
				throw new ForignKeyException("다른 사람의 댓글이 있어 지울수 없습니다.");
			}
		}
		articleDao.remove(articleId);
	}

	public void updateArticle(Article article) {
		Article articleFromDao = articleDao.selectByPk(article.getId());
		if (articleFromDao == null) throw new InsertTargetRecordNotFoundException("글이 없습니다.");
		if(!articleFromDao.update(article)) throw new InsertTargetRecordNotFoundException("바꿀 정보가 없습니다");
		articleDao.update(articleFromDao);
	}

	public void deleteArticleComment(ArticleComment articleComment) {
		articleCommentDao.removeByPk(articleComment);
	}
}
