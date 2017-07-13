package com.good.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.good.web.model.source1.SysUser;
import com.good.web.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private com.good.web.dao.source1.user.SysUserMapper sysUserMapper1;
	
	@Autowired
	private com.good.web.dao.source2.user.SysUserMapper2 sysUserMapper2;
	
	@Override
	public int insert(SysUser user) {
		SysUser u = new SysUser();
		u.setName("u1");
		sysUserMapper1.insert(u);
		
		com.good.web.model.source2.SysUser u2 = new com.good.web.model.source2.SysUser();
		u2.setName("u2");
		sysUserMapper2.insert(u2);
		
		return 0;
	}

}
