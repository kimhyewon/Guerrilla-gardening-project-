package lilac.model;

import java.sql.Timestamp;

public class Article {
	private int id;
	private String userId;
	private String title;
	private String content;
	private String beforeImg;
	private String afterImg;
	private String address;
	private int recruitCount;
	private int nowCount;
	private Timestamp articleTime;

	public Article() {
	}

	public Article(int id, String userId, String title, String content, String beforeImg, String afterImg, String address, int recruitCount, int nowCount, Timestamp articleTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.beforeImg = beforeImg;
		this.afterImg = afterImg;
		this.address = address;
		this.recruitCount = recruitCount;
		this.nowCount = nowCount;
		this.articleTime = articleTime;
	}

	public Article(String userId, String title, String content, String beforeImg, String afterImg, String address, int recruitCount, int nowCount) {
		this(0, userId, title, content, beforeImg, afterImg, address, recruitCount, nowCount, null);
	}
	
	public Article(String title, String content, String beforeImg, String afterImg, String address, int recruitCount, int nowCount) {
		this(0, null, title, content, beforeImg, afterImg, address, recruitCount, nowCount, null);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getBeforeImg() {
		return beforeImg;
	}

	public void setBeforeImg(String beforeImg) {
		this.beforeImg = beforeImg;
	}
	
	public String getAfterImg() {
		return afterImg;
	}

	public void setAfterImg(String afterImg) {
		this.afterImg = afterImg;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getNowCount() {
		return nowCount;
	}

	public void setNowCount(int nowCount) {
		this.nowCount = nowCount;
	}
	
	public int getRecruitCount() {
		return recruitCount;
	}

	public void setRecruitCount(int recruitCount) {
		this.recruitCount = recruitCount;
	}
	
	public Timestamp getArticleTime() {
		return articleTime;
	}

	public void setArticleTime(Timestamp articleTime) {
		this.articleTime = articleTime;
	}

	public boolean update(Article temp) {
		boolean result = false;
		if (!this.title.equals(temp.title)) {
			this.title = temp.title;
			result = true;
		}
		if (!this.content.equals(temp.content)) {
			this.content = temp.content;
			result = true;
		}
		return result;
	}

}




