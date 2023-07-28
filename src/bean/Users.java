package bean;

public class Users {

	private int uid;
	private String nickname;
    private String name;
    private String password;
	private String phonenumber;
	private String phonenumberorname;

    public Users() {
    	
    }
    
    public Users(String name,String password) {
    	this.name = name;
    	this.password = password;
    }
    
    public Users(int uid,String name,String password) {
    	this.uid = uid;
    	this.name = name;
    	this.password = password;
    }
    
    public Users(int uid, String name, String password, String phonenumber) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.phonenumber = phonenumber;
	}
    
	public Users(int uid, String name, String password, String phonenumber, String phonenumberorname) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.phonenumber = phonenumber;
		this.phonenumberorname = phonenumberorname;
	}
    
	public Users(int uid, String nickname, String name, String password, String phonenumber, String phonenumberorname) {
		super();
		this.uid = uid;
		this.nickname = nickname;
		this.name = name;
		this.password = password;
		this.phonenumber = phonenumber;
		this.phonenumberorname = phonenumberorname;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPhonenumberorname() {
		return phonenumberorname;
	}

	public void setPhonenumberorname(String phonenumberorname) {
		this.phonenumberorname = phonenumberorname;
	}
   

    
}
