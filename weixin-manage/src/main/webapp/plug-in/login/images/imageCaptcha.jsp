<%@page import="java.io.OutputStream"%>
<%@ page import="com.cdeledu.constant.Globals"%>
<%@ page import="java.awt.*"%>
<%@ page import="java.awt.image.*"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.imageio.*"%>
<%@ page contentType="image/jpeg" pageEncoding="utf-8"%>

<%!Color getRandColor(int fc, int bc) { //给定范围获得随机颜色
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}%>
<%
	out.clear();//这句针对resin服务器，如果是tomacat可以不要这句 
	// 设置页面不缓存
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	// 在内存中创建图象
	int width = 80, height = 20;
	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	// 获取图形上下文
	Graphics g = image.getGraphics();
	// 生成随机类
	Random random = new Random();
	// 设定背景色(因为是做背景，所以偏淡)
	g.setColor(getRandColor(200, 250));
	g.fillRect(0, 0, width, height);
	// 设定字体,字体的大小应该根据图片的高度来定
	g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	// 画边框
	g.setColor(getRandColor(160, 200));
	// 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
	for (int i = 0; i < 155; i++) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(12);
		int yl = random.nextInt(12);
		g.drawLine(x, y, x + xl, y + yl);
	}
	// 用于取随机产生的认证码(4位),以便用户登录后进行验证
	String sRand = "";
	// 设置备选验证码:包括"a-z"和数字"0-9"
	String temp[] = { "A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g",
			"H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o",
			"P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w",
			"X", "x", "Y", "y", "Z", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
			"9" };
	// 随机产生4位数字的验证码
	for (int i = 0; i < 4; i++) {
		int index = (int) (Math.random() * temp.length);
		String rand = String.valueOf(temp[index]);
		sRand += rand;
		// 用随机产生的颜色将验证码绘制到图像中
		g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110),
				20 + random.nextInt(110))); // 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
		g.drawString(rand, 18 * i + 10, 16);
	}
	// 将验证码存入SESSION 
	session.setAttribute(Globals.IMAGECAPTCHA, sRand.toLowerCase());
	// 图象生效
	g.dispose();
	OutputStream os = response.getOutputStream();
	// 输出图象到页面  
	ImageIO.write(image, "JPEG", os);
	os.flush();
	os.close();
	response.flushBuffer();
	out.clear();
	out = pageContext.pushBody();
%>