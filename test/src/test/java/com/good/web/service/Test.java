package com.good.web.service;

import com.good.util.MD5util;

import net.sf.json.JSONObject;

public class Test {

	private static String ip = "http://127.0.0.1:8080/goodhr/";

	public static void testUser() throws Exception{
		

		JSONObject obj = new JSONObject();
		obj.put("name", "aafh");
		HttpClient.getInstance().sendPost(ip + "sysUser/insertUser",obj.toString());
		
	}

	public static void main(String[] args) throws Exception {
		testUser();
	}
}
