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
		// �����boolean����
		boolean dr = true;
		String a5 = null;
		String a6 = null;
		int a7 = 0;
		boolean x = true;
		do {
			System.out.println("��ӭ�������ߴ�½���ٻ�ʦ��ִ����Ĳ���:1.ע��    2.��¼ ");
			int a = yyy.nextInt();
			boolean s = true;
			// ע���˺�
			if (a == 1) {
				zhanghusetget s1 = new zhanghusetget();
				do {
					System.out.println("���������û���");
					String a2 = yyy.next();
					if (a2.length() > 6) {
						System.out.println("�û������ܴ�����λ");
					} else if (jdbcyxlm.su1(a2)) {
						System.out.println("�û��Ѵ���");
					} else {
						s1.setName(a2);
						s = false;
					}
				} while (s);
				do {
					System.out.println("����������");
					String a3 = yyy.next();
					System.out.println("��ȷ������");
					String a4 = yyy.next();
					if (a3.equals(a4)) {
						s1.setMima(a4);
						jdbcyxlm.su(s1);
						System.out.println("��ϲ��ע��ɹ������μ�����û���������");
						x = false;
						// ��¼
						do {
							System.out.println("�ٻ�ʦ��ã�����������û���");
							a5 = yyy.next();
							System.out.println("�������������");
							a6 = yyy.next();
							if (jdbcyxlm.su1(a5) && jdbcyxlm.mima(a6)) {
								System.out.println("��¼�ɹ�");
								System.out.println("��ӭ���װ����û�" + a5);
								System.out.println(
										"��ѡ�����Ӣ��     1.̽�ռ�     2.��������֮��     3.�޼���ʥ     4.Ӱ��֮��     5.������     6.���罣��     7.���ѡ��");
								a7 = yyy.nextInt();
								Random id = new Random();
								if (a7 == 7) {
									a7 = (id.nextInt(6) + 1);
								}
								if (a7 == 1) {
									System.out.println("��ѡ��Ӣ��Ϊ̽�ռ�");
									dr = false;
								} else if (a7 == 2) {
									System.out.println("��ѡ��Ӣ��Ϊ����");
									dr = false;
								} else if (a7 == 3) {
									System.out.println("��ѡ��Ӣ��Ϊ��");
									dr = false;
								} else if (a7 == 4) {
									System.out.println("��ѡ��Ӣ��Ϊ��");
									dr = false;
								} else if (a7 == 5) {
									System.out.println("��ѡ��Ӣ��Ϊ������");
									dr = false;
								} else if (a7 == 6) {
									System.out.println("��ѡ��Ӣ��Ϊ����");
									dr = false;
								}
							} else {
								System.out.println("�û������������");
							}
						} while (dr);

					} else {
						System.out.println("�����������벻ͬ");
						x = true;
					}

				} while (x);
			} else if (a == 2) {
				// ��¼
				boolean sc = true;
				do {
					System.out.println("�ٻ�ʦ��ã�����������û���");
					a5 = yyy.next();
					System.out.println("�������������");
					a6 = yyy.next();
					if (jdbcyxlm.su1(a5) && jdbcyxlm.mima(a6)) {
						System.out.println("��¼�ɹ�");
						System.out.println("��ӭ���װ����û�" + a5);
						System.out.println(
								"��ѡ�����Ӣ��1.̽�ռ�     2.��������֮��     3.�޼���ʥ     4.Ӱ��֮��     5.������     6.���罣��     7.���ѡ��");
						a7 = yyy.nextInt();
						Random id = new Random();
						if (a7 == 7) {
							a7 = (id.nextInt(6) + 1);
						}
						if (a7 == 1) {
							System.out.println("��ѡ��Ӣ��Ϊ̽�ռ�");
						} else if (a7 == 2) {
							System.out.println("��ѡ��Ӣ��Ϊ����");
						} else if (a7 == 3) {
							System.out.println("��ѡ��Ӣ��Ϊ��");
						} else if (a7 == 4) {
							System.out.println("��ѡ��Ӣ��Ϊ��");
						} else if (a7 == 5) {
							System.out.println("��ѡ��Ӣ��Ϊ������");
						} else if (a7 == 6) {
							System.out.println("��ѡ��Ӣ��Ϊ����");

						}
						sc = false;
					} else {
						System.out.println("�û������������");
					}
				} while (sc);
			}
			x = false;
		} while (x);

		while (true) {
			System.out.println("�û�" + a5 + "��ִ����Ĳ���");
			System.out.println("1.�鿴Ӣ������       2.�̵�       3.������Ϸ");
			int a8 = yyy.nextInt();
			if (a8 == 1) {
				boolean py = true;
				while (py) {
					System.out.println("1.�鿴Ӣ��״̬     2.�鿴Ӣ��װ��     3.�鿴Ӣ�ۼ���     4������һ��");
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
					System.out.println("1.�鿴�̵��б�     2.������Ʒ     3.������һ��");
					int a10 = yyy.nextInt();
					if (a10 == 1) {
						jdbcyxlm.sc();
					} else if (a10 == 2) {
						// ������Ʒ
						System.out.println("��������Ҫ������Ʒ�ı��");
						zbsetget s1 = new zbsetget();
						int ss = yyy.nextInt();
						yingxiongsetget t = jdbcyxlm.chazao(a7);
						zhuangbeisetget t2 = jdbcyxlm.chazao3(ss);
						int av = t2.getPrice();
						if (av <= t.getPrice()) {
							int a1 = t.getPrice();
							int b1 = t2.getPrice();
							t.setPrice(a1 - b1);
							System.out.println("�������Ϊ" + t.getPrice());
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
								System.out.println("װ��������");
							}

						} else {
							System.out.println("��Ҳ���");
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
				System.out.println("���ѳɹ��˳���Ϸ");
				break;
			}
		}
	}
}
