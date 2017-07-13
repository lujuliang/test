package com.good.web.service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

	private static HttpClient httpClient = new HttpClient();

	private HttpClient() {
	}

	public static HttpClient getInstance() {
		return httpClient;
	}

	public Object sendPost(String path, String obj) throws Exception {
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setConnectTimeout(30000);

		conn.setReadTimeout(90000);
		conn.setDoOutput(true);
		conn.setDoInput(true);  
		conn.setRequestProperty("Content-type", "application/json");
		conn.setRequestProperty("accept", "application/json");

		 byte[] data = obj.getBytes("UTF-8");
		 conn.getOutputStream().write(data);
		 conn.getOutputStream().flush();        
		 conn.getOutputStream().close();
		 System.out.println(conn.getResponseCode()); 

		InputStream inStream = conn.getInputStream();
		byte[] data2 = readInputStream(inStream);
		return new String (data2);
	}
	
	public Object get(String path) throws Exception {
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(60000);

		InputStream inStream = conn.getInputStream();
		byte[] body = readInputStream(inStream);
		if(body == null||body.length == 0) return null;
		return new String(body);
	}

	public static byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[102400];
		int len = 0;
		while ((len = inStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, len);
		}
		byte[] data = outStream.toByteArray();
		outStream.close();
		inStream.close();
		return data;
	}

}
