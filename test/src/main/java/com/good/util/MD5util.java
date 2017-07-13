package com.good.util;

import java.security.MessageDigest;

/**
 * 
 * @author 
 *
 */
public class MD5util {
	/**
	 * 
	 * @param inStr
	 * @return
	 * @throws Exception
	 */
	public static String toMd5(String inStr) throws Exception {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
	
	
	public static String phone2Md5(String phoneNum){
		if(phoneNum==null ) return phoneNum;
		if(phoneNum.contains("@")) return phoneNum;
		if(phoneNum.length() !=11) return phoneNum;
		String s1 = RandomCode.getRandomCharAndNumr(5);
		String s2 = RandomCode.getRandomCharAndNumr(5);
		String s3 = RandomCode.getRandomCharAndNumr(5);
		String s4 = RandomCode.getRandomCharAndNumr(6);
		String num = phoneNum.substring(0, 2)+s1+phoneNum.substring(2, 4)+s2+phoneNum.substring(4, 6)+s3+phoneNum.substring(6, 8)+s4+phoneNum.substring(8, 11);
		return num;
	}
	
	public static String getPhoneFromMD5(String phoneNum){
		if(phoneNum == null || phoneNum.length() !=32)return phoneNum;
		return phoneNum.substring(0, 2)+phoneNum.substring(7, 9)+phoneNum.substring(14, 16)+phoneNum.substring(21, 23)+phoneNum.substring(29, 32);
	}
	
	public static String getShortPhoneNum(String phoneNum){
		if(phoneNum == null || phoneNum.length()!=11) return phoneNum;
		return phoneNum.substring(0, 2)+"*******"+ phoneNum.substring(9, 11);
	}
}
