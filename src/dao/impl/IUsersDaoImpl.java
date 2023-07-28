package dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Users;
import bean.newspaper;
import dao.IUsersDao;
import util.JDBCUtil;
public class IUsersDaoImpl implements IUsersDao {

	@Override
	public int register(Users user) {
		Connection conn = JDBCUtil.getConn();
		String sql = "insert into user_info(nickname,name,password,phonenumber) values(?,?,?,?)";
		int i = 0;
		PreparedStatement pstmt=null;
		try {
		    pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,user.getNickname());
			pstmt.setString(2,user.getName());
			pstmt.setString(3,user.getPassword());
			pstmt.setString(4,user.getPhonenumber());
			i = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null,pstmt,null);
		}
		return i;
	}

	@Override
	public Users login(Users user) {
		Connection conn = JDBCUtil.getConn();
		String sql = "select uid,name,nickname,password from user_info where (name= ? or phonenumber= ? ) and password= ?";
		int uid = 0;
		String nickname = "";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPhonenumberorname());
			pstmt.setString(2, user.getPhonenumberorname());
			pstmt.setString(3, user.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()){
				uid = rs.getInt("uid");
				nickname = rs.getString("nickname");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Users ruser = new Users(uid,nickname,null,null,null,null);
		return ruser;
	}

	@Override
	public List<Users> getAllUsers() {
		Connection conn = JDBCUtil.getConn();
		String sql = "select uid,nickname,name,phonenumber from user_info where uid != 1";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Users> list = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<Users>();
			while(rs.next()){
				int id = rs.getInt("uid");
				String nickname = rs.getString("nickname");
				String name = rs.getString("name");
				String phonenumber = rs.getString("phonenumber");
				list.add(new Users(id,nickname,name,null,phonenumber,null));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, rs);
		}
	    return list;
	}
     
}
