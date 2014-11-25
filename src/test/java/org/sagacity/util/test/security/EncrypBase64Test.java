/*******************************************************
 * @author LIZHITAO
 * @date 2013-9-5 下午3:47:52
 * @name EncrypBase64Test.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.test.security;

import junit.framework.Assert;

import org.junit.Test;
import org.sagacity.util.security.EncrypBase64;

/**
 * @author LIZHITAO
 *
 */
public class EncrypBase64Test {

	@Test
	public void testEncodeString() {
		String str = "aasdfsdfsdfsdf";
		String miwen = EncrypBase64.encode(str);
		Assert.assertEquals(str, EncrypBase64.decode(miwen));
	}

}
