package dao;

import java.util.List;

import bean.newspaper;

public interface HomepageDao {
	/**
	 * 获取报刊
	 * @param List
	 * @return List
	 */
	public List<newspaper> getnewsinfo();
}
