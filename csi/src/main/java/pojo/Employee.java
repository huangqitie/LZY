package pojo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	private Integer eid;
	private String dename;
	private String jname;
	private String name;
	private String card;
	private String addr;
	private String post;
	private String tel;
	private String phone;
	private String qq;
	private String email;
	private Integer gender;
	private String party;
	private Date birthday;
	private String race;
	private String edcation;
	private String speciality;
	private String hobby;
	private String remark;
	private Date createdate;
	public Employee() {
		super();
	}
	public Employee(Integer eid, String dename, String jname, String name, String card, String addr, String post,
			String tel, String phone, String qq, String email, Integer gender, String party, Date birthday, String race,
			String edcation, String speciality, String hobby, String remark, Date createdate) {
		super();
		this.eid = eid;
		this.dename = dename;
		this.jname = jname;
		this.name = name;
		this.card = card;
		this.addr = addr;
		this.post = post;
		this.tel = tel;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
		this.gender = gender;
		this.party = party;
		this.birthday = birthday;
		this.race = race;
		this.edcation = edcation;
		this.speciality = speciality;
		this.hobby = hobby;
		this.remark = remark;
		this.createdate = createdate;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEdcation() {
		return edcation;
	}
	public void setEdcation(String edcation) {
		this.edcation = edcation;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
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
		return "employee [eid=" + eid + ", dename=" + dename + ", jname=" + jname + ", name=" + name + ", card=" + card
				+ ", addr=" + addr + ", post=" + post + ", tel=" + tel + ", phone=" + phone + ", qq=" + qq + ", email="
				+ email + ", gender=" + gender + ", party=" + party + ", birthday=" + birthday + ", race=" + race
				+ ", edcation=" + edcation + ", speciality=" + speciality + ", hobby=" + hobby + ", remark=" + remark
				+ ", createdate=" + createdate + "]";
	}
	
}
