package service;

import java.util.List;

import bean.newspaper;

public interface HomepageService {
	/**
	 * 获取首页推荐报刊信息
	 * @return List<newspaper>
	 */
	public List<newspaper> getnewsinfo();
}
