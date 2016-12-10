package com.example.bean;

public class Binglis {
	private int id;
	private String sex;
	private int age;
	private String keshi;
	private String name;
	private String idcard;
	private String bingqu;
	private String zhuyuanhao;
	private String marriage;
	private String address;
	private String intotime;
	private String zhusu;
	private String nowhistory;
	private String marriagehistory;
	private String oldhistory;
	public Binglis() {
		super();
	}
	public Binglis(int id, String sex, int age, String keshi, String name,
			String idcard, String bingqu, String zhuyuanhao, String marriage,
			String address, String intotime, String zhusu, String nowhistory,
			String marriagehistory, String oldhistory) {
		super();
		this.id = id;
		this.sex = sex;
		this.age = age;
		this.keshi = keshi;
		this.name = name;
		this.idcard = idcard;
		this.bingqu = bingqu;
		this.zhuyuanhao = zhuyuanhao;
		this.marriage = marriage;
		this.address = address;
		this.intotime = intotime;
		this.zhusu = zhusu;
		this.nowhistory = nowhistory;
		this.marriagehistory = marriagehistory;
		this.oldhistory = oldhistory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKeshi() {
		return keshi;
	}
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getBingqu() {
		return bingqu;
	}
	public void setBingqu(String bingqu) {
		this.bingqu = bingqu;
	}
	public String getZhuyuanhao() {
		return zhuyuanhao;
	}
	public void setZhuyuanhao(String zhuyuanhao) {
		this.zhuyuanhao = zhuyuanhao;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIntotime() {
		return intotime;
	}
	public void setIntotime(String intotime) {
		this.intotime = intotime;
	}
	public String getZhusu() {
		return zhusu;
	}
	public void setZhusu(String zhusu) {
		this.zhusu = zhusu;
	}
	public String getNowhistory() {
		return nowhistory;
	}
	public void setNowhistory(String nowhistory) {
		this.nowhistory = nowhistory;
	}
	public String getMarriagehistory() {
		return marriagehistory;
	}
	public void setMarriagehistory(String marriagehistory) {
		this.marriagehistory = marriagehistory;
	}
	public String getOldhistory() {
		return oldhistory;
	}
	public void setOldhistory(String oldhistory) {
		this.oldhistory = oldhistory;
	}
	@Override
	public String toString() {
		return "Bingli [id=" + id + ", sex=" + sex + ", age=" + age
				+ ", keshi=" + keshi + ", name=" + name + ", idcard=" + idcard
				+ ", bingqu=" + bingqu + ", zhuyuanhao=" + zhuyuanhao
				+ ", marriage=" + marriage + ", address=" + address
				+ ", intotime=" + intotime + ", zhusu=" + zhusu
				+ ", nowhistory=" + nowhistory + ", marriagehistory="
				+ marriagehistory + ", oldhistory=" + oldhistory + "]";
	}
	

}
