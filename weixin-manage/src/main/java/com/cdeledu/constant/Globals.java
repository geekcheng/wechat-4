package com.cdeledu.constant;

/**
 * @类描述: 全局变量定义
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午6:21:42
 * @版本: V1.0
 * @since: JDK 1.7
 */
public final class Globals {
	/** 验证码 */
	public static final String IMAGECAPTCHA = "imageCaptcha";
	/** 过滤标识，防止一次请求多次过滤 */
	public static final String FILTERED_REQUEST = "@@session_context_filtered_request";
	/** 保存用户到SESSION */
	public static final String USER_SESSION = "USER_SESSION";
	/** 将登录前的URL放到Session中的键名称 */
	public static final String LOGIN_TO_URL = "toUrl";
	/** 需要登录即可访问的URI资源 */
	public static final String[] INHERENT_URIS = { "/select", "/find", "/get", "/add", "/save",
			"/insert", "/edit", "/update", "/delete", "/bathDel" };
	/** 人员类型 */
	public static final Short User_Normal = 1;// 正常
	public static final Short User_Forbidden = 0;// 禁用
	public static final Short User_ADMIN = -1;// 超级管理员
	/** 日志级别定义 */
	public static final Integer Log_Leavel_INFO = 1;
	public static final Integer Log_Leavel_WARRING = 2;
	public static final Integer Log_Leavel_ERROR = 3;
	/** 日志类型 */
	public static final Integer Log_Type_LOGIN = 1; // 登陆
	public static final Integer Log_Type_EXIT = 2; // 退出
	public static final Integer Log_Type_INSERT = 3; // 插入
	public static final Integer Log_Type_DEL = 4; // 删除
	public static final Integer Log_Type_UPDATE = 5; // 更新
	public static final Integer Log_Type_UPLOAD = 6; // 上传
	public static final Integer Log_Type_OTHER = 7; // 其他
}
