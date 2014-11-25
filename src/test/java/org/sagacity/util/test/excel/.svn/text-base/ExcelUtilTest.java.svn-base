package org.sagacity.util.test.excel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.sagacity.util.excel.ExcelUtil;

public class ExcelUtilTest {
	@Test
	public void testStyle() {

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("10.16");

		MergedCell.mergedCell(wb, sheet);

		sheet.createFreezePane(2, 2);// 冻结表头

		ExcelUtil.saveExcel(wb, "E:/施工日进度表.xls");
	}

}
