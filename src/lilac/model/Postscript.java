package lilac.model;

import java.sql.Timestamp;

public class Postscript {
	private int id;
	private int articleId;
	private String title;
	private String content;
	private Timestamp postscriptTime;

	public Postscript() {
	}

	public Postscript(int id, int articleId, String title, String content, Timestamp postscriptTime) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.postscriptTime = postscriptTime;
	}

	public Postscript(int articleId, String title, String content) {
		this(0, articleId, title, content, null);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getPostscriptTime() {
		return postscriptTime;
	}

	public void setPostscriptTime(Timestamp postscriptTime) {
		this.postscriptTime = postscriptTime;
	}

	
//	@Override
//	public String toString() {
//		return "ArticleComment [articleId=" + articleId + ", userId=" + userId + ", commentTime=" + commentTime + ", content=" + content + "]";
//	}
}
