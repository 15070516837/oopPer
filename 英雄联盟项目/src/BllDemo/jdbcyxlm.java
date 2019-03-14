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
	
	//显示数据库内容
	public static void sc() {
		Connection connection=null;
		Statement createStatement=null;
		try {
			//加载驱动
			Class.forName(jdbcyxlmtest.ul);
			//加载数据库密码和账户
			connection = DriverManager.getConnection(jdbcyxlmtest.url,jdbcyxlmtest.user, jdbcyxlmtest.password);
			//声明一个createStatement加载connection
			createStatement = connection.createStatement();
			//执行数据库语句
			String sru="select * from zb";
			//执行数据库放回一个对象
			ResultSet srun=createStatement.executeQuery(sru);
			//打印数据库里面的内容
			while(srun.next()) {
				System.out.println("id:"+srun.getInt("Uid")+"  装备名:"+srun.getString("name")+"  攻击属性:"+srun.getInt("gjsx")+"   法强属性"+srun.getInt("fqsx")+"   防御属性"+srun.getInt("fysx")+"   血量属性"+srun.getInt("Hpsx")+"   回血属性"+srun.getInt("hxsx")+"   装备价钱"+srun.getInt("price"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
	}
	//账户和密码的添加方法
	public static void su(zhanghusetget s) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			//加载驱动
			//加载数据库密码和账户
			connection=jdbcyxlmtest.su();
			//声明一个createStatement加载connection
			createStatement = connection.createStatement();
			//执行数据库语句
			String sru="insert into denlu values('"+s.getName()+"','"+s.getMima()+"')";
			//执行数据库放回一个对象
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		
	}
	
	//查找数据库中的账号的方法
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
	//查找密码的方法
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
	//查找部分英雄的方法
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
	//查找部分装备的方法
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
	
	//查找装备的方法
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
	//修改英雄的方法
	public static void updata(yingxiongsetget s, int c) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			createStatement = connection.createStatement();
			// update 表名 set 字段名=值,字段名n=值n [where条件]
			String sru = "update yx set Hp=" + s.getHp() + ",fy=" + s.getFy()
					+ ",Price="+s.getPrice()+" where id=" + c + "";
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
	}
	
	//修改装备的方法
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
	//修改装备2的方法
	public static void zbtese2(zbsetget s) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			//声明一个createStatement加载connection
			createStatement = connection.createStatement();
			//执行数据库语句
			//update  zbei set zbei1='sfsf' where id1=3
			String sru="insert into zbei values('"+s.getZbei2()+"') ";
			System.out.println(sru);
			//执行数据库放回一个对象
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		
	}
	//修改装备3的方法
	public static void zbtese3(zbsetget s,int a) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			//声明一个createStatement加载connection
			createStatement = connection.createStatement();
			//执行数据库语句
			//update  zbei set zbei1='sfsf' where id1=3
			String sru="update zbei set zbei3='"+s.getZbei3()+"' where id1="+a+"";
			System.out.println(sru);
			//执行数据库放回一个对象
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
		
	}
	//修改装备4的方法
	public static void zbtese4(zbsetget s,int a) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			connection=jdbcyxlmtest.su();
			//声明一个createStatement加载connection
			createStatement = connection.createStatement();
			//执行数据库语句
			//update  zbei set zbei1='sfsf' where id1=3
			String sru="update zbei set zbei4='"+s.getZbei4()+"' where id1="+a+"";
			System.out.println(sru);
			//执行数据库放回一个对象
			createStatement.executeUpdate(sru);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		jdbcyxlmtest.sfzy(connection, createStatement);
	}		
}

