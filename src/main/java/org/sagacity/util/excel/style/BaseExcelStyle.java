/*******************************************************
 * @author LIZHITAO
 * @date 2014-2-28 上午9:55:42
 * @name ExcelStyle.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.excel.style;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author LIZHITAO
 * 基础excel cell style
 */
public class BaseExcelStyle implements ExcelStyle {
	private HSSFWorkbook wb;

	public BaseExcelStyle(HSSFWorkbook wb) {
		this.wb = wb;
	}

	@Override
	public HSSFCellStyle getStyle() {
		return wb.createCellStyle();
	}

	@Override
	public HSSFWorkbook getWorkbook() {
		return this.wb;
	}

}
