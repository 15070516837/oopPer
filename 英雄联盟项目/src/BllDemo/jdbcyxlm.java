package BllDemo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.yingxiongsetget;
import model.zbsetget;
import model.zhanghusetget;
import model.zhuangbeisetget;




public class jdbcyxlm extends jdbcyxlmtest{
	
	//��ʾ���ݿ�����
	public static void sc() {
		Connection connection=null;
		Statement createStatement=null;
		try {
			//��������
			Class.forName(jdbcyxlmtest.ul);
			//�������ݿ�������˻�
			connection = DriverManager.getConnection(jdbcyxlmtest.url,jdbcyxlmtest.user, jdbcyxlmtest.password);
			//����һ��createStatement����connection
			createStatement = connection.createStatement();
			//ִ�����ݿ����
			String sru="select * from zb";
			//ִ�����ݿ�Ż�һ������
			ResultSet srun=createStatement.executeQuery(sru);
			//��ӡ���ݿ����������
			while(srun.next()) {
				System.out.println("id:"+srun.getInt("Uid")+"  װ����:"+srun.getString("name")+"  ��������:"+srun.getInt("gjsx")+"   ��ǿ����"+srun.getInt("fqsx")+"   ��������"+srun.getInt("fysx")+"   Ѫ������"+srun.getInt("Hpsx")+"   ��Ѫ����"+srun.getInt("hxsx")+"   װ����Ǯ"+srun.getInt("price"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
	}
	//�˻����������ӷ���
	public static void su(zhanghusetget s) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			//��������
			//�������ݿ�������˻�
			connection=jdbcyxlmtest.su();
			//����һ��createStatement����connection
			createStatement = connection.createStatement();
			//ִ�����ݿ����
			String sru="insert into denlu values('"+s.getName()+"','"+s.getMima()+"')";
			//ִ�����ݿ�Ż�һ������
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		
	}
	
	//�������ݿ��е��˺ŵķ���
	public static boolean su1(String a) {
		boolean s=false;
		Connection connection=null;
		Statement createStatement=null;
			try {
				connection=jdbcyxlmtest.su();
				createStatement = connection.createStatement();
				String sru = "select * from denlu where name='"+a+"'";
				ResultSet executeQuery = createStatement.executeQuery(sru);
				if (executeQuery.next()) {
					return s=true;
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		return s;
		
	}
	//��������ķ���
	public static boolean mima(String a) {
		boolean s=false;
		Connection connection=null;
		Statement createStatement=null;
			// TODO Auto-generated method stub
			try {
				connection=jdbcyxlmtest.su();
				createStatement = connection.createStatement();
				String sru = "select * from denlu where mima='"+a+"'";
				ResultSet executeQuery = createStatement.executeQuery(sru);
				if (executeQuery.next()) {
					return s=true;
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		return s;
		
	}
	//���Ҳ���Ӣ�۵ķ���
	public static yingxiongsetget chazao(int ss) {
		Connection connection=null;
		Statement createStatement=null;
			// TODO Auto-generated method stub
				try {
					connection=jdbcyxlmtest.su();
					createStatement = connection.createStatement();
					String sru = "select * from yx where id=" +ss+ "";
					ResultSet executeQuery = createStatement.executeQuery(sru);
					yingxiongsetget s1 = new yingxiongsetget();
					if (executeQuery.next()) {
						s1.setName(executeQuery.getString("name"));
						s1.setHp(executeQuery.getInt("Hp"));
						s1.setGjl(executeQuery.getInt("gjl"));
						s1.setFy(executeQuery.getInt("fy"));
						s1.setPrice(executeQuery.getInt("price"));
						return s1;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				jdbcyxlmtest.sfzy(connection, createStatement);
				return null;	
	}
	//���Ҳ���װ���ķ���
	public static zhuangbeisetget chazao3(int ss) {
			Connection connection=null;
			Statement createStatement=null;
				// TODO Auto-generated method stub
					try {
						connection=jdbcyxlmtest.su();
						createStatement = connection.createStatement();
						String sru = "select * from zb where Uid=" +ss+ "";
						ResultSet executeQuery = createStatement.executeQuery(sru);
						zhuangbeisetget s1 = new zhuangbeisetget();
						if (executeQuery.next()) {
							s1.setName(executeQuery.getString("name"));
							s1.setHpsx(executeQuery.getInt("Hpsx"));
							s1.setFysx(executeQuery.getInt("fysx"));
							s1.setPrice(executeQuery.getInt("price"));
							return s1;
						}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					jdbcyxlmtest.sfzy(connection, createStatement);
					return null;	
		}
	
	//����װ���ķ���
	public static zbsetget zb(int ss) {
		Connection connection=null;
		Statement createStatement=null;
			// TODO Auto-generated method stub
				try {
					connection=jdbcyxlmtest.su();
					createStatement = connection.createStatement();
					String sru = "select * from zbei where id1="+ss+"";
					ResultSet executeQuery = createStatement.executeQuery(sru);
					zbsetget s1 = new zbsetget();
					if (executeQuery.next()) {
						s1.setId1(executeQuery.getInt("id1"));
						s1.setName(executeQuery.getString("name"));
						s1.setZbei1(executeQuery.getString("zbei1"));
						s1.setZbei2(executeQuery.getString("zbei2"));
						s1.setZbei3(executeQuery.getString("zbei3"));
						s1.setZbei4(executeQuery.getString("zbei4"));
						return s1;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				jdbcyxlmtest.sfzy(connection, createStatement);
				return null;
	}
	//�޸�Ӣ�۵ķ���
	public static void updata(yingxiongsetget s, int c) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			createStatement = connection.createStatement();
			// update ���� set �ֶ���=ֵ,�ֶ���n=ֵn [where����]
			String sru = "update yx set Hp=" + s.getHp() + ",fy=" + s.getFy()
					+ ",Price="+s.getPrice()+" where id=" + c + "";
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
	}
	
	//�޸�װ���ķ���
	public static void zbtese(zbsetget s,int a) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			connection=jdbcyxlmtest.su();
			String sql="update zbei set zbei1=?,zbei2=?,zbei3=?,zbei4=? where id1="+a+"";
			 ps = connection.prepareStatement(sql);
			 ps.setString(1, s.getZbei1());
			 ps.setString(2, s.getZbei2());
			 ps.setString(3, s.getZbei3());
			 ps.setString(4, s.getZbei4());
			 ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, ps);
		
	}
	//�޸�װ��2�ķ���
	public static void zbtese2(zbsetget s) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			//����һ��createStatement����connection
			createStatement = connection.createStatement();
			//ִ�����ݿ����
			//update  zbei set zbei1='sfsf' where id1=3
			String sru="insert into zbei values('"+s.getZbei2()+"') ";
			System.out.println(sru);
			//ִ�����ݿ�Ż�һ������
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		
	}
	//�޸�װ��3�ķ���
	public static void zbtese3(zbsetget s,int a) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			//����һ��createStatement����connection
			createStatement = connection.createStatement();
			//ִ�����ݿ����
			//update  zbei set zbei1='sfsf' where id1=3
			String sru="update zbei set zbei3='"+s.getZbei3()+"' where id1="+a+"";
			System.out.println(sru);
			//ִ�����ݿ�Ż�һ������
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		
	}
	//�޸�װ��4�ķ���
	public static void zbtese4(zbsetget s,int a) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			//����һ��createStatement����connection
			createStatement = connection.createStatement();
			//ִ�����ݿ����
			//update  zbei set zbei1='sfsf' where id1=3
			String sru="update zbei set zbei4='"+s.getZbei4()+"' where id1="+a+"";
			System.out.println(sru);
			//ִ�����ݿ�Ż�һ������
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
	}		
}

