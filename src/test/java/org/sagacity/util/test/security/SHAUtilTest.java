package org.sagacity.util.test.security;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Test;
import org.sagacity.util.security.EncrypSHA;

public class SHAUtilTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testMD5() {
		System.out.println(EncrypSHA.encode("aaasdfsdfffffffffffffffffffff"));
		// 测试两次加密的结果一样
		Assert.assertEquals(EncrypSHA.encode("aaasdfsdfffffffffffffffffffff"), EncrypSHA.encode("aaasdfsdfffffffffffffffffffff"));
		Assert.assertEquals(EncrypSHA.encode("sss"), EncrypSHA.encode("sss"));
		Assert.assertEquals(EncrypSHA.encode("ddd"), EncrypSHA.encode("ddd"));
		Assert.assertEquals(EncrypSHA.encode("aaasss"), EncrypSHA.encode("aaasss"));
		Assert.assertEquals(EncrypSHA.encode("dddfff"), EncrypSHA.encode("dddfff"));
	}

}
