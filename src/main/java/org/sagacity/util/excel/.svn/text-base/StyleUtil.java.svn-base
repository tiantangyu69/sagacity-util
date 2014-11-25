/**
 * EXCEL STYLE UTIL
 */
package org.sagacity.util.excel;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 * @author LIZHITAO
 * 
 */
public class StyleUtil {
	public static HSSFCellStyle getHeadStyle(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 20);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体增粗
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}

	public static HSSFCellStyle getH2tyle(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		// 设置边框
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		
		style.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体增粗
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}


	public static HSSFCellStyle getH3Style(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		style.setWrapText(true);
		// 设置边框
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		
		style.setFillForegroundColor(HSSFColor.LIGHT_TURQUOISE.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLUE.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体增粗
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}
	

	public static HSSFCellStyle getTexttyle(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		// 设置边框
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 10);
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}

	public static HSSFCellStyle getFootStyle(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		style.setWrapText(true);
		
		style.setFillForegroundColor(HSSFColor.ORANGE.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.WHITE.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 10);
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}

	public static HSSFCellStyle getNormalStyle(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		style.setWrapText(true);

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体增粗
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}

	public static HSSFCellStyle getNarrowStyle(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		style.setWrapText(true);

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体增粗
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}

	public static HSSFCellStyle getSmallStyle(HSSFWorkbook wb) {
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		style.setWrapText(true);

		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);// HSSFColor.VIOLET.index //字体颜色
		font.setFontHeightInPoints((short) 8);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体增粗
		// 把字体应用到当前的样式
		style.setFont(font);

		return style;
	}
}
