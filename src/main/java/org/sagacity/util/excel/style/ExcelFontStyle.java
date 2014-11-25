/*******************************************************
 * @author LIZHITAO
 * @date 2014-2-28 上午10:29:24
 * @name ExcelFontStyle.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.excel.style;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author LIZHITAO
 * excel cell 字体装饰器类
 */
public class ExcelFontStyle extends ExcelStyleDecorate {
	private ExcelStyle excelStyle;
	private Short color;
	private Short fontSize;
	private Short fontWeight;
	private String fontName;

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public Short getFontWeight() {
		return fontWeight;
	}

	public void setFontWeight(Short fontWeight) {
		this.fontWeight = fontWeight;
	}

	public Short getFontSize() {
		return fontSize;
	}

	public void setFontSize(Short fontSize) {
		this.fontSize = fontSize;
	}

	public Short getColor() {
		return color;
	}

	public void setColor(Short color) {
		this.color = color;
	}

	/**
	 * 构造方法
	 * @param excelStyle
	 * @param color 字体颜色 使用HSSFColor.RED.index 的类似方法
	 * @param fontSize 字体大小
	 * @param fontWeight 字体粗细 使用HSSFFont枚举
	 * @param fontName 字体名称 例如 '黑体'
	 */
	public ExcelFontStyle(ExcelStyle excelStyle, Short color, Short fontSize,
			Short fontWeight, String fontName) {
		this.excelStyle = excelStyle;
		this.color = color;
		this.fontSize = fontSize;
		this.fontWeight = fontWeight;
		this.fontName = fontName;
	}

	@Override
	public HSSFCellStyle getStyle() {
		HSSFFont font = getWorkbook().createFont();
		HSSFCellStyle style = excelStyle.getStyle();
		if (null != getColor()) {
			font.setColor(getColor());// HSSFColor.VIOLET.index //字体颜色
		}
		if (null != getFontSize()) {
			font.setFontHeightInPoints(getFontSize());// 设置字体大小
		}
		if (null != getFontWeight()) {
			font.setBoldweight(getFontWeight()); // 字体增粗
		}
		if (null != getFontName()) {
			font.setFontName(getFontName());
		}

		style.setFont(font);// 把字体应用到当前的样式
		return style;
	}

	@Override
	public HSSFWorkbook getWorkbook() {
		return excelStyle.getWorkbook();
	}
}
