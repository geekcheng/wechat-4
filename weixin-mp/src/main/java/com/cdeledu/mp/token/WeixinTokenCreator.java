package com.cdeledu.mp.token;

import com.cdeledu.exception.WeixinException;
import com.cdeledu.model.TokenBean;
import com.cdeledu.token.TokenCreator;
import com.cdeledu.util.WeiXinConstants;

/**
 * @类描述: 微信公众平台TOKEN创建者
 * @创建者: 独泪了无痕
 * @创建日期: 2016年1月31日 下午12:01:41	
 * @版本: V1.0
 * @since: JDK 1.7
 * @see <a href=
 *      "http://mp.weixin.qq.com/wiki/11/0e4b294685f817b95cbed85ba5e82b8f.html">
 *      微信公众平台获取token说明</a>
 */
public class WeixinTokenCreator implements TokenCreator {
	// 第三方用户唯一凭证(公众号ID)
	private final String appid;
	// 第三方用户唯一凭证密钥,即appsecret(公众号secret)
	private final String secret;

	public WeixinTokenCreator(String appid, String secret) {
		this.appid = appid;
		this.secret = secret;
	}

	public String getCacheKey() {
		return String.format("wx_mp_token_%s", appid);
	}

	public TokenBean createToken() throws WeixinException {
		String tokenUrl = String.format(WeiXinConstants.ASSESS_TOKEN_URL, appid, secret);
		System.out.println(tokenUrl);
		return null;
	}
}
