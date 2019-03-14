package uiStest;

import java.util.*;

import BllDemo.jdbcyxlm;
import model.yingxiongsetget;
import model.yxjineng;
import model.zbsetget;
import model.zhanghusetget;
import model.zhuangbeisetget;

public class ui1 {
	public static void main(String[] args) {
		Scanner yyy = new Scanner(System.in);
		// 登入的boolean类型
		boolean dr = true;
		String a5 = null;
		String a6 = null;
		int a7 = 0;
		boolean x = true;
		do {
			System.out.println("欢迎来到王者大陆，召唤师请执行你的操作:1.注册    2.登录 ");
			int a = yyy.nextInt();
			boolean s = true;
			// 注册账号
			if (a == 1) {
				zhanghusetget s1 = new zhanghusetget();
				do {
					System.out.println("请你输入用户名");
					String a2 = yyy.next();
					if (a2.length() > 6) {
						System.out.println("用户名不能大于六位");
					} else if (jdbcyxlm.su1(a2)) {
						System.out.println("用户已存在");
					} else {
						s1.setName(a2);
						s = false;
					}
				} while (s);
				do {
					System.out.println("请输入密码");
					String a3 = yyy.next();
					System.out.println("请确认密码");
					String a4 = yyy.next();
					if (a3.equals(a4)) {
						s1.setMima(a4);
						jdbcyxlm.su(s1);
						System.out.println("恭喜你注册成功，请牢记你的用户名与密码");
						x = false;
						// 登录
						do {
							System.out.println("召唤师你好，请输入你的用户名");
							a5 = yyy.next();
							System.out.println("请输入你的密码");
							a6 = yyy.next();
							if (jdbcyxlm.su1(a5) && jdbcyxlm.mima(a6)) {
								System.out.println("登录成功");
								System.out.println("欢迎您亲爱的用户" + a5);
								System.out.println(
										"请选择你的英雄     1.探险家     2.德玛西亚之力     3.无极剑圣     4.影流之主     5.卡萨丁     6.疾风剑豪     7.随机选择");
								a7 = yyy.nextInt();
								Random id = new Random();
								if (a7 == 7) {
									a7 = (id.nextInt(6) + 1);
								}
								if (a7 == 1) {
									System.out.println("你选的英雄为探险家");
									dr = false;
								} else if (a7 == 2) {
									System.out.println("你选的英雄为盖伦");
									dr = false;
								} else if (a7 == 3) {
									System.out.println("你选的英雄为易");
									dr = false;
								} else if (a7 == 4) {
									System.out.println("你选的英雄为劫");
									dr = false;
								} else if (a7 == 5) {
									System.out.println("你选的英雄为卡萨丁");
									dr = false;
								} else if (a7 == 6) {
									System.out.println("你选的英雄为亚索");
									dr = false;
								}
							} else {
								System.out.println("用户名或密码错误");
							}
						} while (dr);

					} else {
						System.out.println("两次输入密码不同");
						x = true;
					}

				} while (x);
			} else if (a == 2) {
				// 登录
				boolean sc = true;
				do {
					System.out.println("召唤师你好，请输入你的用户名");
					a5 = yyy.next();
					System.out.println("请输入你的密码");
					a6 = yyy.next();
					if (jdbcyxlm.su1(a5) && jdbcyxlm.mima(a6)) {
						System.out.println("登录成功");
						System.out.println("欢迎您亲爱的用户" + a5);
						System.out.println(
								"请选择你的英雄1.探险家     2.德玛西亚之力     3.无极剑圣     4.影流之主     5.卡萨丁     6.疾风剑豪     7.随机选择");
						a7 = yyy.nextInt();
						Random id = new Random();
						if (a7 == 7) {
							a7 = (id.nextInt(6) + 1);
						}
						if (a7 == 1) {
							System.out.println("你选的英雄为探险家");
						} else if (a7 == 2) {
							System.out.println("你选的英雄为盖伦");
						} else if (a7 == 3) {
							System.out.println("你选的英雄为易");
						} else if (a7 == 4) {
							System.out.println("你选的英雄为劫");
						} else if (a7 == 5) {
							System.out.println("你选的英雄为卡萨丁");
						} else if (a7 == 6) {
							System.out.println("你选的英雄为亚索");

						}
						sc = false;
					} else {
						System.out.println("用户名或密码错误");
					}
				} while (sc);
			}
			x = false;
		} while (x);

		while (true) {
			System.out.println("用户" + a5 + "请执行你的操作");
			System.out.println("1.查看英雄属性       2.商店       3.结束游戏");
			int a8 = yyy.nextInt();
			if (a8 == 1) {
				boolean py = true;
				while (py) {
					System.out.println("1.查看英雄状态     2.查看英雄装备     3.查看英雄技能     4返回上一级");
					int a9 = yyy.nextInt();
					if (a9 == 1) {
						yingxiongsetget t = jdbcyxlm.chazao(a7);
						System.out.println(t);
					} else if (a9 == 2) {

						if (a7 == 1) {
							zbsetget t = jdbcyxlm.zb(1);
							System.out.println(t);
						} else if (a7 == 2) {
							zbsetget t = jdbcyxlm.zb(2);
							System.out.println(t);
						} else if (a7 == 3) {
							zbsetget t = jdbcyxlm.zb(3);
							System.out.println(t);
						} else if (a7 == 4) {
							zbsetget t = jdbcyxlm.zb(4);
							System.out.println(t);
						} else if (a7 == 5) {
							zbsetget t = jdbcyxlm.zb(5);
							System.out.println(t);
						} else if (a7 == 6) {
							zbsetget t = jdbcyxlm.zb(6);
							System.out.println(t);
						}

					} else if (a9 == 3) {
						if (a7 == 2) {
							yxjineng.demo1();
						} else if (a7 == 1) {
							yxjineng.ez();
						} else if (a7 == 3) {
							yxjineng.js();
						} else if (a7 == 4) {
							yxjineng.jie();
						} else if (a7 == 5) {
							yxjineng.ksd();
						} else if (a7 == 6) {
							yxjineng.ys();
						}
					} else if (a9 == 4) {
						py = false;
					}
				}
			} else if (a8 == 2) {
				boolean py1 = true;
				while (py1) {
					System.out.println("1.查看商店列表     2.购买商品     3.反回上一级");
					int a10 = yyy.nextInt();
					if (a10 == 1) {
						jdbcyxlm.sc();
					} else if (a10 == 2) {
						// 购买商品
						System.out.println("请输入你要购买商品的编号");
						zbsetget s1 = new zbsetget();
						int ss = yyy.nextInt();
						yingxiongsetget t = jdbcyxlm.chazao(a7);
						zhuangbeisetget t2 = jdbcyxlm.chazao3(ss);
						int av = t2.getPrice();
						if (av <= t.getPrice()) {
							int a1 = t.getPrice();
							int b1 = t2.getPrice();
							t.setPrice(a1 - b1);
							System.out.println("您的余额为" + t.getPrice());
							s1 = jdbcyxlm.zb(a7);
							if (s1.getZbei1() == null) {
								System.out.println("zb1");
								s1.setZbei1(t2.getName());
								jdbcyxlm.zbtese(s1, a7);
							} else if (s1.getZbei2() == null) {
								System.out.println("zb2");
								s1.setZbei2(t2.getName());
								jdbcyxlm.zbtese(s1, a7);
							} else if (s1.getZbei3() == null) {
								System.out.println("zb3");
								s1.setZbei3(t2.getName());
								jdbcyxlm.zbtese(s1, a7);
							} else if (s1.getZbei4() == null) {
								System.out.println("zb4");
								s1.setZbei4(t2.getName());
								jdbcyxlm.zbtese(s1, a7);
							} else {
								System.out.println("装备槽已满");
							}

						} else {
							System.out.println("金币不足");
						}
						if (t.getFy() > 0) {
							int b = t2.getFysx();
							int a = t.getFy();
							t.setFy(b + a);
						}
						if (t.getHp() > 0) {
							int a2 = t.getHp();
							int b2 = t2.getHpsx();
							t.setHp(a2 + b2);
						}
						jdbcyxlm.updata(t, a7);

					} else if (a10 == 3) {
						py1 = false;
					}
				}
			} else if (a8 == 3) {
				System.out.println("你已成功退出游戏");
				break;
			}
		}
	}
}
