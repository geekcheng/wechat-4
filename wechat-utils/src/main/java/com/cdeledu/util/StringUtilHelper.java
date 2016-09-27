package com.cdeledu.util;

import java.nio.charset.Charset;

import org.apache.http.Consts;

public final class StringUtilHelper {
	private static byte[] getBytes(final String content, final Charset charset) {
		if (content == null) {
			return null;
		}
		return content.getBytes(charset);
	}

	private static String newString(final byte[] bytes, final Charset charset) {
		return bytes == null ? null : new String(bytes, charset);
	}

	public static byte[] getBytesUtf8(final String content) {
		return getBytes(content, Consts.UTF_8);
	}

	public static String newStringUtf8(final byte[] bytes) {
		return newString(bytes, Consts.UTF_8);
	}
}
