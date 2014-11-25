/*******************************************************
 * @author LIZHITAO
 * @date 2014-2-28 下午2:52:02
 * @name ExcelWrapTextStyle.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.excel.style;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author LIZHITAO 文字自动换行装饰器
 */
public class ExcelWrapTextStyle extends ExcelStyleDecorate {
	private ExcelStyle excelStyle;
	private Boolean flag;

	/**
	 * 构造器
	 * 
	 * @param excelStyle
	 * @param flag
	 *            默认为true，即自动换行
	 */
	public ExcelWrapTextStyle(ExcelStyle excelStyle, Boolean flag) {
		this.excelStyle = excelStyle;
		this.flag = flag;
	}

	/**
	 * @param
	 * @name getWorkbook
	 * @active
	 * @state
	 * @type ExcelWrapTextStyle
	 * @time 下午2:52:02
	 * @see org.sagacity.util.excel.style.ExcelStyle#getWorkbook()
	 */
	@Override
	public HSSFWorkbook getWorkbook() {
		return excelStyle.getWorkbook();
	}

	public ExcelStyle getExcelStyle() {
		return excelStyle;
	}

	public void setExcelStyle(ExcelStyle excelStyle) {
		this.excelStyle = excelStyle;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	/**
	 * @param
	 * @name getStyle
	 * @active
	 * @state
	 * @type ExcelWrapTextStyle
	 * @time 下午2:52:02
	 * @see org.sagacity.util.excel.style.ExcelStyle#getStyle()
	 */
	@Override
	public HSSFCellStyle getStyle() {
		HSSFCellStyle style = excelStyle.getStyle();
		if (null == flag) {
			flag = true;
		}
		style.setWrapText(flag);
		return style;
	}

}
