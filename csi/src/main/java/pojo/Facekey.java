package pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Facekey implements Serializable{
	private Integer fid;
	private String appid;
	private String apikey;
	private String secretkey;
	private Integer threshold;
	public Facekey() {
		super();
	}
	public Facekey(Integer fid, String appid, String apikey, String secretkey, Integer threshold) {
		super();
		this.fid = fid;
		this.appid = appid;
		this.apikey = apikey;
		this.secretkey = secretkey;
		this.threshold = threshold;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public String getSecretkey() {
		return secretkey;
	}
	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}
	public Integer getThreshold() {
		return threshold;
	}
	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
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
		return "facekey [fid=" + fid + ", appid=" + appid + ", apikey=" + apikey + ", secretkey=" + secretkey
				+ ", threshold=" + threshold + "]";
	}
	
}
