/*******************************************************
 * @author LIZHITAO
 * @date 2014-2-28 下午2:45:33
 * @name ExcelForegroundColorStyle.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.excel.style;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 * @author LIZHITAO EXCEL 表格前景色装饰器
 */
public class ExcelForegroundColorStyle extends ExcelStyleDecorate {
	private ExcelStyle excelStyle;
	private Short color;

	/**
	 * 构造器
	 * @param excelStyle
	 * @param color 使用HSSFColor.LIGHT_YELLOW.index类似方法设置颜色
	 */
	public ExcelForegroundColorStyle(ExcelStyle excelStyle, Short color) {
		super();
		this.excelStyle = excelStyle;
		this.color = color;
	}

	public ExcelStyle getExcelStyle() {
		return excelStyle;
	}

	public void setExcelStyle(ExcelStyle excelStyle) {
		this.excelStyle = excelStyle;
	}

	public Short getColor() {
		return color;
	}

	public void setColor(Short color) {
		this.color = color;
	}

	/**
	 * @param
	 * @name getWorkbook
	 * @active
	 * @state
	 * @type ExcelForegroundColorStyle
	 * @time 下午2:45:33
	 * @see org.sagacity.util.excel.style.ExcelStyle#getWorkbook()
	 */
	@Override
	public HSSFWorkbook getWorkbook() {
		return excelStyle.getWorkbook();
	}

	/**
	 * @param
	 * @name getStyle
	 * @active
	 * @state
	 * @type ExcelForegroundColorStyle
	 * @time 下午2:45:33
	 * @see org.sagacity.util.excel.style.ExcelStyle#getStyle()
	 */
	@Override
	public HSSFCellStyle getStyle() {
		HSSFCellStyle style = excelStyle.getStyle();
		if(null != getColor()){
			style.setFillForegroundColor(getColor());
		}
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		return style;
	}
}
