package pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Job implements Serializable{
	private Integer jid;
	private String jname;
	private String remark;
	public Job() {
		super();
	}
	public Job(Integer jid, String jname, String remark) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.remark = remark;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
		return "job [jid=" + jid + ", jname=" + jname + ", remark=" + remark + "]";
	}
	
}
