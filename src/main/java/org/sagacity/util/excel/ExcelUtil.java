/**
 * excel 工具类
 */
package org.sagacity.util.excel;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author LIZHITAO
 * 
 */
public class ExcelUtil {
	/**
	 * 通过jxls生成excel
	 * 
	 * @param
	 * @name generatorExcel
	 * @active
	 * @state
	 * @type void
	 * @time 上午9:35:32
	 * @exception/throws
	 * @see
	 * @since
	 * @param datas
	 *            需要向模版中生成的数据
	 * @param template
	 *            模版全路径名称
	 * @param exportPath
	 *            导出的excel全路径名称
	 */
	public static void generatorExcel(Map<String, Object> datas, String template,
			String exportPath) {
		InputStream is = null;
		try {
			is = new BufferedInputStream(new FileInputStream(template));
			// 关联模板
			XLSTransformer transformer = new XLSTransformer();
			HSSFWorkbook workBook = (HSSFWorkbook) transformer.transformXLS(is,
					datas);
			// 输出excel
			saveExcel(workBook, exportPath);
			is.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * 保存excel文件
	 * 
	 * @param
	 * @name generatorExcel
	 * @active
	 * @state
	 * @type void
	 * @time 上午9:36:59
	 * @exception/throws
	 * @see
	 * @since
	 * @param HSSFWorkbook对象
	 * @param filePath
	 *            保存路径
	 */
	public static void saveExcel(HSSFWorkbook wb, String filePath) {
		try {
			FileOutputStream fout = new FileOutputStream(filePath);
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
