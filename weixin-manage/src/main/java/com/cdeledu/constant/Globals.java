package com.cdeledu.constant;

/**
 * @类描述: 全局变量定义
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午6:21:42
 * @版本: V1.0
 * @since: JDK 1.7
 */
public final class Globals {
	/**
	 * 保存用户到SESSION
	 */
	public static String USER_SESSION = "USER_SESSION";
	/**
	 * 人员类型
	 */
	public static Short User_Normal = 1;// 正常
	public static Short User_Forbidden = 0;// 禁用
	public static Short User_ADMIN = -1;// 超级管理员
	/**
	 * 日志级别定义
	 */
	public static Short Log_Leavel_INFO = 1;
	public static Short Log_Leavel_WARRING = 2;
	public static Short Log_Leavel_ERROR = 3;
	/**
	 * 日志类型
	 */
	public static Short Log_Type_LOGIN = 1; // 登陆
	public static Short Log_Type_EXIT = 2; // 退出
	public static Short Log_Type_INSERT = 3; // 插入
	public static Short Log_Type_DEL = 4; // 删除
	public static Short Log_Type_UPDATE = 5; // 更新
	public static Short Log_Type_UPLOAD = 6; // 上传
	public static Short Log_Type_OTHER = 7; // 其他

	/**
	 * 权限等级
	 */
	public static Short Function_Leave_ONE = 0;// 一级权限
	public static Short Function_Leave_TWO = 1;// 二级权限

	/**
	 * 权限等级前缀
	 */
	public static String Function_Order_ONE = "ofun";// 一级权限
	public static String Function_Order_TWO = "tfun";// 二级权限
}
