package lilac.model;

public class Peer {
	private String userId;
	private int articleId;

	public Peer() {
	}

	public Peer(String userId, int articleId) {
		super();
		this.userId = userId;
		this.articleId = articleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
//
//	@Override
//	public String toString() {
//		return "ArticleComment [articleId=" + articleId + ", userId=" + userId + ", commentTime=" + commentTime + ", content=" + content + "]";
//	}
}
