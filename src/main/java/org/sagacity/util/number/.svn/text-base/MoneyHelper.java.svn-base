/*******************************************************
 * @author LIZHITAO
 * @date 2013-9-25 上午9:41:44
 * @name MoneyHelper.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.number;

import org.sagacity.util.string.StringHelper;

/**
 * @author LIZHITAO
 */
public class MoneyHelper {
	// 整数部分
	private static String integerPart;
	// 小数部分
	private static String floatPart;

	// 将数字转化为汉字的数组,因为各个实例都要使用所以设为静态
	private static final char[] cnNumbers = { '零', '壹', '贰', '叁', '肆', '伍',
			'陆', '柒', '捌', '玖' };

	// 供分级转化的数组,因为各个实例都要使用所以设为静态
	private static final char[] series = { '分', '角', '元', '拾', '百', '仟', '万', '拾', '百',
			'仟', '亿' , '十', '百', '千', '万', '十', '百', '千', '万'};

	/**
	 * 取得大写形式的字符串
	 * 
	 * @return
	 */
	public static String toChineseUppercaseMoney(String original) {
		// 成员变量初始化
		integerPart = "";
		floatPart = "";

		if (original.contains(".")) {
			// 如果包含小数点
			int dotIndex = original.indexOf(".");
			integerPart = original.substring(0, dotIndex);
			floatPart = original.substring(dotIndex + 1, dotIndex + 3);
		} else {
			// 不包含小数点
			integerPart = original;
		}
		
		// 因为是累加所以用StringBuffer
		StringBuffer sb = new StringBuffer();

		// 整数部分处理
		for (int i = 0; i < integerPart.length(); i++) {
			int number = getNumber(integerPart.charAt(i));
			
			sb.append(cnNumbers[number]);
			sb.append(series[integerPart.length() + 1 - i]);
		}

		// 小数部分处理
		if (floatPart.length() > 0) {
			if (StringHelper.containNumber(floatPart, "0") > 1) {
				sb.append("整");
			} else {
				for (int i = 0; i < floatPart.length(); i++) {
					int number = getNumber(floatPart.charAt(i));

					sb.append(cnNumbers[number]);
					sb.append(series[floatPart.length() - i - 1]);
				}
			}
		}

		// 返回拼接好的字符串
		return sb.toString();
	}

	/**
	 * 将字符形式的数字转化为整形数字 因为所有实例都要用到所以用静态修饰
	 * 
	 * @param c
	 * @return
	 */
	private static int getNumber(char c) {
		String str = String.valueOf(c);
		return Integer.parseInt(str);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(MoneyHelper.toChineseUppercaseMoney("99"));
	}
}
