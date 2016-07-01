package com.cdeledu.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

/**
 * @类描述: 图片处理Utils
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年7月1日 下午7:14:40
 * @版本: V1.0
 * @since: JDK 1.7
 */
public final class ImageUtils {
	/**
	 * @方法描述: 获取图片信息
	 * @创建者: 皇族灬战狼
	 * @创建时间: 2016年7月1日 下午7:17:01
	 * @param path
	 * @return
	 */
	public static ImageModel getIamge(String path) {
		ImageModel model = null;
		BufferedImage sourceImg = null;
		try {
			model = new ImageModel();

			if (path.startsWith("http")) {
				URL url = new URL(path);
				URLConnection uc = url.openConnection();
				sourceImg = ImageIO.read(uc.getInputStream());
				String file = url.getFile();
				model.setName(file.replace("/", ""));
				if (file.lastIndexOf(".") >= 0) {
					model.setExt(file.substring(file.lastIndexOf(".") + 1));
				}
			} else {
				File picture = new File(path);
				sourceImg = ImageIO.read(new FileInputStream(picture));

				model.setName(picture.getName());
				if (path.lastIndexOf(".") >= 0) {
					model.setExt(path.substring(path.lastIndexOf(".") + 1));
				}
				model.setSize((picture.length() / 1024.0));
			}
			model.setWidth(sourceImg.getWidth());
			model.setHeight(sourceImg.getHeight());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return model;
	}
}
