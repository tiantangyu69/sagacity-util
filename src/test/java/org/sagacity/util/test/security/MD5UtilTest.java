package org.sagacity.util.test.security;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Test;
import org.sagacity.util.security.EncrypMD5;

public class MD5UtilTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testMD5() {
		System.out.println(EncrypMD5.encode("aaasdfsdfffffffffffffffffffff"));
		// 测试两次加密的结果一样
		Assert.assertEquals(EncrypMD5.encode("aaasdfsdfffffffffffffffffffff"), EncrypMD5.encode("aaasdfsdfffffffffffffffffffff"));
		Assert.assertEquals(EncrypMD5.encode("sss"), EncrypMD5.encode("sss"));
		Assert.assertEquals(EncrypMD5.encode("ddd"), EncrypMD5.encode("ddd"));
		Assert.assertEquals(EncrypMD5.encode("aaasss"), EncrypMD5.encode("aaasss"));
		Assert.assertEquals(EncrypMD5.encode("dddfff"), EncrypMD5.encode("dddfff"));
	}

}
