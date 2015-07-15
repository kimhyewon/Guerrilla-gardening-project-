package lilac.model;

public class User {
	private String id;
	private String password;
	private String nickName;
	private String phone;
	private String profileImg;

	public User() {
	}
	
	public User(String id, String password, String nickName, String phone, String profileImg) {
		super();
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.phone = phone;
		this.profileImg = profileImg;
	}


	public User(String id, String password) {
		this(id, password, null, null, null);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	
	public boolean update(User user) {
		boolean result = false;
		if (!this.phone.equals(user.phone)) {
			this.phone = user.phone;
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", nickName=" + nickName + ", phone=" + phone + ", profileImg=" + profileImg + "]";
	}
}
