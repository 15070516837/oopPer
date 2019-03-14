package model;

public class zhuangbeisetget {
	int Uid;
	String name;
	int gjsx;
	int fqsx;
	int fysx;
	int Hpsx;
	int hxsx;
	int price;
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGjsx() {
		return gjsx;
	}
	public void setGjsx(int gjsx) {
		this.gjsx = gjsx;
	}
	public int getFqsx() {
		return fqsx;
	}
	public void setFqsx(int fqsx) {
		this.fqsx = fqsx;
	}
	public int getFysx() {
		return fysx;
	}
	public void setFysx(int fysx) {
		this.fysx = fysx;
	}
	public int getHpsx() {
		return Hpsx;
	}
	public void setHpsx(int hpsx) {
		Hpsx = hpsx;
	}
	public int getHxsx() {
		return hxsx;
	}
	public void setHxsx(int hxsx) {
		this.hxsx = hxsx;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "装备 攻击力=" + gjsx + ", 防御=" + fysx
				+ ", 血量=" + Hpsx + ", 金钱=" + price + "";
	}
	
}
