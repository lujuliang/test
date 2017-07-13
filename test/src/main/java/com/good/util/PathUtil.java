package com.good.util;

public class PathUtil {

	
	public static String getDownloadPath()
	{
		String path=Thread.currentThread().getContextClassLoader().getResource("").toString();

		path=path.replace("file:", ""); 
		path=path.replace("classes/", ""); 
		path=path.substring(1);
		path+="download/";
		return path;
	}
	
	public static void main(String[] args) {
		System.out.println(getDownloadPath());
	}


}
