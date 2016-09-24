package com.cdeledu.model.base;

import java.io.Serializable;

/**
 * @类描述: 上传下载模型类
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年9月23日 下午4:04:10
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class UploadFile implements Serializable{
	private boolean view = false;// 是否是预览
	private boolean rename = true;// 是否重命名
}
