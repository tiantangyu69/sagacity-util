/*******************************************************
 * @author LIZHITAO
 * @date 2014-2-28 下午2:32:07
 * @name ExcelBorderStyle.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.excel.style;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author LIZHITAO EXCEL 表格边框装饰器
 */
public class ExcelBorderStyle extends ExcelStyleDecorate {
	private ExcelStyle excelStyle;
	private Short borderTop;
	private Short borderRight;
	private Short borderBottom;
	private Short borderLeft;

	/**
	 * 构造器
	 * 
	 * @param excelStyle
	 * @param borderBottom
	 *            底部边框样式 （使用 HSSFCellStyle.BORDER_THIN 类似的枚举值）
	 * @param borderTop
	 *            顶部边框样式 （使用 HSSFCellStyle.BORDER_THIN 类似的枚举值）
	 * @param borderLeft
	 *            左边框样式 （使用 HSSFCellStyle.BORDER_THIN 类似的枚举值）
	 * @param borderRight
	 *            右边框样式 （使用 HSSFCellStyle.BORDER_THIN 类似的枚举值）
	 */
	public ExcelBorderStyle(ExcelStyle excelStyle, Short borderTop,
			Short borderRight, Short borderBottom, Short borderLeft) {
		this.excelStyle = excelStyle;
		this.borderBottom = borderBottom;
		this.borderTop = borderTop;
		this.borderLeft = borderLeft;
		this.borderRight = borderRight;
	}

	public ExcelStyle getExcelStyle() {
		return excelStyle;
	}

	public void setExcelStyle(ExcelStyle excelStyle) {
		this.excelStyle = excelStyle;
	}

	public Short getBorderBottom() {
		return borderBottom;
	}

	public void setBorderBottom(Short borderBottom) {
		this.borderBottom = borderBottom;
	}

	public Short getBorderTop() {
		return borderTop;
	}

	public void setBorderTop(Short borderTop) {
		this.borderTop = borderTop;
	}

	public Short getBorderLeft() {
		return borderLeft;
	}

	public void setBorderLeft(Short borderLeft) {
		this.borderLeft = borderLeft;
	}

	public Short getBorderRight() {
		return borderRight;
	}

	public void setBorderRight(Short borderRight) {
		this.borderRight = borderRight;
	}

	/**
	 * @param
	 * @name getWorkbook
	 * @active
	 * @state
	 * @type ExcelBorderStyle
	 * @time 下午2:32:07
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
	 * @type ExcelBorderStyle
	 * @time 下午2:32:07
	 * @see org.sagacity.util.excel.style.ExcelStyle#getStyle()
	 */
	@Override
	public HSSFCellStyle getStyle() {
		HSSFCellStyle style = excelStyle.getStyle();
		if (null != getBorderBottom()) {
			style.setBorderBottom(getBorderBottom());
		}
		if (null != getBorderTop()) {
			style.setBorderLeft(getBorderTop());
		}
		if (null != getBorderRight()) {
			style.setBorderRight(getBorderRight());
		}
		if (null != getBorderLeft()) {
			style.setBorderTop(getBorderLeft());
		}
		return style;
	}

}
