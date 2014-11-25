/*******************************************************
 * @author LIZHITAO
 * @date 2013-9-5 下午2:31:44
 * @name DateTimeUtilTest.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.test.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;
import org.sagacity.util.datetime.DateTimeUtil;

/**
 * @author LIZHITAO  测试DateTimeUtil的类
 * 
 */
public class DateTimeUtilTest {

	@Test
	public void testFormatDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Assert.assertEquals(sdf.format(new Date()),
				DateTimeUtil.formatDate(new Date()));
	}

}
