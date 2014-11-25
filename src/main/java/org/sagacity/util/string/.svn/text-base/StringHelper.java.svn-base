/*******************************************************
 * @author LIZHITAO
 * @date 2013-9-23 下午4:00:59
 * @name StringHelper.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.string;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.StringUtils;

/**
 * @author LIZHITAO
 * 
 */
public class StringHelper {
	/**
	 * 将搜索的关键字进行处理，转为查询的关键字
	 * 若搜索的关键字为" "、null、"null"字符串、搜索的关键字与搜索框中默认的文字相同则将关键字转为null
	 * 
	 * @name keywordNull
	 * @active
	 * @state
	 * @type boolean
	 * @time 下午4:07:37
	 * @exception/throws
	 * @see
	 * @since
	 * @param keyword
	 *            搜索的关键字
	 * @param defaultText
	 *            默认搜索框中的文字
	 * @return String
	 */
	public static String keywordNull(String keyword, String defaultText) {
		if (StringUtils.isBlank(keyword)) {
			return null;
		} else {
			if (keyword.trim().equals("null")) {
				return null;
			}
			if (null != defaultText
					&& keyword.trim().equals(defaultText.trim())) {
				return null;
			}
			return keyword.trim();
		}
	}

	/**
	 * 将"", " ", "null", " null", "null "," null "转换为null
	 * 
	 * @name trimToNull
	 * @active
	 * @state
	 * @type String
	 * @time 下午4:24:14
	 * @exception/throws
	 * @see
	 * @since
	 * @param str
	 *            字符串
	 * @return String
	 */
	public static String trimToNull(String str) {
		if (StringUtils.isBlank(str)) {
			return null;
		} else {
			if (str.trim().equals("null")) {
				return null;
			}
			return str;
		}
	}

	/**
	 * 计算一个字符串在另一个字符串中出现的次数
	 * 
	 * @name containNumber
	 * @active
	 * @state
	 * @type Integer
	 * @time 上午9:23:27
	 * @exception/throws
	 * @see
	 * @since
	 * @param str
	 *            计算的字符串
	 * @param containStr
	 *            包含的字符串
	 * @return Integer
	 */
	public static Integer containNumber(String str, String containStr) {
		if (str == null || containStr == null) {
			return 0;
		}
		int count = 0;
		// 如果字符串中有字符串
		while (str.indexOf(containStr) != -1) {
			count++;
			str = str.substring(str.indexOf(containStr) + containStr.length());// 将字符串出现containStr的位置之前的全部截取掉
		}
		return count;
	}

	/**
	 * 计算采用utf-8编码方式时字符串所占字节数
	 * 
	 * @param content
	 * @return
	 */
	public static int getByteSize(String content) {
		int size = 0;
		if (null != content) {
			try {
				// 汉字采用utf-8编码时占3个字节
				size = content.getBytes("utf-8").length;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return size;
	}
}
