package model;

public class yingxiongsetget {
	String name;
	int gjl;
	int fq;
	int fy;
	int Hp;
	int hx;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGjl() {
		return gjl;
	}
	public void setGjl(int gjl) {
		this.gjl = gjl;
	}
	public int getFq() {
		return fq;
	}
	public void setFq(int fq) {
		this.fq = fq;
	}
	public int getFy() {
		return fy;
	}
	public void setFy(int fy) {
		this.fy = fy;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getHx() {
		return hx;
	}
	public void setHx(int hx) {
		this.hx = hx;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ãû³Æ=" + name + ", Hp=" + Hp + ",·ÀÓùÁ¦=" + fy + ",½ðÇ®=" + price + "";
	}
	
}
