package pojo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class User implements Serializable{
	private Integer uid;
	private String loginname;
	private String password;
	private Integer status;
	private Date createdate;
	private String username;
	private String dename;
	private String jname;
	private String faceurl;
	private String facepath;
	public User() {
		super();
	}
	
	public User(String password) {
		super();
		this.password = password;
	}

	public User(Integer uid, String loginname, String password, Integer status, Date createdate, String username,
			String dename, String jname, String faceurl, String facepath) {
		super();
		this.uid = uid;
		this.loginname = loginname;
		this.password = password;
		this.status = status;
		this.createdate = createdate;
		this.username = username;
		this.dename = dename;
		this.jname = jname;
		this.faceurl = faceurl;
		this.facepath = facepath;
	}

	public User(String loginname, String password) {
		super();
		this.loginname = loginname;
		this.password = password;
	}
	
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDename() {
		return dename;
	}

	public void setDename(String dename) {
		this.dename = dename;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public String getFaceurl() {
		return faceurl;
	}

	public void setFaceurl(String faceurl) {
		this.faceurl = faceurl;
	}

	public String getFacepath() {
		return facepath;
	}

	public void setFacepath(String facepath) {
		this.facepath = facepath;
	}

	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", loginname=" + loginname + ", password=" + password + ", status=" + status
				+ ", createdate=" + createdate + ", username=" + username + ", dename=" + dename + ", jname=" + jname
				+ ", faceurl=" + faceurl + ", facepath=" + facepath + "]";
	}
	
	
}
