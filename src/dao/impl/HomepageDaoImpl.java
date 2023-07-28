package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.newspaper;
import dao.HomepageDao;
import util.JDBCUtil;

public class HomepageDaoImpl implements HomepageDao{
    
	@Override
	public List<newspaper> getnewsinfo() {
		Connection conn = JDBCUtil.getConn();
		String sql = "select pid,pname,image from newspaper_info ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<newspaper> list = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<newspaper>();
			while(rs.next()){
				int pid = rs.getInt("pid");
				String pname = rs.getString("pname");
				String image = rs.getString("image");
				list.add(new newspaper(pid,pname,image));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, rs);
		}
	    return list;
	}
    
}
