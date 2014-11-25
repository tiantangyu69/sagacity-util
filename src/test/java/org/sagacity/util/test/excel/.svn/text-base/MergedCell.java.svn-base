/**
 * 
 */
package org.sagacity.util.test.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.sagacity.util.excel.style.BaseExcelStyle;
import org.sagacity.util.excel.style.ExcelAlignmentStyle;
import org.sagacity.util.excel.style.ExcelBorderStyle;
import org.sagacity.util.excel.style.ExcelFontStyle;
import org.sagacity.util.excel.style.ExcelForegroundColorStyle;
import org.sagacity.util.excel.style.ExcelStyle;
import org.sagacity.util.excel.style.ExcelWrapTextStyle;

/**
 * @author LIZHITAO 合并单元格
 */
public class MergedCell {
	public static void mergedCell(HSSFWorkbook wb, HSSFSheet sheet) {

		ExcelStyle style1 = new BaseExcelStyle(wb);// 使用装饰器装饰cell样式

		style1 = new ExcelFontStyle(style1, HSSFColor.ROSE.index, (short) 10,
				HSSFFont.BOLDWEIGHT_BOLD, null);// 字体装饰器

		style1 = new ExcelAlignmentStyle(style1, HSSFCellStyle.ALIGN_CENTER,
				HSSFCellStyle.VERTICAL_CENTER);// 水平垂直对齐方式装饰器

		style1 = new ExcelBorderStyle(style1, HSSFCellStyle.BORDER_DASH_DOT,
				HSSFCellStyle.BORDER_DASH_DOT, HSSFCellStyle.BORDER_DASH_DOT,
				HSSFCellStyle.BORDER_DASH_DOT);// 表格边框装饰器

		style1 = new ExcelForegroundColorStyle(style1,
				HSSFColor.LIGHT_YELLOW.index);// 前景色装饰器

		style1 = new ExcelWrapTextStyle(style1, true);// 字体自动换行装饰器

		HSSFRow row = sheet.createRow(0);// 创建表头---------------------------------------------------
		HSSFCell cell = row.createCell(3);
		row.setHeight((short) 600);
		cell.setCellValue("兰 州 ");
		cell.setCellStyle(style1.getStyle());
	}
}
