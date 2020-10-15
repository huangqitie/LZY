package pojo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Notice implements Serializable{
	private Integer nid;
	private String title;
	private String content;
	private Date createdate;
	private String username;
	public Notice() {
		super();
	}
	public Notice(Integer nid, String title, String content, Date createdate, String username) {
		super();
		this.nid = nid;
		this.title = title;
		this.content = content;
		this.createdate = createdate;
		this.username = username;
	}
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
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
		return "notice [nid=" + nid + ", title=" + title + ", content=" + content + ", createdate=" + createdate
				+ ", username=" + username + "]";
	}
	
}
