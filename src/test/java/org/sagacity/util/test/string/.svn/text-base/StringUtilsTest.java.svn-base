package org.sagacity.util.test.string;

import junit.framework.Assert;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.sagacity.util.string.StringHelper;

public class StringUtilsTest {
	@Test
	public void test() {
		Assert.assertNotNull(StringUtils.trimToNull("null"));
	}

	@Test
	public void testKeywordNull(){
		Assert.assertNull(StringHelper.keywordNull("null", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull(" null", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull("null ", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull(" ", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull(null, "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull(" null ", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull("请输入关键字进行查询...", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull(" 请输入关键字进行查询...", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull("请输入关键字进行查询... ", "请输入关键字进行查询..."));
		Assert.assertNull(StringHelper.keywordNull(" 请输入关键字进行查询... ", "请输入关键字进行查询..."));
		
		Assert.assertNotNull(StringHelper.keywordNull(" aasdf ", "请输入关键字进行查询..."));
	}
	
	public void testTrimToNull(){
		Assert.assertNull(StringHelper.trimToNull(""));
		Assert.assertNull(StringHelper.trimToNull(" "));
		Assert.assertNull(StringHelper.trimToNull("null"));
		Assert.assertNull(StringHelper.trimToNull(" null"));
		Assert.assertNull(StringHelper.trimToNull("null "));
		Assert.assertNull(StringHelper.trimToNull(" null "));
		Assert.assertNull(StringHelper.trimToNull("    "));
		Assert.assertNull(StringHelper.trimToNull(null));
		
		Assert.assertNotNull(StringHelper.trimToNull("sdfsdf"));
	}
}
