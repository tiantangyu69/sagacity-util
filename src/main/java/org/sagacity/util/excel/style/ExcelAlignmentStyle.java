/*******************************************************
 * @author LIZHTIAO
 * @date 2014-2-28 下午2:18:21
 * @name ExcelAlignmentStyle.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.excel.style;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author LIZHITAO excel 表格 垂直、水平对齐方式装饰器
 */
public class ExcelAlignmentStyle extends ExcelStyleDecorate {
	private ExcelStyle excelStyle;
	private Short alignment;
	private Short verticalAlignment;

	/**
	 * 构造方法
	 * 
	 * @param excelStyle
	 * @param alignment
	 *            设置水平对齐方式（使用HSSFCellStyle枚举类型）
	 * @param verticalAlignment
	 *            设置垂直对齐方式（使用HSSFCellStyle枚举类型）
	 */
	public ExcelAlignmentStyle(ExcelStyle excelStyle, Short alignment,
			Short verticalAlignment) {
		this.excelStyle = excelStyle;
		this.alignment = alignment;
		this.verticalAlignment = verticalAlignment;
	}

	public ExcelStyle getExcelStyle() {
		return excelStyle;
	}

	public void setExcelStyle(ExcelStyle excelStyle) {
		this.excelStyle = excelStyle;
	}

	public Short getAlignment() {
		return alignment;
	}

	public void setAlignment(Short alignment) {
		this.alignment = alignment;
	}

	public Short getVerticalAlignment() {
		return verticalAlignment;
	}

	public void setVerticalAlignment(Short verticalAlignment) {
		this.verticalAlignment = verticalAlignment;
	}

	/**
	 * @param
	 * @name getWorkbook
	 * @active
	 * @state
	 * @type ExcelAlignmentStyle
	 * @time 下午2:18:21
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
	 * @type ExcelAlignmentStyle
	 * @time 下午2:18:21
	 * @see org.sagacity.util.excel.style.ExcelStyle#getStyle()
	 */
	@Override
	public HSSFCellStyle getStyle() {
		HSSFCellStyle style = excelStyle.getStyle();
		if (null != getAlignment()) {
			style.setAlignment(getAlignment()); // 设置水平居中
		}
		if (null != getVerticalAlignment()) {
			style.setVerticalAlignment(getVerticalAlignment()); // 设置垂直居中
		}
		return style;
	}

}
