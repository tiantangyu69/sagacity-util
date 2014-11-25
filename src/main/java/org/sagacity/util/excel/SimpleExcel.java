/*******************************************************
 * @author LIZHITAO
 * @date 2014-2-28 下午3:31:08
 * @name ExcelGenerator.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.excel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author LIZHITAO excel 生成模版方法类
 */
public abstract class SimpleExcel {
	public void exportExcel(String sheetName, Integer colSplit, Integer rowSplit, String filePath) {
		HSSFWorkbook wb = createHSSFWorkbook();// 创建excle
		HSSFSheet sheet = wb.createSheet(sheetName);// 创建sheet
		if(null != colSplit && null != rowSplit){
			sheet.createFreezePane(colSplit, rowSplit);// 冻结excel表格
		}
		setColumnWidth(sheet);// 设置sheet的列宽
		drawCell(wb, sheet);// 绘制表格
		ExcelUtil.saveExcel(wb, filePath);// 保存excel
	}

	/**
	 * 创建workbook对象
	 * 
	 * @param
	 * @name createHSSFWorkbook
	 * @active
	 * @state
	 * @type HSSFWorkbook
	 * @time 下午3:56:34
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public HSSFWorkbook createHSSFWorkbook() {
		return new HSSFWorkbook();
	}

	/**
	 * 设置列宽
	 * 
	 * @name setColumnWidth
	 * @active
	 * @state
	 * @type void
	 * @time 下午3:40:03
	 * @exception/throws
	 * @see
	 * @since
	 * @param sheet
	 *            HSSFSheet对象
	 */
	public abstract void setColumnWidth(HSSFSheet sheet);
	
	/**
	 * 绘制表格
	 * @param 
	 * @name drawCell
	 * @active
	 * @state
	 * @type void
	 * @time 下午4:08:26
	 * @exception/throws
	 * @see
	 * @since
	 * @param wb
	 * @param sheet
	 */
	public abstract void drawCell(HSSFWorkbook wb, HSSFSheet sheet);
}
