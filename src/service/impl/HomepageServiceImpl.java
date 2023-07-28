package service.impl;

import java.util.List;

import bean.newspaper;
import dao.HomepageDao;
import dao.impl.HomepageDaoImpl;
import service.HomepageService;
public class HomepageServiceImpl implements HomepageService{
    private HomepageDao homepagedao = new HomepageDaoImpl();
	@Override
	public List<newspaper> getnewsinfo() {
		return homepagedao.getnewsinfo();
	}

}
