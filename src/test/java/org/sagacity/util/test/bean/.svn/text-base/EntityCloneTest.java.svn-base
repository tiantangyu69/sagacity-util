package org.sagacity.util.test.bean;

import java.util.Date;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Test;
import org.sagacity.util.bean.EntityClone;
import org.sagacity.util.test.model.User1;
import org.sagacity.util.test.model.User2;

public class EntityCloneTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		User1 u = new User1();
		u.setId(1);
		u.setName("张三");
		u.setAge(22);
		u.setBirthday(new Date());
		
		User2 u2 = new User2();
		
		EntityClone.clone(u, u2);
		Assert.assertEquals(u.getId(), u2.getId());
		Assert.assertEquals(u.getName(), u2.getName());
		Assert.assertEquals(u.getAge(), u2.getAge());
		Assert.assertEquals(u.getBirthday(), u2.getBirthday());
	}

}
