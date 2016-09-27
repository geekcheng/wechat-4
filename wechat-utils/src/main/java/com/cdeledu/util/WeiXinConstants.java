package com.cdeledu.util;

import java.nio.charset.Charset;

/**
 * 
 * @ClassName: WeiXinConstants
 * @Description: 微信常量配置
 * @author: 独泪了无痕
 * @date: 2015年8月25日 上午8:15:43
 * @version: V1.0
 * @history:
 */
public final class WeiXinConstants {
	/** 基础支持之上传文件媒体文件类型，分别有图片(image)、语音(voice)、视频(video)和缩略图(thumb) */
	public static final String UPLOADFILE = "image,voice,video,thumb";
	/**
	 * 登录用户账号信息，加载到session缓存中
	 */
	public static final String WEIXIN_ACCOUNT = "WEIXIN_ACCOUNT";
	/**
	 * 微信商城用户登录是的openid
	 */
	public static final String USER_OPENID = "USER_OPENID";
	/**
	 * 公众平台获取token的url
	 */
	public static final String ASSESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
	/**
	 * 公众平台jssdk获取token的url
	 */
	public static final String JS_TICKET_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=%s&type=jsapi";
	// /////////////////////
	// 编码常量引用
	// /////////////////////
	public static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Charset GBK = Charset.forName("GBK");
	public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	// /////////////////////
	// 加密工具
	// /////////////////////
	public static final String JKS = "JKS";
	public static final String PKCS12 = "PKCS12";
	public static final String TLS = "TLS";
	public static final String X509 = "X.509";
	public static final String AES = "AES";
	public static final String MD5 = "MD5";
	public static final String SHA = "SHA";
	public static final String SHA1 = "SHA-1";
}
