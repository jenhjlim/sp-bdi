package com.sp.bdi.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminService implements UserService {
	
	@Autowired
	private UserDAO udao;

	@Override
	public List<Map<String, String>> getUserList() {
		return udao.selectUserList();
	}
	@Override
	public List<UserVO> getUserVOList(UserVO user) {
		return udao.selectUserVOList(user);
	}
	@Override
	public Map<String, String> insertUserInfo(UserVO user) {
		Map<String, String> rMap = new HashMap<String, String>();
		rMap.put("cnt", udao.insertUserInfo(user) + "");
		return rMap;
	}
	@Override
	public Map<String, String> updateUserInfo(UserVO user) {
		Map<String, String> rMap = new HashMap<String, String>();
		rMap.put("cnt", udao.updateUserInfo(user) + "");
		return rMap;
	}
	@Override
	public Map<String, String> deleteUserInfo(UserVO user) {
		Map<String, String> rMap = new HashMap<String, String>();
		rMap.put("cnt", udao.deleteUserInfo(user) + "");
		return rMap;
	}
}
