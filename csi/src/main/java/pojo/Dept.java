package pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable{
	private Integer deid;
	private String dename;
	private String remark;
	public Dept() {
		super();
	}
	public Dept(Integer deid, String dename, String remark) {
		super();
		this.deid = deid;
		this.dename = dename;
		this.remark = remark;
	}
	public Integer getDeid() {
		return deid;
	}
	public void setDeid(Integer deid) {
		this.deid = deid;
	}
	public String getDename() {
		return dename;
	}
	public void setDename(String dename) {
		this.dename = dename;
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
		return "dept [deid=" + deid + ", dename=" + dename + ", remark=" + remark + "]";
	}
	
}
