package pojo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Document implements Serializable{
	private Integer doid;
	private String title;
	private String filename;
	private String remark;
	private Date createdate;
	private String username;
	public Document() {
		super();
	}
	public Document(Integer doid, String title, String filename, String remark, Date createdate, String username) {
		super();
		this.doid = doid;
		this.title = title;
		this.filename = filename;
		this.remark = remark;
		this.createdate = createdate;
		this.username = username;
	}
	public Integer getDoid() {
		return doid;
	}
	public void setDoid(Integer doid) {
		this.doid = doid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
		return "document [doid=" + doid + ", title=" + title + ", filename=" + filename + ", remark=" + remark
				+ ", createdate=" + createdate + ", username=" + username + "]";
	}
	
}
