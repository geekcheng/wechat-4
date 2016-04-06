package com.cdeledu.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Description: 加密工具类 key要一起加密的key
 * @author: 独泪了无痕
 * @date: 2015年8月21日 上午8:36:39
 * @version: V1.0
 * @history:
 */
public class SHAHelper {
	/*-------------------------- 私有属性 begin -------------------------------*/
	private final static String KEY = "microxdd";

	/*-------------------------- 私有属性 end   -------------------------------*/
	/*-------------------------- 私有方法 begin -------------------------------*/
	/*-------------------------- 私有方法 end   -------------------------------*/
	/*-------------------------- 公有方法 begin -------------------------------*/
	public static String encodeWhithKey(String instr) {
		String des = "";
		String tmp = null;
		instr += KEY;
		// 选择SHA-1
		@SuppressWarnings("deprecation")
		byte[] digest = DigestUtils.sha(instr.getBytes());
		// 返回的是byet[]，要转化为String存储比较方便
		for (int i = 0; i < digest.length; i++) {
			tmp = (Integer.toHexString(digest[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}
	/*-------------------------- 公有方法 end   -------------------------------*/
}
